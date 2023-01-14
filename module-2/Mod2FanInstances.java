/*Robin Pindel
 * Module 1 Fan Class Assignment
 * 1/5/2023*/

import module2package.Fan;

 /*Public class of the file that will contain the main method for creating instances of Fan and 
 * executing code regarding these instances*/
public class Mod2FanInstances{
    //Main method
    public static void main(String[] args){
        //Create two instances of fan, one default and one custom
        Fan defaultFan = new Fan();
        Fan customFan = new Fan(3, true, 100, "pink");

        /*Print out details about the fan instances: initial state, changes made, and current state
         * after changes*/
        System.out.println("");
        System.out.println("");
        System.out.println("The default-built fan's initial state is: ");   
        System.out.println(defaultFan);
        System.out.println("");
        System.out.println("The custom-built fan's initial state is: ");
        System.out.println(customFan);
        System.out.println("");
        System.out.println("");
        
        defaultFan.setOn(true);
        System.out.println("Changing the default fan's on status to: " + defaultFan.getOn());
        
        defaultFan.setSpeed(Fan.SLOW);
        System.out.println("Changing the default fan's speed to: " + defaultFan.getSpeed() 
        + " (SLOW)");
        
        customFan.setRadius(3);
        System.out.println("Changing the custom fan's radius to (not sure how but...): " + 
        customFan.getRadius());
        
        customFan.setColor("dirty");
        System.out.println("Changing the custom fan's color to: " + customFan.getColor());

        System.out.println("");
        System.out.println("");
        System.out.println("The default-built fan's current specifications are: ");   
        System.out.println(defaultFan);
        System.out.println("");
        System.out.println("The custom-built fan's current specifications are: ");
        System.out.println(customFan);
        System.out.println("");
        System.out.println("");



    }
}