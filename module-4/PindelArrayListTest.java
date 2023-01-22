/* Robin Pindel
 * Module 4 Assignment
 * 1/21/2023 */

import java.util.ArrayList;
import java.util.Scanner;


public class PindelArrayListTest{
    //Main method
    public static void main(String[] args){
        //Creat ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        //Create scanner for user input
        //Populate ArrayList with user inputs until 0 (includes 0 in ArrayList still)
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your integers.  Please note that input ends when a 0 is entered. ");
        Integer intValue;

        do {
            intValue = (Integer)input.nextInt();
            if (intValue != 0)
                arrayList.add(intValue);
            else {
                arrayList.add(intValue);
                break;
            }
        } while (intValue != 0);
    
        //Display details about the user's ArrayList and values
        System.out.println("");
        System.out.println("The largest (max) integer value you entered was: " + max(arrayList));
        System.out.println("The size of your ArrayList was: " + arrayList.size());
        System.out.print("Your ArrayList values were: ");
            for (int i = 0; i < arrayList.size(); i++){
                System.out.print((Integer)arrayList.get(i) + " ");
            }
        System.out.println("");
        System.out.println("");
        
        input.close();
    }

    public static Integer max(ArrayList list){
        //Process ArrayList for largest value
        Integer largest = 0;

        if (list.size() == 0){
            return 0;
        }
        else {
            for (int i = 0; i < list.size(); i++){
                if ((int)list.get(i) > largest){
                    largest = (int)list.get(i);
                }
            }
        }    
        return largest;
    }
}