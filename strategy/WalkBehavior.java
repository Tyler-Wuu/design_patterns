package strategy;

import java.util.ArrayList;

public class WalkBehavior extends MoveBehavior{

    public WalkBehavior(ArrayList<String> newCharacter, int newSpeed) {
        super(newCharacter, newSpeed);
    }

    @Override
    public void move() {
        super.move(false);
    }
    
}
