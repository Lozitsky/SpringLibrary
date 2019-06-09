package com.kirilo.training.springlibrary.impl;

import com.kirilo.training.springlibrary.entities.Author;
import com.kirilo.training.springlibrary.entities.Book;
import com.kirilo.training.springlibrary.entities.Genre;
import com.kirilo.training.springlibrary.interfaces.BookSearch;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import java.util.List;

@Component
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
    @Transactional
    public List<Book> getBooks(Author author) {
        return sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM book LEFT JOIN author a on book.author_id = a.id WHERE a.full_name LIKE ?1").setParameter(1, "%" + author.getFullName() + "%").addEntity(Book.class).list();
    }

    @Override
    @Transactional
    public List<Book> getBooks(Genre genre) {
        return sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM book LEFT JOIN genre g on book.genre_id = g.id WHERE g.name LIKE ?1").setParameter(1, genre.getName()).addEntity(Book.class).list();
    }

    @Override
    @Transactional
    public List<Book> getBooks(String bookName) {
        return sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM book WHERE name LIKE ?1").setParameter(1, "%" + bookName + "%").addEntity(Book.class).list();
    }

    @Override
    @Transactional
    public List<Book> getBooks(Character letter) {
        return sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM book WHERE name LIKE ?1").setParameter(1, letter + "%").addEntity(Book.class).list();
    }

    @Override
    @Transactional
//    https://stackoverflow.com/a/49407671/9586230/
//    https://stackoverflow.com/a/6230895/9586230
    public byte[] getFieldValue(long id, String fieldName) {
        Session session = sessionFactory.getCurrentSession();
        CriteriaQuery<Book> criteriaQuery = session.getCriteriaBuilder().createQuery(Book.class);
        return (byte[]) session.createQuery("select book." + fieldName + " from Book book where book.id = :id").setParameter("id", id).uniqueResult();
    }
}
