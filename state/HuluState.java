package state;

import java.util.ArrayList;

public class HuluState extends Application implements State {
    private TV tv;

    public HuluState(TV newTv) {
        this.tv = newTv;
        super.moives = new ArrayList<String>();
        super.tvShows = new ArrayList<String>();
        for (int i = 0; i < 5; ++i) {
            super.moives.add("Hulu Movie #" + i);
            super.tvShows.add("Hulu Show #" + i);
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
