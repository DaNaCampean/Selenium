package HW_01_emag_var2.tests;

import HW_01_emag_var2.base.BasePage_driver_browser_init;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTests {




    @BeforeSuite
    public void initDriver(){
        System.out.println("Sunt in initDriver");
        BasePage_driver_browser_init.driverSetupWindows();
    }

    @AfterSuite
    public void tearDown(){
        System.out.println("sunt in teardown from base test");
      //  BasePage_driver_browser_init.browserQuit();

    }
}
