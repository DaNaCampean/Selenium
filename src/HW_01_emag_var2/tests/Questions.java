package HW_01_emag_var2.tests;

public class Questions {

    /*
    1. Top menu stuff care e accesat din multe pagini, gen search, emag, cos, fav
    2. clasa separata pentru locatori?
    3. daca vreau sa fac setup de windows sau mac...cum e mai ok?
    -- sa fac 2 clase BasePageDrive? sau ceva metode inside una????


varianta sa pun in base page?
  public WebDriver driverSetupMac(){
        System.out.println("driversetupMac");
        System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }
    si accesat din test cases cu :    HomePage home = new HomePage();
                                      home.driverSetupMac();



     */
}
