package step_definations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Driver;

public class Hooks {
    @Before
    public void setup(){
        System.out.println("Test setup");
        Driver.getDriver().manage().window().maximize();

    }

    @After
    public void tearDown(Scenario scenario){


        System.out.println("Test clean up");
        System.out.println("ALL TESTS PASSED");
        Driver.closeDriver();
    }
}
