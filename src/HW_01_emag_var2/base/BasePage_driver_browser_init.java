package HW_01_emag_var2.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage_driver_browser_init {

    public static WebDriver driver;

    public BasePage_driver_browser_init() {

        if (driver == null) {
            System.out.println("sunt in base page din base pack");
            //  System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
            System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-search-engine-choice-screen");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://emag.ro");
            System.out.println("DRIVERwwwwwwz = " +driver.getTitle());
        }
    }

    public static void browserQuit() {
        driver.quit();
    }


}
