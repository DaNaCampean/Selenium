package Learning_POM_02.tests;


import Learning_POM_02.pages.CartPage;
import Learning_POM_02.pages.HomePage;
import Learning_POM_02.pages.ProductPage;
import Learning_POM_02.pages.SearchResultsPage;
import Learning_POM_02.utility.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
        System.out.println("STARTTTTTTTTTTTTTTTTTT");

        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://emag.ro");

        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        // Assert title
        String actualTitle = driver.getTitle();
        String expectedTitle = "eMAG.ro - Căutarea nu se oprește niciodată";
        assertEquals(actualTitle, expectedTitle, "Verific ca sunt pe partea de start emag");
        System.out.println("ASSERT OK");

        // Căutăm produsul
        homePage.searchForProduct("aspiratoare");
        System.out.println("DONE- CAUTAM PRODUSUL");

        // Așteptăm pentru rezultate
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println("DONE- REZULTATE WAIT");

        // Selectăm al treilea produs
        searchResultsPage.selectThirdProduct().click();
        System.out.println("DONE- selectat prod 333333");

        // Adăugăm produsul în coș
        productPage.addToCart();
        productPage.viewCart();

        // Delogăm produsul din coș
        cartPage.deleteProduct();

        System.out.println("Product deleted from cart.");

        // Închidem driverul
        driver.quit();
    }
}