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
    public String isEven(){
        if (this.robin % 2 == 0){
            return "Yes (No-arg method used)";
        }
        else{
            return "No (No-arg method used)";
        }
    }

    //Non-static method no-arg to determine if created instance integer is odd
    public String isOdd(){
        if (this.robin % 2 != 0){
            return "Yes (No-arg method used)";
        }
        else{
            return "No (No-arg method used)";
        }
    }

    //Non-static method no-arg to determine if created instance integer is prime
    public String isPrime(){
        if (this.robin == 1){
            return "No (No-arg method used)";
        }
        else {
            for (int i = 2; i <= this.robin / 2; i++){
                if (this.robin % i == 0){
                    return "No (No-arg method used)";
                }      
            }
            return "Yes (No-arg method used)";
        }    
    }

    //Static method int arg to determine if created instance integer is even
    public static String isEven(int robin){
        if (robin % 2 == 0){
            return "Yes (int arg method used)";
        }
        else{
            return "No (int arg method used)";
        }
    }

    //Static method int arg to determine if created instance integer is odd
    public static String isOdd(int robin){
        if (robin % 2 != 0){
            return "Yes (int arg method used)";
        }
        else{
            return "No (int arg method used)";
        }
    }

    //Static method int arg to determine if created instance integer is prime
    public static String isPrime(int robin){
        if (robin == 1){
            return "No (int arg method used)";
        }
        else {
            for (int i = 2; i <= robin / 2; i++){
                if (robin % i == 0){
                    return "No (int arg method used)";
                }      
            }
            return "Yes (int arg method used)";
        } 
    }

    //Static method Integer arg to determine if created instance integer is even
    public static String isEven(Integer robin){
        if (robin % 2 == 0){
            return "Yes (Integer arg method used)";
        }
        else{
            return "No (Integer arg method used)";
        }
    }
    
    //Static method Integer arg to determine if created instance integer is odd
    public static String isOdd(Integer robin){
        if (robin % 2 != 0){
            return "Yes (Integer arg method used)";
        }
        else{
            return "No (Integer arg method used)";
        }
    }
    
    //Static method Integer arg to determine if created instance integer is prime
    public static String isPrime(Integer robin){
        if (robin == 1){
            return "No (Integer arg method used)";
        }
        else {
            for (int i = 2; i <= robin / 2; i++){
                if (robin % i == 0){
                    return "No (Integer arg method used)";
                }      
            }
            return "Yes (Integer arg method used)";
        }  
    }

    //Non-static method int arg to determine if int values are equal
    public String equals(int value){
        if (this.robin == value){
            return "Equal (int method)";
        } 
        return "Not Equal (int method)";
    }

    //Non-static method Integer arg to determine if int values are equal
    public String equals(Integer value){
        if (this.robin == value){
            return "Equal (Integer method)";
        } 
        return "Not Equal (Integer method)";
    }
} 

