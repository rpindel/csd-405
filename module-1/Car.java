public class Car{
    public static void main(String[] args){
        CarTemplate fastCar = new CarTemplate(2, "Gas", 10.0, 200);
        CarTemplate slowCar = new CarTemplate(7, "Gas", 2.0, 50);
        
        System.out.println("");
        System.out.println("My fast car has " + fastCar.doors + " doors, a " + fastCar.engineType + 
        " type engine, a " + fastCar.engineSize + " sized engine, and can go " + fastCar.maxSpeed
         + " mph! The engine is running: " + fastCar.running);
        System.out.println("");
        slowCar.startEngine();
        System.out.println("My slow car has " + slowCar.doors + " doors, a " + slowCar.engineType + 
        " type engine, a " + slowCar.engineSize + " sized engine, and can go " + slowCar.maxSpeed
         + " mph! The engine is running: " + slowCar.running);
        System.out.println("");
    }   
}

class CarTemplate{
    int doors;
    String engineType;
    double engineSize;
    int maxSpeed;
    boolean running = false;

    CarTemplate(){}

    CarTemplate(int doorsNum, String engType, double engSize, int maxSpd){
        doors = doorsNum;
        engineType = engType;
        engineSize = engSize;
        maxSpeed = maxSpd;
    }

    public boolean startEngine(){
        if(running == false){
            running = true;
        }
        return running;
    }

    public boolean stopEngine(){
        if(running == true){
            running= false; 
        }
        return running;
    }
}