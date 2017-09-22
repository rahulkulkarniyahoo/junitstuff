package rahultest;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

/**
 * Created by rahulk on 22/09/2017.
 */
public class FirstClass {

    @Before
    public void myFirstClassBefore(){
        System.out.println("myFirstClassBefore");
    }

    @After
    public void myFirstClassAfter(){
        System.out.println("myFirstClassAfter");
    }

    @Test(priority=1)
    public void myFirstTest(){
        System.out.println("This my First Test in First Class");
    }

    @Test(priority = 2)
    public void mySecondTest(){
        System.out.println("This is my Second Test in First Class");

    }


}
