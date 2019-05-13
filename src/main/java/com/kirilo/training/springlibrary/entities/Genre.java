package com.kirilo.training.springlibrary.entities;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Genre implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Long parent;

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    private Collection<com.kirilo.training.springlibrary.entities.Book> booksById;

    public Collection<com.kirilo.training.springlibrary.entities.Book> getBooksById() {
        return booksById;
    }

    public void setBooksById(Collection<com.kirilo.training.springlibrary.entities.Book> booksById) {
        this.booksById = booksById;
    }
}
