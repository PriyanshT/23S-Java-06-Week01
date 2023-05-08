package com.example.week1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Harry Potter",
                "J. K. Rowling", 20.34, true);
        Book book2 = new Book(2, "A Song of Ice and Fire",
                "George RR Martin", 15.32, false);

        System.out.println(book1);
        System.out.println(book2);
    }
}
