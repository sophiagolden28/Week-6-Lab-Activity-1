/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week.lab.activity1;

/**
 *
 * @author Sound Room
 */
public class Book {

    private String title;
    private String author;
    boolean isBorrowed;

    public Book(String title, String author, boolean isBorrowed) {

        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;

    }

    //Getters for title and author
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    //borrowBook method - sets isBorrowed to true
    public void borrowBook() {

        this.isBorrowed = true;

    }

    //returnBook method - sets isBorrowed to false
    public void returnBook() {

        this.isBorrowed = false;

    }

    //toString method
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Borrowed: " + isBorrowed;
    }

}
