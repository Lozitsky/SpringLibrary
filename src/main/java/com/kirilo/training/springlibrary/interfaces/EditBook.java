package com.kirilo.training.springlibrary.interfaces;

import com.kirilo.training.springlibrary.entities.Book;

public interface EditBook {
    boolean save(Book book);
    boolean delete(Book book);
    boolean edit(Book book);
    boolean add(Book book);
}
