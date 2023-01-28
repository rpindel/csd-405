/* Robin Pindel
 * 1/28/2023
 * Module 5 Data File Testing Assignment
 */

 import java.util.*;
 import java.io.*;

 public class Mod5DataFileTesting {
    //main method
    public static void main(String[] args){
        //create file data.file if it does not exist        
        try {
            File dataFile = new File("C:\\Users\\Coding\\csd\\csd-405\\module-5\\data.file");
            boolean existance = dataFile.createNewFile();
            
            if (existance){
                System.out.println("The new file \"data.file\" has been created!");
            }
            else {
            System.out.println("The file \"data.file\" already exists!");
            }
        }
        catch (Exception e){
            dataFile.printStackTrace();
        }

        //write to data.file adding 10 randomly generated numbers or append to existing file


        //each int should be separated by a space
        //close data.file
        //reopen data.file
        //read and display data.file
    }
 }