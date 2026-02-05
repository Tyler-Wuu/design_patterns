package state;

import java.util.ArrayList;

public abstract class Application {

    protected ArrayList<String> moives;
    protected ArrayList<String> tvShows;

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

    public void displayMovies() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < moives.size(); ++i) {
            temp.append(moives.get(i));
            temp.append("\n");
        }
        System.out.println(temp.toString());
    }

    public void displayTVShows() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < moives.size(); ++i) {
            temp.append(tvShows.get(i));
            temp.append("\n");
        }
        System.out.println(temp.toString());
    }

}

