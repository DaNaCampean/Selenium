package HW_01_emag.testCases;

//import pages package

import HW_01_emag.BrowserSetup.ChromeSetup;
import HW_01_emag.pages.HomePage;
import HW_01_emag.pages.SearchResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;


public class TC02_searchAddCartDelete {

    public static void verificationAssert(String actualResult, String expectedResult, String verifText){
        assertEquals(actualResult, expectedResult, verifText);

    }

    public static void main(String[] args) {


        // Create object of BrowserSetup
        ChromeSetup browserSetup = new ChromeSetup();

        WebDriver driver;

        // call Mac setup
        driver = browserSetup.driverSetupMac();

        //call Windows setup
      //  driver = browserSetup.driverSetupWindows();


        driver.get("https://emag.ro");

        // Create object of Home page
        HomePage home = new HomePage(driver);

     /*   String actualTitle = home.getTitle();
        String expectedTitle = "eMAG.ro - Căutarea nu se oprește niciodată";
        assertEquals(actualTitle, expectedTitle, "Verific ca sunt pe partea de start emag"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - landing page EMAG opens correctly");
*/
        System.out.println("CHECK that EMAG opens ok, by Title");
        verificationAssert(home.getTitle(), "eMAG.ro - Căutarea nu se oprește niciodată", "Verific ca sunt pe partea de start emag"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - landing page EMAG opens correctly");


       //search for aspiratoare

        //Create object of SearchResultsPage
        SearchResultsPage search = new SearchResultsPage(driver);

        // search for aspiratoare and submit
        search.searchTextField("aspiratoare");

        //assert - Check that search results is correct

        System.out.println("CHECK that search by aspiratoare page is correct. I used URL verification");
        verificationAssert(driver.getCurrentUrl(), "https://www.emag.ro/search/aspiratoare", "The URL for searching results is not correct"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - search results page is displayed");

        // Așteaptă pentru rezultate
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // XPath for selecting the 3rd aspirator
        WebElement productCard = driver.findElement(By.xpath("//div[@class = 'card-item card-standard js-product-data js-card-clickable '][3]"));

       // Get the value of the data-name attribute
        String dataName = productCard.getAttribute("data-name");

        // Print the data-name value
        System.out.println("Data-name attribute value: " + dataName);
        productCard.click();

        WebElement t1 = driver.findElement(By.xpath(" //h1[@class='page-title']"));
        String myt1 = t1.getText();
        System.out.println("T1 = " + myt1);

        System.out.println("CHECK that the 3rd aspirator details page opens");
        verificationAssert(myt1,dataName, "The page opened is not correct"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - correct page is displayed");




        //assert - Check that the third aspirator details page opens

      //  System.out.println("CHECK that search by aspiratoare page is correct. I used URL verification");
     //   verificationAssert(driver.getCurrentUrl(), "https://www.emag.ro/search/aspiratoare", "The URL for searching results is not correct"); // doar daca nu e ok apare acest mesaj
     //  System.out.println("PASSED - search results page is displayed");


        WebElement addToCart = driver.findElement(By.xpath("//div[@class='flex-shrink-1 flex-grow-1']"));
        addToCart.click();
        //assert - Check that "Add to Cart " works

        //  System.out.println("CHECK that search by aspiratoare page is correct. I used URL verification");
        //   verificationAssert(driver.getCurrentUrl(), "https://www.emag.ro/search/aspiratoare", "The URL for searching results is not correct"); // doar daca nu e ok apare acest mesaj
        //  System.out.println("PASSED - search results page is displayed");


        WebElement viewCartFromAlert = driver.findElement(By.xpath("//a[@data-dismiss = 'modal']"));
        viewCartFromAlert.click();
        //assert - Check that the third aspirator details page opens

        //  System.out.println("CHECK that search by aspiratoare page is correct. I used URL verification");
        //   verificationAssert(driver.getCurrentUrl(), "https://www.emag.ro/search/aspiratoare", "The URL for searching results is not correct"); // doar daca nu e ok apare acest mesaj
        //  System.out.println("PASSED - search results page is displayed");

        WebElement cosulMeu = driver.findElement(By.id("my_cart"));
        cosulMeu.click();
        //assert - Check that the third aspirator details page opens

        //  System.out.println("CHECK that search by aspiratoare page is correct. I used URL verification");
        //   verificationAssert(driver.getCurrentUrl(), "https://www.emag.ro/search/aspiratoare", "The URL for searching results is not correct"); // doar daca nu e ok apare acest mesaj
        //  System.out.println("PASSED - search results page is displayed");

        WebElement stergeElement = driver.findElement(By.xpath("//div[@class='line-item line-item-footer d-none d-md-block']/div[@class='mb-1']/button[@class='btn btn-link outline-0 fs-12 fs-md-14 btn-remove-product gtm_rp080219 remove-product']"));
        stergeElement.click();

        //assert - Check that the third aspirator details page opens

        //  System.out.println("CHECK that search by aspiratoare page is correct. I used URL verification");
        //   verificationAssert(driver.getCurrentUrl(), "https://www.emag.ro/search/aspiratoare", "The URL for searching results is not correct"); // doar daca nu e ok apare acest mesaj
        //  System.out.println("PASSED - search results page is displayed");

        // driver.close();


    }
}




