package strategy;

import java.util.ArrayList;

public class WalkBehavior extends MoveBehavior{

    public WalkBehavior(ArrayList<String> newCharacter, int newSpeed) {
        super(newCharacter, newSpeed);
    }

    /**
     * Call the move(boolean) method in parent(MoveBehavior) class with parm false
     * Display the animal character representation in terminal and move it forward
     */
    @Override
    public void move() {
        super.move(false);
    }
    
}
