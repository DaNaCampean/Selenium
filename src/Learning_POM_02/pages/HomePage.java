package Learning_POM_02.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    // Localizatoare
    private By searchBox = By.id("searchboxTrigger");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForProduct(String productName) {
        WebElement searchField = driver.findElement(searchBox);
        searchField.sendKeys(productName);
        searchField.submit();
    }
}