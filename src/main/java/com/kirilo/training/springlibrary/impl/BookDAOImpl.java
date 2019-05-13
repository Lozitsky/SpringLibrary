package com.kirilo.training.springlibrary.impl;

import com.kirilo.training.springlibrary.entities.Book;
import com.kirilo.training.springlibrary.interfaces.BookSearch;
import com.kirilo.training.springlibrary.objects.Author;
import com.kirilo.training.springlibrary.objects.Genre;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class BookDAOImpl implements BookSearch {
    @Autowired
    private SessionFactory sessionFactory;

    private List<Book> books;

    //    https://stackoverflow.com/questions/14423664/hibernate-get-list-from-database
    @Transactional
    @Override
    public List<Book> getBooks() {
        books = sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM book").addEntity(Book.class).list();
        return books;
    }

    @Override
    public List<Book> getBooks(Author author) {
        return null;
    }

    @Override
    public List<Book> getBooks(Genre genre) {
        return null;
    }

    @Override
    public List<Book> getBooks(String bookName) {
        return null;
    }

    @Override
    public List<Book> getBooks(Character letter) {
        return null;
    }
}
