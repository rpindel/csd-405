/*Robin Pindel
 * Module 2 Coding Assignment Redo - UseFan Class with updates to Fan Class
 * 3/1/2023*/

import module2package.*;
import java.util.*;

public class UseFansRedo {
    public static void main(String[] args){ 
        //Create collection of Fan instances
        Fan fanCollection[] = new Fan[4];

        //Populate collection of Fan instances
        fanCollection[0] = new Fan(0, false, 1, "Purple");
        fanCollection[1] = new Fan(1, true, 2, "Olive");
        fanCollection[2] = new Fan(2, false, 2, "Melon");
        fanCollection[3] = new Fan(3, true, 3, "Beige");

        //Create scanner for user input
        Scanner input = new Scanner(System.in);
        
        //Ask user which fan they would like to know about
        System.out.println("Welcome to the Fan Place!");
        System.out.println("");
        System.out.println("Which fan would you like to see the details for? ");
        System.out.println("");
        System.out.println("Please enter a number 1, 2, 3, 4, or 5.  5 will provide details for" + 
        " all fans.");
        System.out.println("");
        int fanChoice = input.nextInt();
        int fanIndex = fanChoice - 1;
        
        //Print details about user's chosen fan (single instance) or all (total collection)
        if (fanChoice >= 1 && fanChoice <= 4){
            System.out.println("");
            System.out.println("The details of Fan #" + fanChoice + " are:");
            printFanDetails(fanCollection[fanIndex]);
        }
        else{
            printFanDetails(fanCollection);
            }
        input.close();
    }

    //Method to print single Fan instance details
    public static void printFanDetails(Fan choice){
        System.out.println("");
        System.out.println("Speed: " + choice.getSpeed());
        System.out.println("On Status: " + choice.getOn());
        System.out.println("Radius: " + choice.getRadius());
        System.out.println("Color: " + choice.getColor());
        System.out.println("");          
    }

    //Method to print all Fan intances details
    public static void printFanDetails(Fan[] choice){
        for (int i = 0; i < choice.length; i++){
            int fanNumber = i + 1;
            System.out.println("");
            System.out.println("The details of Fan #" + fanNumber + " are:");
            System.out.println("");
            System.out.println("Speed: " + choice[i].getSpeed());
            System.out.println("On Status: " + choice[i].getOn());
            System.out.println("Radius: " + choice[i].getRadius());
            System.out.println("Color: " + choice[i].getColor());
            System.out.println("");          
        }
    }
}