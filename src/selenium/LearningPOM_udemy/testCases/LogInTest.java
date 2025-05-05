package selenium.LearningPOM_udemy.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import selenium.LearningPOM_udemy.pages.HomePage;
import selenium.LearningPOM_udemy.pages.LoginPage;
import selenium.LearningPOM_udemy.pages.ZooAppPage;

import java.util.concurrent.TimeUnit;

public class LogInTest {


    public static void main(String[] args) {

    //REMOVE THE BELOW, PT CA LE-AM PUS DINCOLO
       /* // System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://zoho.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        */
        HomePage home = new HomePage();
        home.goToLogIn();
      //   LoginPage login = new LoginPage(driver); - ASTA E ORIGINAL INAINTE DE EXTENDS

        LoginPage login = new LoginPage();
       // login.doLogin("trainer@way2automation.com", "Selenium@123");
        System.out.println("Test from LogIn page");

        ZooAppPage zp = new ZooAppPage();
        zp.goToChat();



       // home.goToSignUp();
       // home.goToSupport();


    }


}
