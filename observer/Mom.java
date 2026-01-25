package observer;

import java.util.ArrayList;

/**
 * @author Tyler Wu
 * Mom class is an observer, a child class of the observer class, recive update from the Subject
 * passively
 */
public class Mom extends Observer{

    /**
     * Constructor of class Mom
     * @param babies baby to register this instance as the observer 
     */
    public Mom(ArrayList<Baby> babies){
        super(babies);
    }

    /**
     * Method responds to baby's status based on its parameter when being called
     * Mom will call method in Baby class corresponding to the baby's status
     * @param cry status of the baby in Cry enumeration class
     * @param baby which baby dad is notified from
     */
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
