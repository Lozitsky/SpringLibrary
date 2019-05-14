package com.kirilo.training.springlibrary.entities;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Genre implements Serializable {
    private Long id;
    private String name;
    private Long parent;
    private Collection<Book> booksById;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Collection<Book> getBooksById() {
        return booksById;
    }

    public void setBooksById(Collection<Book> booksById) {
        this.booksById = booksById;
    }
}
