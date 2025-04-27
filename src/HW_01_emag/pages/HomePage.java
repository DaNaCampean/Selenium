package HW_01_emag.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    public String getTitle(){
        // get EMAG title
        return driver.getTitle();
    }






}
