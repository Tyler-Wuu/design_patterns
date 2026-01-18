package strategy;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * A class that hold information and contain method about animal's movement
 * Include how long, how fast,
 *  and display the character passed by the animal's child class
 */
public abstract class MoveBehavior {

    private static final int NUM_MOVES = 30;
    private int speed;
    private ArrayList<String> character;

    /**
     * Constructor
     * @param newCharacter the character representation of the animal
     * @param newSpeed how fast the animal will move,
     *  each movement interval of the animal is (200 / speed)ms
     */
    public MoveBehavior(ArrayList<String> newCharacter, int newSpeed){
        this.character = newCharacter;
        this.speed = newSpeed;
    }

    public abstract void move();
    // call the move() method in the child class

    /**
     * Display the animal character representation in terminal and move them forward
     * @param jump true to make the animal move forward and jump in between two moves
     * , false to make the animal character representation move forward
     */
    protected void move(boolean jump){
        if(jump){
            for(int i = 0; i < NUM_MOVES; ++i){
                clear();
                displayCharacter();
                if( (i % 2) == 1 ){
                    System.out.println("\n");
                }
                pushCharacterForward();
                sleep( (200 / speed) );
            }
        }else{
           for(int i = 0; i < NUM_MOVES; ++i){
                clear();
                displayCharacter();
                pushCharacterForward();
                sleep( (200 / speed) );
            }
        }
    }

    private void pushCharacterForward(){
        for(int i = 0; i < character.size(); ++i){
            String temp = character.get(i);
            character.remove(i);
            character.add(i, ("  " + temp) );
        }
    }

    private void displayCharacter(){
        for(int i = 0; i < character.size(); ++i){
            System.out.println(character.get(i));
        }
    }

    /**
     * Pauses the program
     * @param num The miliseconds to pause the program for
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }

    /**
     * Clears the console
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
