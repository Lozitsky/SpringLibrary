package com.kirilo.training.springlibrary.entities;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Publisher implements Serializable {
    private Long id;
    private String name;
//    private Collection<com.kirilo.training.springlibrary.entities.Book> booksById;

    public Publisher() {
    }

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

/*    public Collection<com.kirilo.training.springlibrary.entities.Book> getBooksById() {
        return booksById;
    }

    public void setBooksById(Collection<com.kirilo.training.springlibrary.entities.Book> booksById) {
        this.booksById = booksById;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher)) return false;

        Publisher publisher = (Publisher) o;

        if (id != null ? !id.equals(publisher.id) : publisher.id != null) return false;
        return name != null ? name.equals(publisher.name) : publisher.name == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return name;
    }
}
