/*Robin Pindel
 * Module 2 Coding Assignment - UseFan Class
 * 1/14/2023*/

public class Mod2FanInstances{
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
        System.out.println("Which fan would you like to see the details for? ");
        System.out.println("Please enter a number 1, 2, 3, 4, or 5.  5 will provide details for" + 
        " all fans.");
        int fanChoice = input.nextInt();
        int fanIndex = fanChoice - 1;
        
        if (fanChoice >= 1 && fanChoice <= 4){
            System.out.println("The details of Fan #" + fanChoice + " are:");
            UseFans.printFanDetails(fanCollection[fanIndex]);
        }
        else{
            for (int i = 0; i < fanCollection.length; i++){
            int fanNumber = i +1;
            System.out.println("The details of Fan #" + fanNumber + " are:");
            UseFans.printFanDetails(fanCollection[i]);
            }
        }
        input.close();
    }
}