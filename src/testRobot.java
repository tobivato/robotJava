//import testNG Assert class
import org.testng.Assert;
//import testNG annotation class
import org.testng.annotations.Test;
//import java exception handling class
import java.io.IOException;

//declare test class
public class testRobot {

    //test annotation to signify test case with priority 0
    @Test(priority = 0)
    void setup(){

        //creat an instance of robot class
        robot unitTest = new robot();

        //string sample
        String[] values = {"B","B"};

        //error handling using try and catch method
        try {

            //assign the returned value from currentPosition method
            int result = unitTest.currentPosition(values);

            //perform assertion to the value by checking if the result is greater than -1
            //the value must be greater of equal to zero to pass the test.
            //this is because distance cannot be negative in value
            Assert.assertTrue(result>(-1));

            //catch any exception thrown
        } catch (IOException e) {

            //print error
            e.printStackTrace();
        }

    }

}
