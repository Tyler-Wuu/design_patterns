package strategy;

import java.util.ArrayList;

/**
 * An parent class hold common data and methods for Bird, Elephant, Rabbit classes
 */
public abstract class Animal {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;  // MoveBehavior is an interface will be initalized with different behavior from the child class
    
    public Animal(String newName){
        this.name = newName;
        this.character = new ArrayList<String>();
    }

    /**
     * Calls the move() method MoveBehavior interface set to 
     */
    public void move(){
        moveBehavior.move();
    }

    public String toString(){
        return this.name;
    }
    
}
