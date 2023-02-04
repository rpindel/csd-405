/*Robin Pindel
 * 2/3/2023
 * Module 6 International Division Class
 */

package module6package;

public class InternationalDivision extends Division {
    private String country;
    private String languageSpoken;

    public InternationalDivision(String name, String accountNumber, String country, 
    String languageSpoken){
        super(name, accountNumber);
        this.country = country;
        this.languageSpoken = languageSpoken;
    }

    @Override
    public void display(){
        System.out.println("The details for this International Division are: ");
        System.out.println("Name: " + getName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language Spoken: " + languageSpoken);
    }
}
