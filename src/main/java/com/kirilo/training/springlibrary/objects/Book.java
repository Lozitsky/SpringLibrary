package com.kirilo.training.springlibrary.objects;

public class Book {
    private Author author;
    private Genre genre;
    private Publisher publisher;
    private String name;
    private byte[] content;
    private Integer pageCount;
    private String isbn;
    private Integer publishYear;
    private byte[] image;
    private String descriptor;
    private Integer rating;
    private Long voteCount;

    public Book(Author author, Genre genre, Publisher publisher, String name, byte[] content, Integer pageCount, String isbn, Integer publishYear, byte[] image, String descriptor, Integer rating, Long voteCount) {
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.name = name;
        this.content = content;
        this.pageCount = pageCount;
        this.isbn = isbn;
        this.publishYear = publishYear;
        this.image = image;
        this.descriptor = descriptor;
        this.rating = rating;
        this.voteCount = voteCount;
    }

    public Book() {
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

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
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
}
