/* Robin Pindel 
 * Module 3 Assignment - Class with main method
 * 1/20/2023 */


import pindelintegerpackage.PindelInteger;

public class TestPindelInteger {
    public static void main(String[] args){
        PindelInteger pindelintegertest = new PindelInteger(15);
    
    System.out.println("The provided number ## " + pindelintegertest.getRobin() + " ## is:");
    System.out.println("Is even? " + pindelintegertest.isEven());
    System.out.println("Is odd? " + pindelintegertest.isOdd());
    System.out.println("Is prime? " + pindelintegertest.isPrime());
    }
}