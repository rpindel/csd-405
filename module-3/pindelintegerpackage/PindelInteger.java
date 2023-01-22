/* Robin Pindel 
 * Module 3 Assignment - Imported Class
 * 1/20/2023 */


package pindelintegerpackage;

public class PindelInteger{
    private int robin;

    public PindelInteger(){
    }

    public PindelInteger(int robin){
        this.robin = robin;
    }

    public int getRobin(){
        return this.robin;
    }

    public void setRobin(int robin){
        this.robin = robin;
    }

    //Non-static method no-arg to determine if created instance integer is even
    public boolean isEven(){
        if (this.robin % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //Non-static method no-arg to determine if created instance integer is odd
    public boolean isOdd(){
        if (this.robin % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }

    //Non-static method no-arg to determine if created instance integer is prime
    public boolean isPrime(){
        if (this.robin == 1){
            return false;
        }
        else {
            for (int i = 2; i <= this.robin / 2; i++){
                if (this.robin % i == 0){
                    return false;
                }      
            }
            return true;
        }    
    }

    //Static method int arg to determine if instance integer is even
    public static boolean isEven(int robin){
        if (robin % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //Static method int arg to determine if instance integer is odd
    public static boolean isOdd(int robin){
        if (robin % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }

    //Static method int arg to determine if instance integer is prime
    public static boolean isPrime(int robin){
        if (robin == 1){
            return false;
        }
        else {
            for (int i = 2; i <= robin / 2; i++){
                if (robin % i == 0){
                    return false;
                }      
            }
            return true;
        } 
    }

    //Static method Integer arg to determine if instance integer is even
    public static boolean isEven(Integer robin){
        if (robin % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Static method Integer arg to determine if instance integer is odd
    public static boolean isOdd(Integer robin){
        if (robin % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Static method Integer arg to determine if instance integer is prime
    public static boolean isPrime(Integer robin){
        if (robin == 1){
            return false;
        }
        else {
            for (int i = 2; i <= robin / 2; i++){
                if (robin % i == 0){
                    return false;
                }      
            }
            return true;
        }  
    }

    //Non-static method int arg to determine if int values are equal
    public boolean equals(int value){
        if (this.robin == value){
            return true;
        } 
        return false;
    }

    //Non-static method Integer arg to determine if int values are equal
    public boolean equals(Integer value){
        if (this.robin == value){
            return true;
        } 
        return false;
    }
} 

