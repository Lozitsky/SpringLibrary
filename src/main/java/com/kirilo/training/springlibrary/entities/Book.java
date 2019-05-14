package com.kirilo.training.springlibrary.entities;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Book implements Serializable {
    private Long id;
    private Author author;
    private Genre genre;
    private Publisher publisher;
    private String name;
    private byte[] content;
    private Integer pageCount;
    private String isbn;
    //    private Long genreId;
    //    private Long authorId;
//    private Long publisherId;
    private byte[] image;
    private Integer publishYear;
    private String description;
    private Integer rating;
    private Long voteCount;
//    private Collection<com.kirilo.training.springlibrary.entities.Vote> votesById;

    public Book() {
    }

    public Book(Long id, Author author, Genre genre, Publisher publisher, String name, byte[] content, Integer pageCount, String isbn, byte[] image, Integer publishYear, String description, Integer rating, Long voteCount) {
        this.id = id;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.name = name;
        this.content = content;
        this.pageCount = pageCount;
        this.isbn = isbn;
        this.image = image;
        this.publishYear = publishYear;
        this.description = description;
        this.rating = rating;
        this.voteCount = voteCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }

    /*    public Collection<com.kirilo.training.springlibrary.entities.Vote> getVotesById() {
        return votesById;
    }

    public void setVotesById(Collection<com.kirilo.training.springlibrary.entities.Vote> votesById) {
        this.votesById = votesById;
    }*/
}
