# 📚 Library Book Management - Java Console App

## 📝 Problem Statement

Design a simple Java program to manage a small library system where users can:

1. Add a new book
2. View all books
3. Exit the program

Each book has the following properties:
- **Title**
- **Author**
- **ISBN number**

---

## 📌 Requirements

- Create a `Book` class with the above fields.
- Use an `ArrayList<Book>` to store books.
- Provide a simple menu to interact with the user using the console.
- Use basic Java concepts: classes, loops, conditionals, and collections.
- Keep the data in memory (no need for file/database storage).

---

## 🧪 Sample Interaction

Welcome to the Library System
1. Add Book
2. View All Books
3. Exit
   Enter your choice: 1

Enter book title: Java Basics
Enter author name: John Doe
Enter ISBN: 1234567890
Book added successfully!

1. Add Book
2. View All Books
3. Exit
   Enter your choice: 2

Books in Library:
1. Title: Java Basics, Author: John Doe, ISBN: 1234567890

1. Add Book
2. View All Books
3. Exit
   Enter your choice: 3

Exiting... Goodbye!

---

## ✅ Notes

- You are not expected to build a GUI.
- Keep the code clean and readable.
- Handle user inputs gracefully (e.g., unexpected values).
- You can run the program in any IDE or terminal that supports Java.

---

## 💡 Bonus (Optional)

Try extending the functionality:
- Allow users to remove a book by ISBN.
- Search books by author or title.
- Validate inputs (e.g., ISBN must be numeric).

---

## ✅ Build Notes

- `mvn package`
- `java -jar target\LibraryApp-1.0-SNAPSHOT.jar`

---