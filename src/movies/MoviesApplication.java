package movies;
import util.Input;

public class MoviesApplication {
    public static void getAllMoviesFromCategory(String category, Movie[] movies){
        for (Movie movie : movies){
            String name = movie.getName();
            if (category.equals(movie.getCategory())){
                System.out.printf("%s -- %s%n", name, category);
            }
        }
    }
    public static Movie[] addMovie(Movie newMovie, Movie[] movies) {
        Movie[] newMovieArray;
        newMovieArray = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length - 1; i++) {
            newMovieArray[i] = movies[i];
        }
        newMovieArray[newMovieArray.length - 1] = newMovie;

        return newMovieArray;
    }

    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        String userChoice = "-1";
        // while loop will keep iterating until the userChoice is equals to 0
        while (!userChoice.equals("0")) {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the Sci-fi category");
            System.out.println("6 - add a movie to the list");
            userChoice = input.getString("Enter your choice:");

            /* the switch statement will match the value of
             each case to the conditional expression and execute the code
            within the case that matches the expression */
            switch(userChoice) {
                case "0":
                    break;
                case "1":
                    for (Movie movie : movies){
                        String name = movie.getName();
                        String category = movie.getCategory();
                        System.out.printf("%s -- %s%n", name, category);
                    }
                    break;
                case "2":
                    getAllMoviesFromCategory("animated", movies);
                    break;
                case "3":
                    getAllMoviesFromCategory("drama", movies);
                    break;
                case "4":
                    getAllMoviesFromCategory("horror", movies);
                    break;
                case "5":
                    getAllMoviesFromCategory("scifi", movies);
                    break;
                case "6":
                    String title = input.getString("Enter the name of the movie: ");
                    String category = input.getString("Enter the category: ");
                    Movie newMovie = new Movie(title, category);
                    movies = addMovie(newMovie, movies);
                    break;
                default:
                    System.out.println("Be smarter. Follow Directions.");
            } // switch statement end here

        } // while loop end here

    } // main method end here
}
