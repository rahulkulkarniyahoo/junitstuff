package rahultest;


import org.testng.annotations.Test;

/**
 * Created by rahulk on 22/09/2017.
 */
public class SecondClass {


    @Test(priority=1)
    public void myFirstTest(){
        System.out.println("This my First Test in Second Class");
    }

    @Test(priority = 2)
    public void mySecondTest(){
        System.out.println("This is my Second Test in Second Class");

    }


}
