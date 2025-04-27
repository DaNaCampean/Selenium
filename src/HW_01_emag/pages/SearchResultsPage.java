package HW_01_emag.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SearchResultsPage {


    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locator for search textField
    By searchTextFieldById = By.id("searchboxTrigger");

    //Method to enter search text

    public void searchTextField (String searchText){
        WebElement searchField = driver.findElement(searchTextFieldById);
        searchField.sendKeys(searchText);
        searchField.submit();
    }


}
