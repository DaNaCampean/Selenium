package Learning_POM_02.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;

    // Localizatoare
    private By aspiratorCards = By.xpath("//div[@class = 'card-item card-standard js-product-data js-card-clickable ']");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement selectThirdProduct() {
        List<WebElement> aspirators = driver.findElements(aspiratorCards);
        return aspirators.get(2); // Selectează al treilea aspirator
    }
}