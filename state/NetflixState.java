package state;

import java.util.ArrayList;

public class NetflixState extends Application implements State {
    private TV tv;

    public NetflixState(TV newTv) {
        this.tv = newTv;
        super.moives = new ArrayList<String>();
        super.tvShows = new ArrayList<String>();
        for (int i = 0; i < 5; ++i) {
            super.moives.add("Netflix Movie #" + i);
            super.tvShows.add("Netflix Show #" + i);
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
        System.out.println(super.moives.toString());
    }

    @Override
    public void pressTVButton() {
        System.out.println(super.tvShows.toString());
    }
    
}
