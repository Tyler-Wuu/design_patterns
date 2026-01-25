package observer;

import java.util.ArrayList;

/**
 * @author Tyler Wu
 * Dad class is a observer, a child class of the observer class, recive update from the Subject
 * passively
 */
public class Dad extends Observer{

    /**
     * Constructor of class Dad
     * @param babies baby to register this instance as the observer 
     */
    public Dad(ArrayList<Baby> babies){
        super(babies);
    }

    /**
     * Method respond to baby's status based on it's parameter when being called
     * However, dad does not take care baby by doing his thing
     * @param cry status of the baby in Cry enumeration class
     * @param baby which baby dad is notified from
     */
    @Override
    public void update(Cry cry, Baby baby){
        switch(this.rand.nextInt(2)){
          case 0:
            System.out.println("Dad puts a pillow over his head");
            break;
          case 1:
            System.out.println("Dad nudges mom");
            break;
          case 2:
            System.out.println("Dad screams....aaaaaaaaa");
            break;
          default:
            System.out.println("How?");
            System.exit(1);
        }
    }
}
