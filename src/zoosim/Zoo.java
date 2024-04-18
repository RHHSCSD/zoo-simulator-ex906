/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Evan1
 */
public class Zoo {
    Animal[] zoo = new Animal[50];
    InanimateObject[] things = new InanimateObject[100];
    
    public boolean addLandAnimal(int index, String call, String spec, boolean male, int old, int xPos, int yPos, int big, int spd, double facing, int hung, int fatig, Image image, String noise){
      if(index >0 && index > 50){
        if (zoo[index] == null){
          zoo[index] = new LandAnim(index, call, spec, male, old, xPos, yPos, big, spd, facing, hung, fatig, image, noise);
          return true;
        } else return false;
      } else return false;
    }
    
    public boolean addLandAnimal(int index, String call, String spec, boolean male, int old, int big, int spd, double facing, Image image, String noise){
      if(index >0 && index > 50){
        if(zoo[index] == null){
            zoo[index] = new LandAnim(index, call, spec, male, old, big, spd, facing, image, noise);
            return true;
        } else return false;
      } else return false;
    }
    public boolean addSwimAnimal(int index, String call, String spec, boolean male, int old, int xPos, int yPos, int big, int spd, double facing, int hung, int fatig, Image image, String noise, boolean surface){
      if(index >0 && index > 50){
        if (zoo[index] == null){
            zoo[index] = new SwimmingAnim(index, call, spec, male, old, xPos, yPos, big, spd, facing, hung, fatig, image, noise, surface);
            return true;
        } else return false;
      } else return false;
    }
    
    public boolean addSwimAnimal(int index, String call, String spec, boolean male, int old, int big, int spd, double facing, Image image, String noise, boolean surface){
      if(index >0 && index > 50){
        if (zoo[index] == null){
            zoo[index] = new SwimmingAnim(index, call, spec, male, old, big, spd, facing, image, noise, surface);
            return true;
        } else return false;
      } else return false;
    }
    
    public boolean addFlyAnimal(int index, String call, String spec, boolean male, int old, int xPos, int yPos, int big, int spd, double facing, int hung, int fatig, Image image, String noise, boolean fly){
      if(index >0 && index > 50){
        if (zoo[index] == null){
            zoo[index] = new FlyingAnim(index, call, spec, male, old, xPos, yPos, big, spd, facing, hung, fatig, image, noise, fly);
            return true;
        } else return false;
      } else return false;
    }
    
    public boolean addFlyAnimal(int index, String call, String spec, boolean male, int old, int big, int spd, double facing, Image image, String noise, boolean fly){
      if(index >0 && index > 50){
        if (zoo[index] == null){
            zoo[index] = new FlyingAnim(index, call, spec, male, old, big, spd, facing, image, noise, fly);
            return true;
        } else return false;
      } else return false;
    }
    
    public String returnName(int index){
        try{
        return zoo[index].name;
        }catch (Exception e){
            return "Error";
        }
    }
    
    public String[] returnNames(){
        String[] names = new String[50];
        for (int i = 0; i < 50; i++){
            names[i] = zoo[i].name;
        }
        return names;
    }
    
    public String returnSpecies(int index){
        try{
        return zoo[index].species;
        }catch(Exception e){
            return "Error";
        }
    }
    
    public String[] returnAllSpecies(){
        String[] species = new String[50];
        for (int i = 0; i < 50; i++){
            species[i] = zoo[i].species;
        }
        return species;
    }
    
    public String returnMF(int index){
        try{
        if(zoo[index].isMale){
            return "Male";
        }
        else return "Female";
        }catch(Exception e){
            return "Error";
        }
    }
    
    public String[] returnAllMF(){
      String[] names = new String[50];
      for (int i = 0; i < 50; i++){
        if(zoo[i].isMale){
          names[i] = "Male";
        } else names[i] = "Female";
      }
      return names;
    }
    
    public int returnAge(int index){
        try{
        return zoo[index].age;
        }catch(Exception e){
            return -1;
        }
    }
    
    public int[] returnAges(){
        int[] ages = new int[50];
        for (int i = 0; i < 50; i++){
            ages[i] = zoo[i].age; 
       }
        return ages;
    }
    
    public int[] returnPosition(int index){
        try{
        int[] position = new int[2];
        position[0] = zoo[index].xPosition;
        position[1] = zoo[index].yPosition;
        return position;
        }catch(Exception e){
            return null;
        }
    }
    
    public int[][] returnPositions(){
        int[][] positions = new int[50][2];
        for (int i = 0; i < 50; i++){
            positions[i][0] = zoo[i].xPosition;
            positions[i][1] = zoo[i].yPosition;
        }
        return positions;
    }
    
    public int returnSize(int index){
        try{
        return zoo[index].size;
        } catch(Exception e){
            return -1;
        }
    }
    
    public int[] returnSizes(){
        int[] sizes = new int[50];
        for (int i = 0; i < 50; i++){
            sizes[i] = zoo[i].size;
        }
        return sizes;
    }
    
    public String returnNoise(int index){
        try{
        return zoo[index].sound;
        } catch(Exception e){
            return "Error";
        }
    }
    
    public String[] returnNoises(){
        String [] noises = new String[50];
        for (int i = 0; i < 50; i++){
            noises[i] = zoo[i].sound;
        }
        return noises;
    }
    
    public void feedTheHungry(int limit){
        for (int i = 0; i < 50; i++){
            if (zoo[i].hunger < limit){
                zoo[i].eat();
            }
        }
    }
    
    public void feedTheHungry(int limit, int restore){
        for (int i = 0; i < 50; i++){
            if (zoo[i].hunger < limit){
                zoo[i].eat(restore);
            }
        }
    }
    
    public void restTheWeary(int limit){
        for (int i = 0; i < 50; i++){
            if (zoo[i].fatigue < limit){
                zoo[i].sleep();
            }
        }
    }
    
    public void restTheWeary(int limit, int restore){
        for (int i = 0; i < 50; i++){
            if (zoo[i].fatigue < limit){
                zoo[i].sleep(restore);
            }
        }
    }
    
    
    /* How would you modify this structure to allow for predator/prey interactions and
       Carnivores/Omnivores/Herbivores
       
       I think I would simply add some new interface classes, namely Predator/Prey and EatsMeat/EatsPlant 
       (for example an omnivore class would implement both EatsMeat and EatsPlant
       and any class that needs to can just implement their methods 
    */
}
