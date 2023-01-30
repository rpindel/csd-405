/* Robin Pindel
 * 1/28/2023
 * Module 5 Data File Testing Assignment
 */

 import java.util.*;
 import java.io.*;

 public class Mod5DataFileTesting {
    //main method
    public static void main(String[] args) throws IOException {
        //create file data.file if it does not exist        
        try {
            //File dataFile = new File("C:\\Users\\Coding\\csd\\csd-405\\module-5\\data.file");
            File dataFile = new File(".\\data.file");
            
            if (dataFile.createNewFile()){
                System.out.println("");
                System.out.println("The new file \"data.file\" has been created!");
                System.out.println("");
            }
            else {
                System.out.println("");
                System.out.println("The file \"data.file\" already exists!  Any write work will " 
                + "be in append mode.");
                System.out.println("");
            }
        }
        catch (Exception e){
            System.out.println("An error has occured.  Please review the exception stack track " + 
            "for more details.");
            System.out.println("");
            e.printStackTrace();
            System.out.println("");
        }

        //write to data.file adding 10 randomly generated numbers or append to existing file
        //each int should be separated by a space
        //close data.file
        try {
            //FileWriter dataFileWriter = new FileWriter("C:\\Users\\Coding\\csd\\csd-405\\" + 
            //"module-5\\data.file", true);
            FileWriter dataFileWriter = new FileWriter(".\\data.file", true);
            System.out.println("data.file is open for writing.");
            System.out.println("Writing 10 random integers 1-100.");
            for (int i = 0; i < 10; i++){
                dataFileWriter.write(((int)(Math.random() * 100)) + " ");
            }
            dataFileWriter.close();
            System.out.println("data.file is closed for writing.");
            System.out.println("");
        }
        catch (Exception e){
            System.out.println("An error has occured.  Please review the exception stack track " + 
            "for more details.");
            System.out.println("");
            e.printStackTrace();
            System.out.println("");
        }

        //reopen data.file
        //read and display data.file
        try {
            //File dataFile = new File("C:\\Users\\Coding\\csd\\csd-405\\module-5\\data.file");
            File dataFile = new File(".\\data.file");
            Scanner myReader = new Scanner(dataFile);
            System.out.println("data.file is open for reading.");
            while (myReader.hasNext()){
                String data = myReader.nextLine();
                System.out.println("data.file contains the following random numbers:");
                System.out.println(data);
            }
            myReader.close();
            System.out.println("data.file is closed for reading.");
            System.out.println("");
        }
        catch (Exception e){
            System.out.println("An error has occured.  Please review the exception stack track " + 
            "for more details.");
            System.out.println("");
            e.printStackTrace();
            System.out.println("");
        }
    }
 }