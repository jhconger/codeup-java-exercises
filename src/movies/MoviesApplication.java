package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {

        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n");
        System.out.println("1 - view all movies\n");
        System.out.println("2 - view movies in the animated category\n");
        System.out.println("3 - view movies in the drama category\n");
        System.out.println("4 - view movies in the horror category\n");
        System.out.println("5 - view movies in the scifi category\n");
        System.out.println("6 - view movies in the comedy category");

        allMovies();

    }

    public static void allMovies() {
        Input movieScanner = new Input();
        System.out.println("Enter your choice: ");
        int userInput = movieScanner.getInt();

        switch (userInput) {
            case 0:
                System.out.println("Okay... bye.");
                MoviesArray.findAll();
                break;
            case 1:
                System.out.println("All? You got it!");
                for (Movie movie : movies) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
                allMovies();
                break;
            case 2:
                System.out.println("Animated... sweet! Coming right up!");
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                allMovies();
                break;
            case 3:
                System.out.println("Drama, what a sad day!");
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                allMovies();
                break;
            case 4:
                System.out.println("SPOOKY SEASON, Horror!");
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                allMovies();
                break;
            case 5:
                System.out.println("To infinity, and beyond... to Sci-Fi!");
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                allMovies();
                break;
            case 6:
                System.out.println("Comedy, ha... okay.");
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("comedy")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                allMovies();
                break;
        }
    }
}