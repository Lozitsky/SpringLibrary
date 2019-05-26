package com.kirilo.training.springlibrary.interfaces;

import com.kirilo.training.springlibrary.entities.Book;

public interface ShowBook {
    void show(Book book);
    void download(Book book);
    void vote(Book book);
}
