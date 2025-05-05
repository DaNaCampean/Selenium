package selenium.LearningPOM_udemy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {



    WebDriver driver;
// this driver was never initialized. dar cel de dincolo cu new chrome was initializat.
   // de acceea da erpare cu thi. ca e missing

    //contructor of the Home Page class

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void goToSupport(){
        driver.findElement(By.linkText("Sign Up")).click();

    }

    public void goToSignUp(){
        driver.findElement(By.linkText("Sign Up")).click();
    }

    public void goToSLogIn(){

        driver.findElement(By.linkText("Sign In")).click();
    }


    public void goToZohoEdu(){

    }

    public void goToLearnMore(){

    }

    public void validateFooterLinks(){

    }




}
