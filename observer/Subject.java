package observer;

/**
 * A subject interface
 * @author Tyler Wu
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(Cry cry);
}