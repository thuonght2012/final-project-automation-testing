package tests;

import cucumber.api.java.en.Given;
import runner.TestRunner;

/**
 * Created by nththuy on 1/3/20.
 */
public class CommonTest {


    @Given("Open website (.*)$")
    public void user_already_on_home_page(String website) throws InterruptedException {
        Thread.sleep(5000);
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();

    }

}
