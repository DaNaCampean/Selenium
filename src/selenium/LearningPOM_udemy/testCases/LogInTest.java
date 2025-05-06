package selenium.LearningPOM_udemy.testCases;


//import selenium.LearningPOM_udemy.pages.HomePage;
//import selenium.LearningPOM_udemy.pages.LoginPage;
//import selenium.LearningPOM_udemy.pages.ZooAppPage;

import selenium.LearningPOM_udemy.basePackage.Page;
import selenium.LearningPOM_udemy.pages.HomePage;
import selenium.LearningPOM_udemy.pages.LoginPage;
import selenium.LearningPOM_udemy.pages.ZooAppPage;
import selenium.LearningPOM_udemy.pages.crm.accounts.AccountsPage;
import selenium.LearningPOM_udemy.pages.crm.accounts.CreateAccountPage;

import java.util.concurrent.TimeUnit;

public class LogInTest extends Page {


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
        login.doLogin("dana.campean@yahoo.com", "Softvision@10");

        ZooAppPage zp = new ZooAppPage();
        zp.goToCRM();
       // Page.menu.signOut();
        //sau
        Page.menu.gotoAccounts();
       AccountsPage account = new AccountsPage();
       account.gotoCreateAccounts();
       CreateAccountPage cap = new CreateAccountPage();
        cap.createAccount("Dana");


        // driver.manage.window.maximize(); - these are 3 different methods, coming from 3 different clase
        // nu creeam obiecte,straint forward....we are getting them from clases, si sunt returnate din metode din clase
        //PON zice ca fiecare metoda e responsabila sa te duca in o pagina si sa returneze un object of that page.
       // daca pove de goto login, ....


       // home.goToSignUp();
       // home.goToSupport();


    }


}
