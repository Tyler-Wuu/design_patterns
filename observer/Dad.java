package observer;

import java.util.ArrayList;

/**
 * @author Tyler Wu
 */
public class Dad extends Observer{

    public Dad(ArrayList<Baby> babies){
        super(babies);
    }

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
