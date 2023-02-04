/*Robin Pindel
 * 2/3/2023
 * Module 6 Domestic Division Class
 */

package module6package;

//Subclass domestic division defintion
public class DomesticDivision extends Division {
    private String state;

    //Domestic division constructor calling baseclass constructor as well
    public DomesticDivision(String name, String accountNumber, String state){
        super(name, accountNumber);
        this.state = state;
    }

    //Overriden display method from baseclass to display details on domestic division instance
    @Override
    public void display(){
        System.out.println("The details for this Domestic Division of Pokemon.2 are: ");
        System.out.println("Name: " + getName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
    }
}
