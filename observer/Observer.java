package observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Tyler Wu
 */
public abstract class Observer {

    protected Random rand;
    

    public Observer(ArrayList<Baby> babies){
        this.rand = new Random();
        for(Baby baby : babies){
            baby.registerObserver(this);
        }
    }

    public abstract void update(Cry cry, Baby baby);
    
}
