package selenium.LearningPOM_udemy.basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class PageClass {

    /*
    HomePage is a Page
    LoginPage is a Page
    ZohoAppPage is a Page
     */

    public static WebDriver driver;
    //daca le facem static, driverul se creeaza odata doar. daca vreti la fioecare test
    //alt browser, NU se face static.
    //daca nu e static, se porneste de 3 ori chromeul

    public PageClass(){

        if (driver==null){

            System.out.println("DRIVER NULL IFFFF");
            // System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-search-engine-choice-screen");

            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }




    }
}
