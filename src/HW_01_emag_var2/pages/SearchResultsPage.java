package HW_01_emag_var2.pages;
import HW_01_emag_var2.base.BasePage_driver_browser_init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BasePage_driver_browser_init {

    //Locator for search textField
    By searchTextFieldById = By.id("searchboxTrigger");

    //Method to enter search text

    public void searchTextField (String searchText){
        WebElement searchField = driver.findElement(searchTextFieldById);
        searchField.sendKeys(searchText);
        searchField.submit();
    }
    public String getCurrentURL(){
        // get EMAG page URL
        return driver.getCurrentUrl();
    }


}



/*




     // XPath for selecting the 3rd aspirator
    By productCardByXPath = By.xpath("//div[@class = 'card-item card-standard js-product-data js-card-clickable '][2]");

    public String returnDataName () {
        WebElement product = driver.findElement(productCardByXPath);
        return product.getAttribute("data-name");

    }

    public void selectProduct (){
        WebElement product = driver.findElement(productCardByXPath);
        product.click(); // select the 3rd aspirator

        // Get  the value of the data-name attribute for the third apirator from search page


    }


    //xPath for aspirator details page to be used for assert
    By productDetailsXPath = By.xpath(" //h1[@class='page-title']");

    public String getTitle(){
        WebElement productTitle = driver.findElement(productDetailsXPath);
        // get product selected title
        return productTitle.getText();
    }

}

 */