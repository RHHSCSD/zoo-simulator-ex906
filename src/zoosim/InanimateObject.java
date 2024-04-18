/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Evan1
 */
public class InanimateObject implements IObject {
    String type;
    int xPosition;
    int yPosition;
    int size;
    double direction;
    
    @Override
    public void place(int x, int y){
        xPosition = x;
        yPosition = y;
    }
    
    @Override 
    public void turn(double degrees){
        direction = direction + degrees;
    }
    
}
