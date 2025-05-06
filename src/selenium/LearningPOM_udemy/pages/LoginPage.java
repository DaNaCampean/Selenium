package selenium.LearningPOM_udemy.pages;

import org.openqa.selenium.By;
import selenium.LearningPOM_udemy.basePackage.Page;

public class LoginPage extends Page {

  // REMOVE THIS CAND FACEM EXTENDS //WebDriver driver;
   /* public  LoginPage(WebDriver driver){
        this.driver = driver;
    }
    // REMOVE THIS CAND FACEM EXTENDS
    */

    public void doLogin(String username, String password){


      // driver.findElement(By.linkText("Sign In")).click();
       driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys(username);
       driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

        driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
       // driver.findElement(By.cssSelector("#pwd")).sendKeys(password);

      //  driver.findElement(By.cssSelector("#submit_button")).click();
        System.out.println("doLogin from login page");


    }

    public void goToSaleAndMarketing(){

    }

    public void goToFinance(){

    }
}
