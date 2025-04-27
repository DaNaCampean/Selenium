package HW_01_emag.testCases;

//import pages package

import HW_01_emag.BrowserSetup.ChromeSetup;
import HW_01_emag.pages.HomePage;
import HW_01_emag.BrowserSetup.AssertStuff;
import HW_01_emag.pages.SearchResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;


public class TC02_searchAddCartDelete {

    public static void main(String[] args) {

        System.out.println("CHECK that EMAG opens ok, by Title");


        // Create object of BrowserSetup
        ChromeSetup browserSetup = new ChromeSetup();

        WebDriver driver;

        // call Mac setup
        driver = browserSetup.driverSetupMac();

        //call Windows setup         driver = browserSetup.driverSetupWindows();

        driver.get("https://emag.ro");

        // Create object of Home page
        HomePage home = new HomePage(driver);

     /*   String actualTitle = home.getTitle();
        String expectedTitle = "eMAG.ro - Căutarea nu se oprește niciodată";
        assertEquals(actualTitle, expectedTitle, "Verific ca sunt pe partea de start emag"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - landing page EMAG opens correctly");
*/
        AssertStuff assertStuff = new AssertStuff();

        String actualResult = home.getTitle();
        String expectedResult = "eMAG.ro - Căutarea nu se oprește niciodată";
        assertStuff.verificationAsser(actualResult, expectedResult, "Verific ca sunt pe partea de start emag"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - landing page EMAG opens correctly");

        // String expectedTitleFail = "fail eMAG.ro - Căutarea nu se oprește niciodată";
        // assertEquals(actualTitle, expectedTitleFail, "Verific ca sunt pe partea de start emag"); // doar daca nu e ok apare acest mesaj

       //search for aspiratoare

        //Create object of SearchResultsPage
        SearchResultsPage search = new SearchResultsPage(driver);

        // search for aspiratoare and submit
        search.searchTextField("aspiratoare");

        //assert - Check that search results is correct

        actualResult = driver.getCurrentUrl();
        expectedResult = "https://www.emag.ro/search/aspiratoare";
        assertStuff.verificationAsser(actualResult, expectedResult, "The URL for searching results is not correct"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - search results page is displayed");

        // Așteaptă pentru rezultate
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // XPath for selecting the 3rd aspirator

        WebElement productCard = driver.findElement(By.xpath("//div[@class = 'card-item card-standard js-product-data js-card-clickable '][3]"));
        productCard.click();

        WebElement addToCart = driver.findElement(By.xpath("//div[@class='flex-shrink-1 flex-grow-1']"));
        addToCart.click();
    /* try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
       }

*/
        // WebElement viewCartFromAlert = driver.findElement(By.xpath("//div[@class='table-cell col-xs-12 col-sm-2 col-md-2 d-none d-md-table-cell']"));
        WebElement viewCartFromAlert = driver.findElement(By.xpath("//a[@data-dismiss = 'modal']"));

        viewCartFromAlert.click();
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement favButton = driver.findElement(By.id("my_wishlist"));
        favButton.click();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement cosulMeu = driver.findElement(By.id("my_cart"));
        cosulMeu.click();
        System.out.println("before FIND");

        WebElement stergeElement = driver.findElement(By.xpath("//div[@class='line-item line-item-footer d-none d-md-block']/div[@class='mb-1']/button[@class='btn btn-link outline-0 fs-12 fs-md-14 btn-remove-product gtm_rp080219 remove-product']"));

        // WebElement stergeElement = driver.findElement(By.linkText("Sterge"));
        stergeElement.click();

        System.out.println("CLICKL????");






        // driver.close();


    }
}




