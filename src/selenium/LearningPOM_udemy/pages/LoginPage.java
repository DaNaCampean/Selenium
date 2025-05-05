package selenium.LearningPOM_udemy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.LearningPOM_udemy.basePackage.PageClass;

import java.sql.SQLOutput;

public class LoginPage extends PageClass {

  // REMOVE THIS CAND FACEM EXTENDS //WebDriver driver;
   /* public  LoginPage(WebDriver driver){
        this.driver = driver;
    }
    // REMOVE THIS CAND FACEM EXTENDS
    */

    public void doLogin(String username, String password){

        //driver.switchTo().frame("zohoiam");
       // driver.findElement(By.cssSelector("#lid")).sendKeys(username);
       // driver.findElement(By.cssSelector("#pwd")).sendKeys(password);

      //  driver.findElement(By.cssSelector("#submit_button")).click();
        System.out.println("doLogin from login page");


    }

    public void goToSaleAndMarketing(){

    }

    public void goToFinance(){

    }
}
