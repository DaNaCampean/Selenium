package HW_01_emag.testCases;

import HW_01_emag.pages.HomePage;
import HW_01_emag.BrowserSetup.ChromeSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;


public class TC01_landing_page {

    public static void main(String[] args) {

       System.out.println("CHECK that EMAG opens ok, by Title");


        // Create object of BrowserSetup
        ChromeSetup browserSetup = new ChromeSetup();

        WebDriver driver;

        // call Mac setup
        //driver = browserSetup.driverSetupMac();

        //call Windows setup
        driver = browserSetup.driverSetupWindows();

        driver.get("https://emag.ro");

        // Create object of Home page
        HomePage home = new HomePage(driver);

        String actualTitle = home.getTitle();
        String expectedTitle = "eMAG.ro - Căsutarea nu se oprește niciodată";
        assertEquals(actualTitle, expectedTitle, "Verific ca sunt pe partea de start emag"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - landing page EMAG opens correctly");

        driver.close();


    }
}
