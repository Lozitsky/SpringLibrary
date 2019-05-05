package com.kirilo.training.springlibrary.interfaces;

import com.kirilo.training.springlibrary.objects.Author;
import com.kirilo.training.springlibrary.objects.Book;
import com.kirilo.training.springlibrary.objects.Genre;

import java.util.List;

public interface BookSearch {
    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Character letter);
}
