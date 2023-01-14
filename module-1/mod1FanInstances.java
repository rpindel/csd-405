/*Robin Pindel
 * Module 1 Fan Class Assignment
 * 1/5/2023*/


/*Public class of the file that will contain the main method for creating instances of Fan and 
 * executing code regarding these instances*/
public class Mod1FanInstances{
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

//Class that will serve as template for Fan instances
class Fan{
    static final int STOPPED = 0;
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = STOPPED;
    private boolean on = false;
    private int radius = 6;
    private String color = "white";


    public Fan(){}

    public Fan(int customSpeed, boolean customOn, int customRadius, String customColor){
        this.speed = customSpeed;
        this.on = customOn;
        this.radius= customRadius;
        this.color = customColor;
    }

    //setter for fan speed number value
    public void setSpeed(int setSpeed){
        if(this.on == true){
            this.speed = setSpeed;
        }
    }
    
    //getter for fan speed number value
    public int getSpeed(){
        return this.speed;
    }

    //setter for fan on state boolean value
    public void setOn(boolean setOn){
        this.on = setOn;
    }

    //getter for fan on state boolean value
    public boolean getOn(){
        return this.on;
    }

    //setter for fan radius number value
    public void setRadius(int setRadius){
        this.radius = setRadius;
    }

    //getter for fan radius number value
    public int getRadius(){
        return this.radius;
    }

    //setter for fan color value
    public void setColor(String setColor){
        this.color = setColor;
    }

    //getter for fan color value
    public String getColor(){
        return this.color;
    }

    //toString() method override to customize the results
    public String toString(){
        System.out.println();
        return "On: " + this.on + ", Speed: " + this.speed + ", Radius: " + this.radius + ", Color: " 
        + this.color;
    }
}