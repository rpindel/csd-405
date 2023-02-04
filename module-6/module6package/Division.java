/*Robin Pindel
 * 2/3/2023
 * Module 6 Abstract Division Class
 */

package module6package;

//Division baseclass definition
public abstract class Division {
    private String name;
    private String accountNumber;

    protected Division(String name, String accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }

    //Abstract display method for sublclasses to override
    protected abstract void display(){
    }

    //Method to protect name and retrieve as needed
    public String getName(){
        return name;
    }

    //Method to protect account number and retrieve as needed
    public String getAccountNumber(){
        return accountNumber;
    }
}    