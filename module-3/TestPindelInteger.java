/* Robin Pindel 
 * Module 3 Assignment - Class with main method
 * 1/20/2023 */

//Import template Class and package
import pindelintegerpackage.PindelInteger;

//Class to hold code testing the package code
public class TestPindelInteger {
    public static void main(String[] args){
        //Create three instances, two with same value and one with different value
        PindelInteger pindelintegertest_1 = new PindelInteger(15);
        PindelInteger pindelintegertest_2 = new PindelInteger(15);
        PindelInteger pindelintegertest_3 = new PindelInteger(29);

        //Testing one instance using non-static methods from imported Class
        System.out.println("");
        System.out.println(" -- Analyzing instance pindelintegertest_1 using non-static isX methods -- ");
        System.out.println("The provided number ## " + pindelintegertest_1.getRobin() + " ## is:");
        System.out.println("Even? " + pindelintegertest_1.isEven());
        System.out.println("Odd? " + pindelintegertest_1.isOdd());
        System.out.println("Prime? " + pindelintegertest_1.isPrime());
    
        //Testing one instance using static methods wanting int args from imported Class
        System.out.println("");
        System.out.println(" -- Analyzing instance pindelintegertest_2 using static isX primitive methods -- ");
        System.out.println("The provided number ## " + pindelintegertest_2.getRobin() + " ## is:");
        System.out.println("Even? " + PindelInteger.isEven(pindelintegertest_2.getRobin()));
        System.out.println("Odd? " + PindelInteger.isOdd(pindelintegertest_2.getRobin()));
        System.out.println("Prime? " + PindelInteger.isPrime(pindelintegertest_2.getRobin()));

        //Testing one instance using static methods wanting Integer args from imported Class
        System.out.println("");
        System.out.println(" -- Analyzing instance pindelintegretest_3 using static isX wrapper methods -- ");
        System.out.println("The provided number ## " + (Integer)pindelintegertest_3.getRobin() + " ## is:");
        System.out.println("Even? " + PindelInteger.isEven((Integer)pindelintegertest_3.getRobin()));
        System.out.println("Odd? " + PindelInteger.isOdd((Integer)pindelintegertest_3.getRobin()));
        System.out.println("Prime? " + PindelInteger.isPrime((Integer)pindelintegertest_3.getRobin()));
        System.out.println("");

        //Using equals(int) method from imported Class
        System.out.println("_1 int value equals _2 int value? " + 
        pindelintegertest_1.equals(pindelintegertest_2.getRobin()));
        System.out.println("_1 int value equals _3 int value? " + 
        pindelintegertest_1.equals(pindelintegertest_3.getRobin()));
        System.out.println("_2 int value equals _3 int value? " + 
        pindelintegertest_2.equals(pindelintegertest_3.getRobin()));
    
        //Using equals(Integer) method from imported Class
        System.out.println("");
        System.out.println("_1 int value equals _2 Integerint value? " + 
        pindelintegertest_1.equals((Integer)pindelintegertest_2.getRobin()));
        System.out.println("_1 int value equals _3 Integerint value? " + 
        pindelintegertest_1.equals((Integer)pindelintegertest_3.getRobin()));
        System.out.println("_2 int value equals _3 Integerint value? " + 
        pindelintegertest_2.equals((Integer)pindelintegertest_3.getRobin()));   
        System.out.println("");
        
        //Creating a fourth instance to test the set method from the imported Class
        PindelInteger pindelintegertest_4 = new PindelInteger();
        System.out.println("The value of pindelintegertest_4 is currently: " + pindelintegertest_4.getRobin() + " (default value)");
        System.out.println("Setting pindelintegertest_4 to a new number...");
        pindelintegertest_4.setRobin(6);
        System.out.println("The value of pindelintegertest_4 is now: " + pindelintegertest_4.getRobin());
        System.out.println("");

    }
}