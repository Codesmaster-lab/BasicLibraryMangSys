package com.library.app.model;

import java.util.Objects;

public class Book {
    private String title;
    private String ISBN;
    private String author;

    public Book(String author, String title, String ISBN)
    {
        this.author = author;
        this.ISBN = ISBN;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isEqualBook(Book book)
    {
        return Objects.equals(book.getAuthor(), this.author)
                && Objects.equals(book.getISBN(), this.ISBN)
                && Objects.equals(book.getTitle(), this.title);
    }

}
