package state;

public class HomeState extends Application implements State {
    private TV tv;

    public HomeState(TV newTv) {
        this.tv = newTv;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("You are already in Home");
    }

    @Override
    public void pressNetflixButton() {
        this.tv.setState(this.tv.getNetflixState());
        System.out.println("Welcome to Netflix");
    }

    @Override
    public void pressHuluButton() {
        this.tv.setState(this.tv.getHuluState());
        System.out.println("Welcome to Hulu");
    }

    @Override
    public void pressMovieButton() {
        System.out.println("There is no movie to watch");
    }

    @Override
    public void pressTVButton() {
        System.out.println("There is no TV to watch");
    }

    @Override
    public void watch(String title) {
        System.out.println("There is no program to watch");
    }
    
}
