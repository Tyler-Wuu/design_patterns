package state;

/**
 * State interface
 * contain press button methods that TV class hold and the watch method
 */
public interface State {
    public void pressHomeButton();
    public void pressNetflixButton();
    public void pressHuluButton();
    public void pressMovieButton();
    public void pressTVButton();
    public void watch(String title);
}
