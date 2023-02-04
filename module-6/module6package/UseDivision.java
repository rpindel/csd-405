/*Robin Pindel
 * 2/3/2023
 * Module 6 Use Division Class
 */

package module6package;

public class UseDivision {
    //Main method to use the various base and sub division classes
    public static void main(String [] args){
        //Create international division instances
        Division pokemon = new InternationalDivision("Pokemon.2 Japan ", "10001", "Japan", 
        "Japanese");
        Division sushi = new InternationalDivision("Pokemon.2 New Zealand", "10011", "New Zealand", 
        "English, Japanese");
        
        //Create domestic division instances
        Division farm = new DomesticDivision("Pokemon.2 Main", "10000", "Wisconsin");
        Division spackle = new DomesticDivision("Pokemon.2 Pacific", "10021", "Hawaii");
    
        //Display the details for all created division instances
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
