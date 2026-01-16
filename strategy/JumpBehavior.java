package strategy;

import java.util.ArrayList;

public class JumpBehavior extends MoveBehavior{

    public JumpBehavior(ArrayList<String> newCharacter, int newSpeed){
        super(newCharacter, newSpeed);
    }

    @Override
    public void move() {
        super.move(true);
    }
    
}
