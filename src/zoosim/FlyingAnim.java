/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Evan1
 */
public class FlyingAnim extends Animal implements IFlyable {
    boolean canFly;
    boolean isFlying = false;
    
    
    @Override
    public void fly(){
        if (isFlying == true) {
            System.out.println(name + " the " + species + " is already flying");
        } else 
            isFlying = true;
    }
    
    @Override
    public void land() {
        if(isFlying == false) {
            System.out.println(name + " the " + species + " is already on the ground");
        } else
            isFlying = false;
    }
    
    @Override
    public boolean isFlying(){
        return isFlying;
    }
    
    public FlyingAnim(int ident, String call, String spec, boolean male, int old, int xPos, int yPos, int big, int spd, double facing, int hung, int fatig, Image image, String noise, boolean fly){
        id = ident;
        name = call;
        species = spec;
        isMale = male;
        age = old;
        xPosition = xPos;
        yPosition = yPos;
        size = big;
        speed = spd;
        direction = facing;
        hunger = hung;
        fatigue = fatig;
        e = image;
        sound = noise;
        canFly = fly;
    }
    
    public FlyingAnim(int ident, String call, String spec, boolean male, int old, int big, int spd, double facing, Image image, String noise, boolean fly){
        id = ident;
        name = call;
        species = spec;
        isMale = male;
        age = old;
        xPosition = 0;
        yPosition = 0;
        size = big;
        speed = spd;
        direction = facing;
        hunger = 20;
        fatigue = 10;
        e = image;
        sound = noise;
        canFly = fly;
    }
    
    @Override
    public String toString(){
        String mf;
        if (isMale == true){
            mf = "male";
        }else mf = "female";
        String toString = (name + " the " + species + "is a " + mf + " and they are " + age + " years old. On the Zoo Size Scale they are a " + size + ". They are currently facing " + direction + " degrees clockwise at the position (" + xPosition + ", " + yPosition + "). They make the sound" + sound + ".");
        return toString;
        
    }
}
