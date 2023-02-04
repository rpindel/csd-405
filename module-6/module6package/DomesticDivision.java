/*Robin Pindel
 * 2/3/2023
 * Module 6 Domestic Division Class
 */

package module6package;

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String name, String accountNumber, String state){
        super(name, accountNumber);
        this.state = state;
    }

    @Override
    public void display(){
        System.out.println("The details for this Domestic Division are: ");
        System.out.println("Name: " + getName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
    }
}
