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

    public Author(String fullName) {
        this.fullName = fullName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;

        if (id != null ? !id.equals(author.id) : author.id != null) return false;
        if (fullName != null ? !fullName.equals(author.fullName) : author.fullName != null) return false;
        return birthday != null ? birthday.equals(author.birthday) : author.birthday == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
