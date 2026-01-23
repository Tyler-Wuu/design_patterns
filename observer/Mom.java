package observer;

import java.util.ArrayList;

/**
 * @author Tyler Wu
 */
public class Mom extends Observer{

    public Mom(ArrayList<Baby> babies){
        super(babies);
    }

    @Override
    public void update(Cry cry, Baby baby){
        if(cry == Cry.ANGRY){
            System.out.println("Mom hugs " + baby.getName());
            baby.receiveLove();
        }else if(cry == Cry.HUNGRY){
            System.out.println("Mom feeds " + baby.getName());
            baby.eat();
        }else if(cry == Cry.WET){
            System.out.println("Mom changes " + baby.getName());
            baby.getChange();
        }
    }
    
}
