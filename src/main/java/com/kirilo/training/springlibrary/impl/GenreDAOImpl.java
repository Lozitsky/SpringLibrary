package com.kirilo.training.springlibrary.impl;

import com.kirilo.training.springlibrary.entities.Genre;
import com.kirilo.training.springlibrary.interfaces.GenreDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class GenreDAOImpl implements GenreDAO {
    @Autowired
    private SessionFactory sessionFactory;

    private List<Genre> genres;


    @Override
    @Transactional
    public Set<Genre> getGenres() {
        List list = sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM genre").addEntity(Genre.class).list();
/*        return genres;
        List list = sessionFactory.getCurrentSession().createCriteria(Genre.class).list();*/
        Set<Genre> genres = new HashSet<Genre>(list);
        return genres;
    }
}
