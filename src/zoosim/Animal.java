/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Evan1
 */
abstract class Animal implements IEntity {
    int id;
    String name;
    String species;
    boolean isMale;
    int age;
    int xPosition;
    int yPosition;
    int size;
    int speed;
    double direction;
    int hunger;
    int fatigue;
    Image e = new Image();
    String sound;
    
    @Override
    public void makeSound(){
        System.out.println(sound);
    }
    
    @Override
    public void move(){
        
    }
    
    
    public void eat(int restore){
        System.out.println("hunger was " + hunger);
        hunger = hunger + restore;
        System.out.println("hunger is now "+ hunger);
    }
    
    @Override
    public void eat(){
        System.out.println("hunger was " + hunger);
        hunger = hunger + 5;
        System.out.println("hunger is now "+ hunger);
    }
    
    
    public void sleep(int restore){
        System.out.println("fatige was " + fatigue);
        fatigue = fatigue + restore;
        System.out.println("fatigue is now " + fatigue);
    }
    
    @Override
    public void sleep(){
        System.out.println("fatige was " + fatigue);
        fatigue = fatigue + 5;
        System.out.println("fatigue is now " + fatigue);
    }
    
    @Override
    public void turn(double degrees){
        direction = direction + degrees;
    }
    
    @Override
    public void place(int x, int y) {
        xPosition = x;
        yPosition = y;
    }
    
    
}
