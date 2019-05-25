package com.kirilo.training.springlibrary.objects;

import com.kirilo.training.springlibrary.entities.Book;
import com.kirilo.training.springlibrary.interfaces.BookSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("singleton")
public class LibraryFacade {
    @Qualifier("bookDAOImpl")
    @Autowired
    private BookSearch bookSearch;

    @Autowired
    private SearchCriteria searchCriteria;

    private List<Book> books;

//    @Autowired
//    public void setBookSearch(@Qualifier("bookDAOImpl") BookSearch bookSearch) {
////        this.bookSearch = bookSearch;
////        books = bookSearch.getBooks();
////    }

    public List<Book> getBooks() {
        if (books == null) {
            books = bookSearch.getBooks();
        }
        return books;
    }

    public void searchBooksByLetter(){
        books = bookSearch.getBooks(searchCriteria.getLetter());
    }
}
