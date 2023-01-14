/*Robin Pindel
 * Module 2 Coding Assignment - UseFan Class
 * 1/14/2023*/


import module2package.Fan;

public class UseFans {
    public static void main(String[] args){
        //Create collection of Fan instances
        Fan[] fans = new Fan[4];

        //Populate collection of Fan instances
        fans[0] = new Fan(0, false, 1, "Purple");
        fans[1] = new Fan(1, true, 2, "Olive");
        fans[2] = new Fan(2, false, 2, "Melon");
        fans[3] = new Fan(3, true, 3, "Beige");
    }
}
