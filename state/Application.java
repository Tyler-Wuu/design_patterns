package state;

import java.util.ArrayList;

/**
 * Application class, represent what NetflixState and HuluState must contain
 * Contain the field moview, tvShows for NetflixState and HuluState
 * Also method such as watch, displayMovies(), displayTVShows()
 */
public abstract class Application {

    protected ArrayList<String> moives;
    protected ArrayList<String> tvShows;

    /**
     * Watch a move or tv show if they exist in this application
     * if no, return a massage that state it does not exist
     * @param title the title of the movie or string in String type
     */
    public void watch(String title) {
        for (int i = 0; i < moives.size(); ++i) {
            if ( title.toLowerCase().compareTo( moives.get(i).toLowerCase() ) == 0 ) { 
                System.out.println("Watching " + title + " ......");
                return;
            }
        }

        for (int i = 0; i < tvShows.size(); ++i) {
            if ( title.toLowerCase().compareTo( tvShows.get(i).toLowerCase() ) == 0 ) { 
                System.out.println("Watching " + title + " ......");
                return;
            }
        }

        System.out.println("There is no " + title +
         " exist in this application, please choose a different program");
    }

    /**
     * print out the list of movies, each movie is sperate by "\n"
     */
    public void displayMovies() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < moives.size(); ++i) {
            temp.append( moives.get(i) );
            temp.append("\n");
        }
        System.out.println( temp.toString() );
    }

    /**
     * print out the list of tv shows, each movie is sperate by "\n"
     */
    public void displayTVShows() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < moives.size(); ++i) {
            temp.append( tvShows.get(i) );
            temp.append("\n");
        }
        System.out.println( temp.toString() );
    }

}

