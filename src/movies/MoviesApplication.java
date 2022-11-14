package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    static Input input = new Input();
    static Movie[] allMovies = MoviesArray.findAll();

    public static void filter(Movie[] movies, String category) {
        System.out.println();
        for (int i = 0; i < movies.length; i ++) {
            if (movies[i].getCategory().equals(category) || category.equals("all")) {
                System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
            }
        }
        System.out.println();
    }

    public static String getNewMovieName() {
        return input.getString("Please enter the movie name.");
    }

    public static String getNewMovieCategory() {
        String message = "Please enter the movie category.\n" +
                "1-animated, 2-drama, 3-horror, or 4-scifi\n";
        int c = input.getInt(1, 4, message);
        switch (c) {
            case 1: return "animated";
            case 2: return "drama";
            case 3: return "horror";
            default: return "scifi";
        }
     }

    public static Movie[] addMovie(Movie[] movies, Movie movie) {
        Movie[] newArray = new Movie[movies.length+1];
        System.arraycopy(movies, 0, newArray, 0, movies.length);
        newArray[movies.length] = movie;
        return newArray;
    }

    public static void main(String[] args) {
        int selection = -1;
        while (selection != 0) {
            String menu = "What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movie s in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add a new movie\n" +
                    "\n" +
                    "Enter your choice: ";
            selection = input.getInt(0, 6, menu);
            switch (selection) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    filter(allMovies, "all");
                    break;
                case 2:
                    filter(allMovies, "animated");
                    break;
                case 3:
                    filter(allMovies, "drama");
                    break;
                case 4:
                    filter(allMovies, "horror");
                    break;
                case 5:
                    filter(allMovies, "scifi");
                    break;
                case 6:
                    String newName = getNewMovieName();
                    String newCat = getNewMovieCategory();
                    Movie newMovie = new Movie(newName, newCat);
                    allMovies = addMovie(allMovies, newMovie);
            }
        }
    }
}
