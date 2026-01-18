package strategy;

import java.util.ArrayList;

/**
 * A parent class for Bird, Elephant, and Rabbit classes. 
 * Include the name of that animal, a string display(character) of that animal,
 *  and the way the animal moves
 */
public abstract class Animal {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;  
    // MoveBehavior is an interface that will be initialized with different behavior from the child class
    
    public Animal(String newName){
        this.name = newName;
        this.character = new ArrayList<String>();
    }

    /**
     * Move the animal displayed on the terminal forward for some distance
     * Calls the move() method MoveBehavior interface set by the child class
     */
    public void move(){
        moveBehavior.move();
    }

    public String toString(){
        return this.name;
    }
    
}
