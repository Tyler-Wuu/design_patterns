package state;

/**
 * @author Tyler Wu
 * Sorry, switching to google style since my other course requires it
 */
public class TV {
  private State HomeState;
  private State NetflixState;
  private State HuluState;
  private State currentState;

  public TV() {
    this.HomeState = new HomeState(this);
    this.NetflixState = new NetflixState(this);
    this.HuluState = new HuluState(this);
    this.currentState = this.HomeState;
  }

  public String pressHomeButton() {
    this.currentState.pressHomeButton();
    return null;
  }

  public String pressNetflixButton() {
    this.currentState.pressNetflixButton();
    return null;
  }

  public String pressHuluButton() {
    this.currentState.pressHuluButton();
    return null;
  }

  public String pressMovieButton() {
    this.currentState.pressMovieButton();
    return null;
  }

  public String pressTVButton() {
    this.currentState.pressTVButton();
    return null;
  }

  public void setState(State state) {
    this.currentState = state;
  }

  public State getHomeState() {
    return this.HomeState;
  }

  public State getNetflixState() {
    return this.NetflixState;
  }

  public State getHuluState() {
    return this.HuluState;
  }

  public void watch(String title) {
      this.currentState.watch(title);
  }

}
