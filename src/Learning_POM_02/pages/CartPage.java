package Learning_POM_02.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;

    // Localizatoare
    private By deleteButton = By.xpath("//div[@class='line-item line-item-footer d-none d-md-block']/div[@class='mb-1']/button[@class='btn btn-link outline-0 fs-12 fs-md-14 btn-remove-product gtm_rp080219 remove-product']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void deleteProduct() {
        WebElement deleteElement = driver.findElement(deleteButton);
        deleteElement.click();
    }
}