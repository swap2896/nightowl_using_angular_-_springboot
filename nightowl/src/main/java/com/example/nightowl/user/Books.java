package com.example.nightowl.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
    private String cover;
    private String website;
    @Id
    private String book_id;
    private String author;
    private String description;
    private String title;
    private String category_id;
    private double isbn;
    private int rating;
    private String type;
    private int pages;

    public Books(){

    }
    public Books(String cover, String website, String book_id, String author, String description, String title, String category_id, double isbn, int rating, String type, int pages) {
        this.cover = cover;
        this.website = website;
        this.book_id = book_id;
        this.author = author;
        this.description = description;
        this.title = title;
        this.category_id = category_id;
        this.isbn = isbn;
        this.rating = rating;
        this.type = type;
        this.pages = pages;
    }


    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public double getIsbn() {
        return isbn;
    }

    public void setIsbn(double isbn) {
        this.isbn = isbn;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }



    @Override
    public String toString() {
        return "Books{" +
                "cover='" + cover + '\'' +
                ", website='" + website + '\'' +
                ", book_id='" + book_id + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", category_id='" + category_id + '\'' +
                ", pages=" + pages +
                ", isbn=" + isbn +
                ", rating=" + rating +
                ", type='" + type + '\'' +
                '}';
    }

    public void setCover(String cover) {
        this.cover = cover;
    }


    public String getCover() {
        return cover;
    }

}
