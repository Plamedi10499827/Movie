/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movies;

/**
 *
 * @author Student
 */
import java.util.Scanner;

class Movie {
    private String id;
    private String title;
    private double price;

    // Constructor to initialize movie details
    public Movie(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    // Getter methods to access private data
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // Method to display movie details
    public String display() {
        return "ID: " + id + " | Title: " + title + " | Price: R" + price;
    }
}

// Child Class: ActionMovie
// Inherits from Movie class
class ActionMovie extends Movie {
    private int stuntLevel; 

    // Constructor to call parent constructor
    public ActionMovie(String id, String title, double price, int stuntLevel) {
        super(id, title, price);
        this.stuntLevel = stuntLevel;
    }

    // Override display method to include stunt level
    public String display() {
        return super.display() + " | Stunt Level: " + stuntLevel;
    }
}

// Main Class
public class MainApp {

    // Array to store movie objects
    static Movie[] movies = new Movie[5];

    // Counter to keep track of number of movies
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // Loop system
        do {
            System.out.println("\n=== MOVIE SYSTEM ===");
            System.out.println("1. Add Movie");
            System.out.println("2. View Report");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            choice = sc.nextInt();

            // Switch to handle user choice
            switch (choice) {
                case 1:
                    addMovie(sc); 
                    break;
                case 2:
                    displayReport(); 
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            // repeat until user exits
        } while (choice != 0); 
    }

    // Method to add a movie
    public static void addMovie(Scanner sc) {

        // Check if array is full
        if (count >= movies.length) {
            System.out.println("Array is full!");
            return;
        }

        sc.nextLine(); 

        // Get user input
        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stunt Level: ");
        int stunt = sc.nextInt();

        // Create object and store in array
        movies[count] = new ActionMovie(id, title, price, stunt);
        count++; // increase count

        System.out.println("Movie added!");
    }

    // Method to display report
    public static void displayReport() {
        System.out.println("\n=== MOVIE REPORT ===");

        // Loop through array and display each movie
        for (int i = 0; i < count; i++) {
            System.out.println(movies[i].display());
        }
    }
}
