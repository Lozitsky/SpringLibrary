package com.kirilo.training.springlibrary.objects;

import com.kirilo.training.springlibrary.entities.Author;
import com.kirilo.training.springlibrary.entities.Book;
import com.kirilo.training.springlibrary.interfaces.BookSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("libraryFacade")
@Scope("singleton")
public class LibraryFacade {

    private static final String FIELD_CONTENT = "content";

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

    public void searchBooksByLetter() {
        books = bookSearch.getBooks(searchCriteria.getLetter());
    }

    public void searchBooksByGenre() {
        books = bookSearch.getBooks(searchCriteria.getGenre());
    }

    public void searchBookByText() {
        switch (searchCriteria.getSearchType()) {
            case TITLE:
                books = bookSearch.getBooks(searchCriteria.getText());
                break;
            case AUTHOR:
                books = bookSearch.getBooks(new Author(searchCriteria.getText()));
                break;
/*            default:
                throw new IllegalStateException("Unexpected value: " + searchCriteria.getSearchType());*/
        }
    }

    public byte[] getContent(long id) {
        System.out.println("ID: " + id);
        return bookSearch.getFieldValue(id, FIELD_CONTENT);
    }
}
