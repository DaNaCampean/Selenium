package HW_01_emag.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//import pages package
import HW_01_emag.pages.HomePage;
import HW_01_emag.BrowserSetup.ChromeSetup;
import HW_01_emag.pages.SearchResultsPage;
import org.testng.Assert;

public class TC02_searchAddCartDelete {

    // methode for assert
    public static void verificationAssert(String actualResult, String expectedResult, String verifText){
        assertEquals(actualResult, expectedResult, verifText);
    }

    public static void main(String[] args) {

        // Create object of BrowserSetup
        ChromeSetup browserSetup = new ChromeSetup();

        WebDriver driver;

        // driver = browserSetup.driverSetupMac(); // call Mac setup
        driver = browserSetup.driverSetupWindows(); //call Windows setup

        driver.get("https://emag.ro");

        // Create object of Home page
        HomePage home = new HomePage(driver);

        System.out.print("CHECK that EMAG opens ok, by Title - ");
        verificationAssert(home.getTitle(), "eMAG.ro - Căutarea nu se oprește niciodată", "Verific ca sunt pe partea de start emag"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - landing page EMAG opens correctly");

        //search for aspiratoare

        //Create object of SearchResultsPage
        SearchResultsPage search = new SearchResultsPage(driver);

        // search for aspiratoare and submit
        search.searchTextField("aspiratoare");

        //assert - Check that search results is correct
        System.out.print("CHECK that search by aspiratoare page is correct. I used URL verification - ");
        verificationAssert(driver.getCurrentUrl(), "https://www.emag.ro/search/aspiratoare", "The URL for searching results is not correct"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - search results page is displayed");

        // Așteaptă pentru rezultate
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // XPath for selecting the 3rd aspirator
        WebElement productCard = driver.findElement(By.xpath("//div[@class = 'card-item card-standard js-product-data js-card-clickable '][3]"));

        // Get the value of the data-name attribute for the third apirator from search page
        String dataName = productCard.getAttribute("data-name");
        productCard.click(); // select the 3rd aspirator

        WebElement productDetails = driver.findElement(By.xpath(" //h1[@class='page-title']")); //xPath for aspirator details page to be used for assert
        String productName = productDetails.getText();
        System.out.print("CHECK that the 3rd aspirator details page opens - ");
        verificationAssert(productName,dataName, "The page opened is not correct"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - correct page is displayed");

        WebElement addToCart = driver.findElement(By.xpath("//div[@class='flex-shrink-1 flex-grow-1']")); //XPath for AddTo Cart
        addToCart.click();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement viewCartFromAlert = driver.findElement(By.xpath("//a[@data-dismiss = 'modal']")); //XPath for "Vezi detalii cos" button

        //assert - Check that "Add to Cart " worked by verifying that "Produsul a fost adaugat in cos" text appears on the alert
        WebElement addToCartConfirmation = driver.findElement(By.xpath("//span[@class='d-none d-sm-block']")); //search for confirmation text
        System.out.print("CHECK that the product was added to cart - ");
        verificationAssert(addToCartConfirmation.getText(), "Produsul a fost adaugat in cos", "Produsul a fost adaugat in cos text is not correct or displayed"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - The product was added to cart.");

        viewCartFromAlert.click(); //press "Vezi detalii cos button. "cosul" meu page opens ( opened from Alert)

        //assert - Check that "Cosul meu" page opens.

        WebElement cosulMeuText = driver.findElement(By.xpath(" //h1[text()='Coșul meu']")); //search for Cosul meu text
        System.out.print("CHECK that the Cosul meu page opens (opened from Alert) - ");
        verificationAssert(cosulMeuText.getText(), "Coșul meu", "Cosul meu text is not correct or displayed"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - The cart opens.");

        WebElement cosulMeu = driver.findElement(By.id("my_cart"));
        cosulMeu.click(); //press "Cosul meu button. "cosul" meu page opens ( opened from the menu)

        WebElement cosulMeuTextSecond = driver.findElement(By.xpath(" //h1[text()='Coșul meu']")); //search for Cosul meu text
        System.out.print("CHECK that the Cosul meu page opens (opened from the menu) - ");
        verificationAssert(cosulMeuTextSecond.getText(), "Coșul meu", "Cosul meu text is not correct or displayed"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - The cart opens.");

        WebElement stergeElement = driver.findElement(By.xpath("//div[@class='line-item line-item-footer d-none d-md-block']/div[@class='mb-1']/button[@class='btn btn-link outline-0 fs-12 fs-md-14 btn-remove-product gtm_rp080219 remove-product']"));
        //am localizat butonul sterge

        stergeElement.click(); //produs sters

        WebElement deletedMessage = driver.findElement(By.xpath("//p[@class='mb-0']")); //search for textul: Cosul tau de cumparaturi nu contine produse.
        System.out.print("CHECK that the Cosul meu nu mai contine nici un produs - ");
        String searchedTextPartial = "Cosul tau de cumparaturi nu contine produse.";
        boolean verifyText = deletedMessage.getText().contains(searchedTextPartial);
        assertTrue(verifyText, "Produsul nu a fost corect sters; nu gasim mesajul Cosul tau de cumparaturi nu contine produse");
        System.out.println("PASSED - The product was correctly deleted.");


       driver.close();


    }
}




