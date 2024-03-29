/*Robin Pindel
 * 2/3/2023
 * Module 6 International Division Class
 */

package module6package;

//Subclass international division defintion
public class InternationalDivision extends Division {
    private String country;
    private String languageSpoken;

    //International division constructor calling baseclass constructor as well
    public InternationalDivision(String name, String accountNumber, String country, 
    String languageSpoken){
        super(name, accountNumber);
        this.country = country;
        this.languageSpoken = languageSpoken;
    }

    //Overriden display method from baseclass to display details on internationl division instance
    @Override
    public void display(){
        System.out.println("The details for this International Division of Pokemon.2 are: ");
        System.out.println("Name: " + getName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language Spoken: " + languageSpoken);
    }
}
