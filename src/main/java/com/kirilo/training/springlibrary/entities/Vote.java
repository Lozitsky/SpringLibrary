package com.kirilo.training.springlibrary.entities;

import javax.persistence.*;

@Entity
public class Vote {
    private Long id;
    private Integer value;
    private Long bookId;
    private String username;
    private com.kirilo.training.springlibrary.entities.Book bookByBookId;

    public Vote() {
    }

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value", nullable = true)
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Basic
    @Column(name = "book_id", nullable = false)
    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 100)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vote vote = (Vote) o;

        if (id != null ? !id.equals(vote.id) : vote.id != null) return false;
        if (value != null ? !value.equals(vote.value) : vote.value != null) return false;
        if (bookId != null ? !bookId.equals(vote.bookId) : vote.bookId != null) return false;
        return username != null ? username.equals(vote.username) : vote.username == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id", nullable = false)
    public com.kirilo.training.springlibrary.entities.Book getBookByBookId() {
        return bookByBookId;
    }

    public void setBookByBookId(com.kirilo.training.springlibrary.entities.Book bookByBookId) {
        this.bookByBookId = bookByBookId;
    }
}
