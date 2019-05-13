package com.kirilo.training.springlibrary.entities;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Book implements Serializable {
    private Long id;
    private String name;
    private byte[] content;
    private Integer pageCount;
    private String isbn;
    private Long genreId;
    private Long authorId;
    private Integer publishYear;
    private Long publisherId;
    private byte[] image;
    private String description;
    private Integer rating;
    private Long voteCount;
    private com.kirilo.training.springlibrary.entities.Genre genreByGenreId;
    private com.kirilo.training.springlibrary.entities.Author authorByAuthorId;
    private com.kirilo.training.springlibrary.entities.Publisher publisherByPublisherId;
//    private Collection<com.kirilo.training.springlibrary.entities.Vote> votesById;

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

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
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

    public com.kirilo.training.springlibrary.entities.Genre getGenreByGenreId() {
        return genreByGenreId;
    }

    public void setGenreByGenreId(com.kirilo.training.springlibrary.entities.Genre genreByGenreId) {
        this.genreByGenreId = genreByGenreId;
    }

    public com.kirilo.training.springlibrary.entities.Author getAuthorByAuthorId() {
        return authorByAuthorId;
    }

    public void setAuthorByAuthorId(com.kirilo.training.springlibrary.entities.Author authorByAuthorId) {
        this.authorByAuthorId = authorByAuthorId;
    }

    public com.kirilo.training.springlibrary.entities.Publisher getPublisherByPublisherId() {
        return publisherByPublisherId;
    }

    public void setPublisherByPublisherId(com.kirilo.training.springlibrary.entities.Publisher publisherByPublisherId) {
        this.publisherByPublisherId = publisherByPublisherId;
    }

/*    public Collection<com.kirilo.training.springlibrary.entities.Vote> getVotesById() {
        return votesById;
    }

    public void setVotesById(Collection<com.kirilo.training.springlibrary.entities.Vote> votesById) {
        this.votesById = votesById;
    }*/
}
