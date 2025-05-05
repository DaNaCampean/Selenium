package selenium.LearningPOM_udemy.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.LearningPOM_udemy.pages.HomePage;

import java.util.concurrent.TimeUnit;

public class LogInTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://zoho.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        HomePage home = new HomePage(driver);
       // home.goToSLogIn();
       // home.goToSignUp();
        home.goToSupport();


    }


}
