//import exception handler
import java.io.IOException;
//import scanner class
import java.util.Scanner;

//class declaration
public class robot {

    // function to find the final position of robot
    // and distance from starting point.
    static int currentPosition(String[] values) throws IOException
    {
        //length of value inputted
        int l = values.length;

        //declaration and initiation of counters
        int countUp = 0, countDown = 0;
        int countLeft = 0, countRight = 0;

        //for loop counter to iterate the inputted commands
        for (int i = 0; i < l; i++) {

           //convert each value in the array to a character as it loops.
           char [] eachLetterinArray =  values[i].toCharArray();

           //for loop to iterate through the length of char array
           for (int j = 0; j < eachLetterinArray.length; j++) {


                //condition required to increment counterUp
                if (eachLetterinArray[j] == 'F') {
                    countUp++; }

                //condition required to increment counterDown
               else if (eachLetterinArray[j] == 'B') {
                    countDown++; }

                //condition required to increment counterLeft
                else if (eachLetterinArray[j] == 'L') {
                    countLeft++; }

                //condition required to increment counterRight
                else if (eachLetterinArray[j] == 'R') {
                    countRight++; }

                //prints out prompt to user due to invalid input
                else {
                    System.out.println("invalid command inputted");

                }
            }
        }

        // print out final position of robot
        System.out.println("final Position: (" + (countRight - countLeft)+ ", "  + (countUp - countDown) + ")");

        //summation of vertical and horizontal values
        int horizontal = countRight - countLeft;
        int vertical = countUp - countDown;

        //summing the absolute values
        int sum =  Math.abs(horizontal) +  Math.abs(vertical);

        //print out the the distance from initial position
        System.out.println("OUTPUT: " + sum);

        //return the value of sum (for testing purpose)
        return sum;

    }

    //main class
    public static void main(String[] args) throws IOException  {

        //string variable to hold inputted commands
        String move;

        //instance of scanner object
        Scanner read = new Scanner (System.in);

        //print out prompt for user input
        System.out.print("INPUT: ");

        //returns the input from the user
        move = read.nextLine();

        //breaks the string around ","
        String[] values = move.split(",");

        //calls the currentPosition method
        currentPosition(values);

        //close the scanner instance to avoid resource leak
        read.close();
    }





}
