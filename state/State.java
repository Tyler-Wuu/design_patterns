package state;

public interface State {
    int myID = 0;
    public void pressHomeButton();
    public void pressNetflixButton();
    public void pressHuluButton();
    public void pressMovieButton();
    public void pressTVButton();
    public void watch(String title);
}
