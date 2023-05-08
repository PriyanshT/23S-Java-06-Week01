package com.example.week1;

public class Book {
    private int bookID;
    private String bookName, author;
    private double price;
    private boolean isAvailable;

    // constructor
    public Book(int bookID, String bookName, String author, double price, boolean isAvailable) {
        setBookID(bookID);
        setBookName(bookName);
        setAuthor(author);
        setPrice(price);
        setAvailable(isAvailable);
    }

    // getter and setters
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        if(bookID < 0){
            throw new IllegalArgumentException("Book ID cannot ne negative.");
        }
        else{
            this.bookID = bookID;
        }
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if(bookName == null){
            throw new IllegalArgumentException("Book Name cannot be null.");
        }
        else{
            this.bookName = bookName;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return bookID + ": The price of " + bookName + " written by " + author +
                " is $" + price + ". Availability: " + (isAvailable?"Yes":"No");
    }
}
