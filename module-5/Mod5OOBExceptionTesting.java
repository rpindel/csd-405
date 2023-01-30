/* Robin Pindel
 * 1/28/2023
 * Module 5 Out of Bounds Exception Testing Assignment
 */

import java.util.*;

public class Mod5OOBExceptionTesting {
    //main method
    public static void main(String[] args) throws IndexOutOfBoundsException{
        //create ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        
        //Populate ArrayList with Pokemon names
        arrayList.add("#1 Cyndaquil");
        arrayList.add("#2 Dodrio");
        arrayList.add("#3 Weedle");
        arrayList.add("#4 Mew");
        arrayList.add("#5 Kleavor");
        arrayList.add("#6 Lillagant");
        arrayList.add("#7 Sharpedo");
        arrayList.add("#8 Chimchar");
        arrayList.add("#9 Horsea");
        arrayList.add("#10 Gengar");
    
        //for-each loop to print out the ArrayList of Pokemon names
        for (String pokemon : arrayList)
            System.out.println(pokemon + " ");
        
        //Scanner created for user input
        Scanner input = new Scanner(System.in);   

        //Ask user which Pokemon name they would like to see again, input as String convert 
        //through Integer to int
        System.out.println("");
        System.out.println("Which Pokemon name would you like to see again?  Please enter the number.");
        String s = input.nextLine();
        int intValue = Integer.parseInt(s);
        intValue = intValue - 1;
        
        //Try-catch to handle exception where user selects a number not in the ArrayList
        try {
            System.out.println("");
            System.out.println(arrayList.get(intValue));
            System.out.println("");
        } 
        catch(Exception e) {
            System.out.println("Out of Bounds: The number you have entered is not valid " + 
            "for this Pokemon list.");
            System.out.println("");
        }
        finally {
            input.close();
        }
    }
}