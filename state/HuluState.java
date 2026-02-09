package state;

import java.util.ArrayList;

/**
 * HuluState class, child class of Application and implemet state interface
 * look at the interface to see what method this contain
 */
public class HuluState extends Application implements State {
    private TV tv;

    /**
     * Constructor of the HuluState
     * Will create a list of movie by default
     * Movie's name start with "Hulu Movie #" + a integer < 5
     * Tv's name start with "Hulu Movie #" + a integer < 5
     * @param newTv a TV class that init this object 
     */
    public HuluState(TV newTv) {
        this.tv = newTv;
        super.moives = new ArrayList<String>();
        super.tvShows = new ArrayList<String>();
        for (int i = 0; i < 5; ++i) {
            super.moives.add("Hulu Movie #" + (i + 1) );
            super.tvShows.add("Hulu Show #" + (i + 1) );
        }
    }

    @Override
    public void pressHomeButton() {
        this.tv.setState(this.tv.getHomeState());
        System.out.println("Welcome to Home");
    }

    @Override
    public void pressNetflixButton() {
        this.tv.setState(this.tv.getNetflixState());
        System.out.println("Welcome to Netflix");
    }

    @Override
    public void pressHuluButton() {
        System.out.println("You are already in Hulu");
    }

    @Override
    public void pressMovieButton() {
        super.displayMovies();
    }

    @Override
    public void pressTVButton() {
        super.displayTVShows();
    }
    
}
