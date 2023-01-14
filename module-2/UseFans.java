/*Robin Pindel
 * Module 2 Coding Assignment - UseFan Class
 * 1/14/2023*/


import module2package.Fan;
import java.util.*;

public class UseFans {
    public static void main(String[] args){
        //Create collection of Fan instances
        Fan[] fans = new Fan[4];

        //Populate collection of Fan instances
        fans[0] = new Fan(0, false, 1, "Purple");
        fans[1] = new Fan(1, true, 2, "Olive");
        fans[2] = new Fan(2, false, 2, "Melon");
        fans[3] = new Fan(3, true, 3, "Beige");

        //Create scanne for user input
        Scanner input = new Scanner(System.in);

        System.out.println("Which fan would you like to see the details for? ");
        System.out.println("Please enter a number 1, 2, 3, 4, or 5.  5 will provide details for" + 
        " all fans.");
        int fanChoice = input.nextInt();

        switch(fanChoice){
            case 1: 
                System.out.println("");
                System.out.println("The details of fan #1 are: " );
                System.out.println("Speed: " + fans[0].getSpeed());
                System.out.println("On Status: " + fans[0].getOn());
                System.out.println("Radius: " + fans[0].getRadius());
                System.out.println("Color: " + fans[0].getColor());
                    break;
            case 2: 
                System.out.println("");
                System.out.println("The details of fan #2 are: " );
                System.out.println("Speed: " + fans[1].getSpeed());
                System.out.println("On Status: " + fans[1].getOn());
                System.out.println("Radius: " + fans[1].getRadius());
                System.out.println("Color: " + fans[1].getColor());
                    break;
            case 3:
                System.out.println("");
                System.out.println("The details of fan #3 are: " );
                System.out.println("Speed: " + fans[2].getSpeed());
                System.out.println("On Status: " + fans[2].getOn());
                System.out.println("Radius: " + fans[2].getRadius());
                System.out.println("Color: " + fans[2].getColor()); 
                    break;
            case 4: 
                System.out.println("");
                System.out.println("The details of fan #4 are: " );
                System.out.println("Speed: " + fans[3].getSpeed());
                System.out.println("On Status: " + fans[3].getOn());
                System.out.println("Radius: " + fans[3].getRadius());
                System.out.println("Color: " + fans[3].getColor()); 
                    break;
            case 5:
                System.out.println("");
                System.out.println("The details of fan #1 are: " );
                System.out.println("Speed: " + fans[0].getSpeed());
                System.out.println("On Status: " + fans[0].getOn());
                System.out.println("Radius: " + fans[0].getRadius());
                System.out.println("Color: " + fans[0].getColor());
                System.out.println("");
                System.out.println("The details of fan #2 are: " );
                System.out.println("Speed: " + fans[1].getSpeed());
                System.out.println("On Status: " + fans[1].getOn());
                System.out.println("Radius: " + fans[1].getRadius());
                System.out.println("Color: " + fans[1].getColor());
                System.out.println("");
                System.out.println("The details of fan #3 are: " );
                System.out.println("Speed: " + fans[2].getSpeed());
                System.out.println("On Status: " + fans[2].getOn());
                System.out.println("Radius: " + fans[2].getRadius());
                System.out.println("Color: " + fans[2].getColor());
                System.out.println("");
                System.out.println("The details of fan #4 are: " );
                System.out.println("Speed: " + fans[3].getSpeed());
                System.out.println("On Status: " + fans[3].getOn());
                System.out.println("Radius: " + fans[3].getRadius());
                System.out.println("Color: " + fans[3].getColor());
                    break;            
        }
        System.out.println("");
    }
            
}
