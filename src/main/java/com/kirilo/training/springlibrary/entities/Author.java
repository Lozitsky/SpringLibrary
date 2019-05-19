package com.kirilo.training.springlibrary.entities;

import javax.persistence.Entity;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Author implements Serializable {
    private Long id;
    private String fullName;
    private Date birthday;
    private Collection<Book> booksById;

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Collection<com.kirilo.training.springlibrary.entities.Book> getBooksById() {
        return booksById;
    }

    public void setBooksById(Collection<com.kirilo.training.springlibrary.entities.Book> booksById) {
        this.booksById = booksById;
    }
}
