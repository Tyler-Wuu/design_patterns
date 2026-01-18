package strategy;

import java.util.ArrayList;

public class JumpBehavior extends MoveBehavior{

    public JumpBehavior(ArrayList<String> newCharacter, int newSpeed){
        super(newCharacter, newSpeed);
    }

    /**
     * Call the move(boolean) method in parent(MoveBehavior) class with parm true
     * Display the animal character representation in terminal and move it forward
     * while jumping
     */
    @Override
    public void move() {
        super.move(true);
    }
    
}
