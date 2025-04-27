package Learning_POM_02.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;

    // Localizatoare
    private By addToCartButton = By.xpath("//div[@class='flex-shrink-1 flex-grow-1']");
    private By viewCartButton = By.xpath("//a[@data-dismiss='modal']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        WebElement addToCart = driver.findElement(addToCartButton);
        addToCart.click();
    }

    public void viewCart() {
        WebElement viewCartFromAlert = driver.findElement(viewCartButton);
        viewCartFromAlert.click();
    }
}