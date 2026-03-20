/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.film;

/**
 *
 * @author Student
 */
class Movie {
    
    private String title;
    private double price;

    // Constructor
    public Movie(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // Display movie info
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: R" + price);
    }
}

// Inheritance of Child Class 
class ActionMovie extends Movie {
    private int rating;

    // Parent Constructor
    public ActionMovie(String title, double price, int rating) {
        super(title, price); 
        this.rating = rating;
    }

    // Method override
    public void display() {
        super.display();
        System.out.println("Rating: " + rating + "/10");
        System.out.println("----------------------");
    }

    public int getRating() {
        return rating;
    }
}

// Main Application
public class Film {

    // Method for unit testing
    public static void runTests() {
        System.out.println("Running Tests...");

        ActionMovie testMovie = new ActionMovie("Test Movie", 50.0, 8);

        // Simple tests
        if (testMovie.getPrice() == 50.0) {
            System.out.println("Price Test Passed");
        } else {
            System.out.println("Price Test Failed");
        }

        if (testMovie.getRating() == 8) {
            System.out.println("Rating Test Passed");
        } else {
            System.out.println("Rating Test Failed");
        }

        System.out.println("======================\n");
    }


}