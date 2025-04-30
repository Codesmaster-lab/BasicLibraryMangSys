package com.library.app;

import com.library.app.model.Book;

import java.util.Scanner;

/**
 * Starting of Library Management App
 * Simple example of Singleton class usage
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LibraryMangtApp libraryMangtApp = LibraryMangtApp.getInstance();
        Integer input = 0;
        Scanner sc = new Scanner(System.in);
        while(input != 4){
            System.out.println( "Welcome to Simple Library Management System" );
            System.out.print( "1. Add Book\n" +
                    "2. View All Books\n" +
                    "3. Remove a Book\n" +
                    "4. Exit\n" +
                    "   Enter your choice: " );
            input = sc.nextInt();

            if(input == 1)
            {
                        System.out.println("Enter book title: ");
                        String title = sc.next();
                        System.out.println("Enter author name: ");
                        String author = sc.next();
                        System.out.println("Enter ISBN: ");
                        String ISBN = sc.next();
                libraryMangtApp.addBook(new Book(author, title, ISBN));
            }
            else if (input == 2 )
            {
                libraryMangtApp.viewAllBook();
            }
            else if (input == 3)
            {
                System.out.println("Enter book title: ");
                String title = sc.next();
                System.out.println("Enter author name: ");
                String author = sc.next();
                System.out.println("Enter ISBN: ");
                String ISBN = sc.next();
                libraryMangtApp.removeBook(new Book(author,title,ISBN));
            }
        }
        System.out.println("--------------------------------------------------------");


    }
}
