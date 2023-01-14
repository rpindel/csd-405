/*Robin Pindel
 * Module 2 Coding Assignment - UseFan Class with updates to Fan Class
 * 1/14/2023*/

package module2package;

//Class that will serve as template for Fan instances
public class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
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