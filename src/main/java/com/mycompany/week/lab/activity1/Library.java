/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week.lab.activity1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Sound Room
 */
public class Library {

    //book array creation
    Book[] libraryArray;

    //constructor
    public Library(Book[] book) {

        //initializing the array to take in the book array
        libraryArray = book;

    }

    //borrowBook method - searches for the book by its title, checks if it's available, and sets it as borrowed if it is
    public void borrowBook(String title) {

        boolean isInLibrary = false;

        //index to keep track of where the book is so we know what to set isBorrowed to true of
        int index = 0;

        //if it's in the library - loop through the array
        for (int i = 0; i < libraryArray.length; i++) {

            if (libraryArray[i] != null) {

                //if there's an element with a title that matches the title
                if (title.equalsIgnoreCase(libraryArray[i].getTitle())) {

                    isInLibrary = true;
                    index = i;

                    //break just in case
                    break;

                }

            }

        }

        //if the book's in the library 
        if (isInLibrary == true) {

            //if it's alreaady checked out
            if (libraryArray[index].isBorrowed == true) {

                System.out.println("\n" + title + " has already been checked out.");

            } else {

                //if not we set isborrowed to true
                libraryArray[index].borrowBook();
                System.out.println("\n" + libraryArray[index].getTitle() + " has been borrowed.");

            }

        } else {

            //if it's not in the library
            System.out.println("\n" + title + " is not in this library.");

        }

    }

    //returnBook method - searches for a book by its title and sets it as returned
    public void returnBook(String title) {

        boolean isInLibrary = false;

        //index to keep track of where the book is so we know what to set isBorrowed to true of
        int index = 0;

        //if it's in the library - loop through the array
        for (int i = 0; i < libraryArray.length; i++) {

            //if there's an element with a title that matches the title
            if (title.equalsIgnoreCase(libraryArray[i].getTitle())) {

                isInLibrary = true;
                index = i;

                //break just in case
                break;

            }

        }

        //if the book's in the library we say so and set is borrowed to false
        if (isInLibrary == true) {

            //if it's not checked out
            if (libraryArray[index].isBorrowed == false) {

                System.out.println("\n" + title + " is not checked out and cannot be returned");

            } else {

                //if it's checked out we return it
                libraryArray[index].returnBook();
                System.out.println("\n" + libraryArray[index].getTitle() + " has been returned.");
            }

        } else {

            System.out.println("\n" + title + " does not belong to this library.");

        }

    }

    //list books method - to display all the library books and their current borrow status
    public void listBooks() {

        //start with a message
        System.out.println("\nBooks in the library:");

        //for each book print its title and borrowed status
        for (Book libraryArray1 : libraryArray) {
            //if it's not null (that could happen if we increase the size of the library
            if (libraryArray1 != null) {
                System.out.println("    " + libraryArray1.toString());
            }
        }

    }

    //to keep track of if the library is full
    public boolean isLibraryFull() {

        boolean full = false;

        //full spots to keep track
        int fullSpots = 0;

        //for each book in books
        for (Book book : libraryArray) {
            //if there's a full spot
            if (book != null) {
                //increment the fullSpots variable
                fullSpots += 1;
            }
        }

        //if there are no empty spots
        if (fullSpots >= libraryArray.length) {
            full = true;
        }

        return full;

    }

    //add book method - accepts a Book object and adds it to libraryArray - if the array is full, create a new one that is bigger
    public void addBook(Book newBook) {

        if (this.isLibraryFull() == true) {
            //modifying so that the library is never full
            double newLibraryLength;
            newLibraryLength = (int) Math.ceil(libraryArray.length * 1.5);
            libraryArray = Arrays.copyOf(libraryArray, (int) newLibraryLength);
        }

        //add the book to the first available spot
        for (int i = 0; i < libraryArray.length; i++) {

            //if spot at that spot is empty...
            if (libraryArray[i] == null) {
                //make the book that spot in the array
                libraryArray[i] = newBook;

                //say it has been added
                System.out.println("\n" + newBook.getTitle() + " has been added to the library.");

                //kill the loop after adding the book
                break;
            }

        }

    }

    //searchByTitle method - returns the book that matches the given title if found
    public Book searchByTitle(String title) {

        //to keep track of where the book is in the index
        int index = 0;
        
        //to keep track if it's in the library
        boolean isInLibrary = false;

        //looping through the array to see if the book is there
        for (int i = 0; i < libraryArray.length; i++) {

            if (libraryArray[i] != null) {
                
                //if any one of the book titles matches the title given, it's in the library
                if (libraryArray[i].getTitle().equalsIgnoreCase(title)) {

                    index = i;
                    isInLibrary = true;
                    break;

                } else {
                    index = 0;
                }
            }

        }

        //if it's in the library we return the book
        if (isInLibrary == true) {

            System.out.println("\nBook found: ");
            return libraryArray[index];

        } else {

            System.out.println("\nThere are no books called " + title + " in this library. Search returned: ");

            //if not we return null
            return null;

        }

    }

    //searchByAuthor method - returns the book that matches the given author if found
    public ArrayList searchByAuthor(String author) {

        //make a new array list to loop through the library and get all the indices of the books together
        ArrayList<Book> worksByAuthor = new ArrayList<>(Arrays.asList());

        //to keep track of where the books are in the index
        //i have never used an array list before but it seems to work the way i want it to 
        //so i chose to use one
        ArrayList<Integer> indices = new ArrayList<>(Arrays.asList());

        //looping through the array to see if the book is there
        for (int i = 0; i < libraryArray.length; i++) {

            if (libraryArray[i] != null) {

                //if any one of the book titles matches the title given, it's in the library
                if (libraryArray[i].getAuthor().equalsIgnoreCase(author)) {

                    indices.add(i);

                } 
            }

        }

        //if there's at least one book in the index list we add them all to the works
        if (indices.size() > 0) {

            for (int i = 0; i < indices.size(); i++) {

                worksByAuthor.add(libraryArray[indices.get(i)]);

            }

            //we tell them
            System.out.println("\nBooks by " + author + ":");

        } else {
            
            //tell them no books if not any books
            System.out.println("\nThere are no books by " + author + " in this library. Search returned:");

        }

        //return the list empty or not
        return worksByAuthor;

    }

    //countAvailableBooks method - returns the number of books that are currently available in the library
    public int countAvailableBooks() {

        //tracker to see how many books there are
        int numBooks = 0;

        //any time in the array that it's not a null the tracker goes up by one
        for (int i = 0; i < libraryArray.length; i++) {

            if (libraryArray[i] != null) {

                if (libraryArray[i].isBorrowed == false) {

                    numBooks += 1;

                }

            }

        }

        return numBooks;

    }

}
