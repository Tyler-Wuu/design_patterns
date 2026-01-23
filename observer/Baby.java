package observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Tyler Wu
 */
public class Baby implements Subject{
    private String name;
    private ArrayList<Observer> observer;
    private Random rand;

    public Baby(String newName){
        this.rand = new Random();
        this.observer = new ArrayList<Observer>();
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }
    
    public void receiveLove(){
        if( this.rand.nextBoolean() ){
            System.out.println( this.getName() + " feels appreciated and loved." );
        }else{
            System.out.println( this.getName() + " pushes everyone away and continues to cry." );
        }
    }

    public void eat(){
        if( this.rand.nextBoolean() ){
            System.out.println( this.getName() + " has a happy full tummy." );
        }else{
            System.out.println( this.getName() + " throws all his food on the floor." );
        }   
    }

    public void getChange(){
        System.out.println( this.getName() + " is having a diaper change.");
    }

    @Override
    public void registerObserver(Observer newObserver){
        this.observer.add(newObserver);
    }

    @Override
    public void removeObserver(Observer observerToRemove){
        this.observer.remove(observerToRemove);
    }

    @Override
    public void notifyObservers(Cry cry) {
        for(Observer observerToRecive : observer){
            observerToRecive.update(cry, this);
        }
    }

    public void angryCry(){
        System.out.println("Waaaaaaaaa! " + this.getName() + " is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);
    }

    public void hungryCry(){
        System.out.println("Neh Neh Neh! " + this.getName() + " is starving!!!");
        notifyObservers(Cry.HUNGRY);
    }

    public void wetCry(){
        System.out.println("Aaaaaa! " + getName() + " is WET!");
        notifyObservers(Cry.WET);
    }
}