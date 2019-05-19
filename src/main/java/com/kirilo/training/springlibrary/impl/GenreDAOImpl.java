package com.kirilo.training.springlibrary.impl;

import com.kirilo.training.springlibrary.entities.Genre;
import com.kirilo.training.springlibrary.interfaces.GenreDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class GenreDAOImpl implements GenreDAO {
    @Autowired
    private SessionFactory sessionFactory;

    private List<Genre> genres;


    @Override
    @Transactional
    public List<Genre> getGenres() {
        genres = sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM genre").addEntity(Genre.class).list();
        return genres;
    }
}
