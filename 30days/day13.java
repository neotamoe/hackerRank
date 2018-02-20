// Day 13: Abstract Classes
// Given a Book class and a Solution class, write a MyBook class that does the following:

// * Inherits from Book
// * Has a parameterized constructor taking these 3 parameters:
//  1. string title
//  2. string author
//  3. int price
// * Implements the Book class' abstract display() method so it prints these 3 lines:
//  1. Title:, a space, and then the current instance's title.
//  2. Author:, a space, and then the current instance's author.
//  3. Price:, a space, and then the current instance's price.
// Note: Because these classes are being written in the same file, you must not use an access modifier (e.g.: ) when declaring MyBook or your code will not execute.


import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book {
// Declare the price instance variable
    int price;
    /**
    *   Class Constructor
    *
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }
    /**
    *   Method Name: display
    *
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
// End class

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
