package HW_01_emag_var2.tests;

import HW_01_emag_var2.base.BasePage_driver_browser_init;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class baseTests {




    @AfterSuite
    public void tearDown(){
        System.out.println("sunt in teardown from base test");
        BasePage_driver_browser_init.browserQuit();

    }
}
