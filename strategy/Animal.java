package strategy;

import java.util.ArrayList;

/**
 * An parent class for Bird, Elephant, Rabbit classes. 
 * Include the name, a string display(character), and the way how the animal move
 */
public abstract class Animal {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;  
    // MoveBehavior is an interface will be initalized with different behavior from the child class
    
    public Animal(String newName){
        this.name = newName;
        this.character = new ArrayList<String>();
    }

    /**
     * Move the animal displayed on the terminal forward for some distance
     * Calls the move() method MoveBehavior interface set to by the child class
     */
    public void move(){
        moveBehavior.move();
    }

    public String toString(){
        return this.name;
    }
    
}
