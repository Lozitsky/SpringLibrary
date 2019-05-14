package com.kirilo.training.springlibrary.impl;

import com.kirilo.training.springlibrary.entities.Book;
import com.kirilo.training.springlibrary.interfaces.BookSearch;
import com.kirilo.training.springlibrary.objects.Author;
import com.kirilo.training.springlibrary.objects.Genre;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class LibraryDAOImpl implements BookSearch {
    @Autowired
    private SessionFactory sessionFactory;

    private ProjectionList projectionList;

    public LibraryDAOImpl() {
        projectionList = Projections.projectionList();
        projectionList.add(Projections.property("id"), "id");
        projectionList.add(Projections.property("name"), "name");
//        projectionList.add(Projections.property("content"), "content");
        projectionList.add(Projections.property("image"), "image");
        projectionList.add(Projections.property("genre"), "genre");
        projectionList.add(Projections.property("pageCount"), "pageCount");
        projectionList.add(Projections.property("isbn"), "isbn");
        projectionList.add(Projections.property("publisher"), "publisher");
        projectionList.add(Projections.property("author"), "author");
        projectionList.add(Projections.property("publishYear"), "publishYear");
        projectionList.add(Projections.property("description"), "description");
        projectionList.add(Projections.property("rating"), "rating");
        projectionList.add(Projections.property("voteCount"), "voteCount");

    }

    @Transactional
    @Override
    public List<Book> getBooks() {
        DetachedCriteria criteria = DetachedCriteria.forClass(Book.class, "b");
        createAliases(criteria);
        List<Book> bookList = createBookList(criteria);
        return bookList;
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

    private void createAliases(DetachedCriteria detachedCriteria) {
        detachedCriteria.createAlias("b.author", "author");
        detachedCriteria.createAlias("b.genre", "genre");
        detachedCriteria.createAlias("b.publisher", "publisher");
    }

    private List<Book> createBookList(DetachedCriteria detachedCriteria) {
        Criteria criteria = detachedCriteria.getExecutableCriteria(sessionFactory.getCurrentSession());
        criteria.addOrder(Order.asc("b.name")).setProjection(projectionList).setResultTransformer(Transformers.aliasToBean(Book.class));
        return criteria.list();
    }
}
