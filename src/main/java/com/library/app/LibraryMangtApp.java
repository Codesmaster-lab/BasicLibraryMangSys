package com.library.app;

import com.library.app.model.Book;

import java.util.ArrayList;

public class LibraryMangtApp {

    private ArrayList<Book> bookArrayList ;
    private static LibraryMangtApp libraryMangtApp = null;

    private LibraryMangtApp()
    {
        bookArrayList = new ArrayList<Book>();
    }

    public static LibraryMangtApp getInstance() {
        if(libraryMangtApp == null)
        {
            return new LibraryMangtApp();
        }
        return libraryMangtApp;
    }

    public void addBook(Book book) {
        for (Book value : this.bookArrayList) {
            if (value.isEqualBook(book))
            {
                System.out.println("Book already exists");
                return;
            }
        }
        bookArrayList.add(book);
        System.out.println("Book added successfully");
    }

    public void removeBook(Book book) {

        int i = 0;
        for(Book value: bookArrayList)
        {
            if(value.isEqualBook(book))
            {
                bookArrayList.remove(i);
                System.out.println("Book removed successfully");
                return ;
            }
            i++;
        }
    }

    public void viewAllBook() {
        int i = 1;
        System.out.println("Books in Library:");
        for(Book value: bookArrayList)
        {
            System.out.println(i + "> Title: " + value.getTitle() + " | Author: " + value.getAuthor() + " | ISBN: " + value.getISBN());
            i++;
        }
    }
}
