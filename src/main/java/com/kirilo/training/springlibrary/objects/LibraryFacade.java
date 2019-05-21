package com.kirilo.training.springlibrary.objects;

import com.kirilo.training.springlibrary.entities.Book;
import com.kirilo.training.springlibrary.interfaces.BookSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LibraryFacade {
    private BookSearch bookSearch;

    private List<Book> books;

    @Autowired
    public void setBookSearch(@Qualifier("bookDAOImpl") BookSearch bookSearch) {
        this.bookSearch = bookSearch;
        books = bookSearch.getBooks();
    }

    public List<Book> getBooks() {
        return books;
    }
}
