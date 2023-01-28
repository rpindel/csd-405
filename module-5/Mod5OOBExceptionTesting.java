/* Robin Pindel
 * 1/28/2023
 * Module 5 Out of Bounds Exception Testing Assignment
 */

import java.util.*;

public class Mod5OOBExceptionTesting {
    //main method
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
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
    
        for (String pokemon : arrayList)
            System.out.println(pokemon + " ");
        
        Scanner input = new Scanner(System.in);   

        System.out.println("");
        System.out.println("Which pokemon would you like to see again?  Please enter the number.");
        int intValue = input.nextInt();
        intValue = intValue - 1;
        
        try {
            System.out.println("");
            System.out.println(arrayList.get(intValue));
            System.out.println("");
        } 
        catch(Exception e) {
            System.out.println("Out of Bounds: The number you have entered is not valid " + 
            "for this pokemon list.");
            System.out.println("");
        }
        finally {
            input.close();
        }
    }
}