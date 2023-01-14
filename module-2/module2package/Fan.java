package module2package;

//Class that will serve as template for Fan instances
public class Fan{
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
        speed = customSpeed;
        on = customOn;
        radius= customRadius;
        color = customColor;
    }

    //setter for fan speed number value
    public void setSpeed(int setSpeed){
        if(on == true){
            speed = setSpeed;
        }
    }
    
    //getter for fan speed number value
    public int getSpeed(){
        return speed;
    }

    //setter for fan on state boolean value
    public void setOn(boolean setOn){
        on = setOn;
    }

    //getter for fan on state boolean value
    public boolean getOn(){
        return on;
    }

    //setter for fan radius number value
    public void setRadius(int setRadius){
        radius = setRadius;
    }

    //getter for fan radius number value
    public int getRadius(){
        return radius;
    }

    //setter for fan color value
    public void setColor(String setColor){
        color = setColor;
    }

    //getter for fan color value
    public String getColor(){
        return color;
    }

    //toString() method override to customize the results
    public String toString(){
        System.out.println();
        return "On: " + on + ", Speed: " + speed + ", Radius: " + radius + ", Color: " + color;
    }
}