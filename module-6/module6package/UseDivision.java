/*Robin Pindel
 * 2/3/2023
 * Module 6 Domestic Division Class
 */

package module6package;
import module6package.*;

public class UseDivision {
    public static void main(String [] args){
        Division pokemon = new InternationalDivision("Pokemon International", "12345", "Japan", 
        "Japanese");
        Division sushi = new InternationalDivision("Sushi Amazing", "10201", "New Zealand", 
        "English, Japanese");
        Division farm = new DomesticDivision("Farm Implements, LLC", "56765", "Nebraska");
        Division spackle = new DomesticDivision("Spackletastic", "19991", "Maine");
    
        System.out.println("");
        pokemon.display();

        System.out.println("");
        sushi.display();
        
        System.out.println("");
        farm.display();

        System.out.println("");
        spackle.display();
        System.out.println("");
    }    
}
