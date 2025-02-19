/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week.lab.activity1;

/**
 *
 * @author Sound Room
 */
public class LibraryMain {

    public static void main(String[] args) {

        //library array creation
        Book[] libraryBooks = new Book[5];

        //book creation 
        Book book1 = new Book("1984", "George Orwell", false);
        Book book2 = new Book("Jane Eyre", "Charlotte Bronte", false);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", false);
        Book book4 = new Book("Little Women", "Louisa May Alcott", false);
        Book book5 = new Book("Pride and Prejudice", "Jane Austen", false);
        Book newBook = new Book("Around the Table", "Jonathan Case", false);
        Book newBook2 = new Book("Animal Farm", "George Orwell", false);
        Book newBook3 = new Book("Burmese Days", "George Orwell", false);
        Book newBook4 = new Book("Homage to Catalonia", "George Orwell", false);

        //filling the array
        libraryBooks[0] = book1;
        libraryBooks[1] = book2;
        libraryBooks[2] = book3;
        libraryBooks[3] = book4;
        libraryBooks[4] = book5;

        //create library object
        Library myLibrary = new Library(libraryBooks);

        //Demonstrate the functionality of the Library class:
        //Borrow a book from the library by title
        myLibrary.borrowBook("1984");

        //Try to borrow a book that has already been borrowed.
        myLibrary.borrowBook("1984");

        //Return a book to the library.
        myLibrary.returnBook("1984");

        //List all books in the library to check their borrow status.
        myLibrary.listBooks();

        //Add a new book to the library using the addBook method.
        myLibrary.addBook(newBook);

        //List the updated collection of books after adding the new book.
        myLibrary.listBooks();

        //Borrow a book
        myLibrary.borrowBook("Jane Eyre");

        //List the updated collection
        myLibrary.listBooks();

        //Try to borrow a book that is not in the library
        myLibrary.borrowBook("The Importance of Being Earnest");

        //Finding a book that matches the given title 
        System.out.println(myLibrary.searchByTitle("Little Women"));

        //Trying to find a book that is not in the library
        System.out.println(myLibrary.searchByTitle("Ender's Game"));

        //Trying to find a book that is in the library
        System.out.println(myLibrary.searchByTitle("To Kill a Mockingbird"));
        
        //Adding more books by a certain author
        myLibrary.addBook(newBook2);
        myLibrary.addBook(newBook3);
        myLibrary.addBook(newBook4);

        //Searching for books by a not-in-library author
        System.out.println(myLibrary.searchByAuthor("J.K. Rowling"));
        
        //Searching for books by a certain author
        System.out.println(myLibrary.searchByAuthor("George Orwell"));
        
        //Counting the available books
        System.out.println("\nThere are " + myLibrary.countAvailableBooks() + " books currently available.");

    }

}
