package observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Tyler Wu
 * The observer class
 */
public abstract class Observer {

    protected Random rand;
    
    /**
     * Construtor of class Observer
     * Intialize the variable and register themself as observer to the parm object
     * @param babies array list of baby the observer will register themself to
     */
    public Observer(ArrayList<Baby> babies){
        this.rand = new Random();
        for(Baby baby : babies){
            baby.registerObserver(this);
        }
    }

    public abstract void update(Cry cry, Baby baby);
    
}
