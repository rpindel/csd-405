/* Robin Pindel 
 * Module 3 Assignment - Imported Class
 * 1/20/2023 */


package pindelintegerpackage;

public class PindelInteger {
    private int robin;

    public PindelInteger(int robin){
        this.robin = robin;
    }

    public int getRobin(){
        return this.robin;
    }

    public void setRobin(int robin){
        this.robin = robin;
    }

    //flesh out
    public boolean isEven(){
        if (this.robin % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //flesh out
    public boolean isOdd(){
        if (this.robin % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }

    //flesh out
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
    
    //flesh out
    public static boolean isEven(int robin){
        if (robin % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //flesh out
    public static boolean isOdd(int robin){
        if (robin % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }

    //flesh out
    public static boolean isPrime(int robin){
        boolean isPrime = false;
        for (int i = 2; i <= robin / 2; i++){
            if (robin % i == 0){
                isPrime = true;
                break;
            }
        }           
        if (isPrime == true){
            return true;
        }
        else{
            return false;
        } 
    }

    //flesh out
    public boolean isEven(Integer robin){
        if (robin % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    //flesh out
    public boolean isOdd(Integer robin){
        if (robin % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    //flesh out
    public boolean isPrime(Integer robin){
        boolean isPrime = false;
        for (int i = 2; i <= robin / 2; i++){
            if (robin % i == 0){
                isPrime = true;
                break;
            }
        }           
        if (isPrime == true){
            return true;
        }
        else{
            return false;
        } 
    }
} 

