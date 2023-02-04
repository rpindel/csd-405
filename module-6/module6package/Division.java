/*Robin Pindel
 * 2/3/2023
 * Module 6 Abstract Division Class
 */

package module6package;

public abstract class Division {
    private String name;
    private String accountNumber;

    protected Division(String name, String accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }

    protected void display(){
    }

    public String getName(){
        return name;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}    