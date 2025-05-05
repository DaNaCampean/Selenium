package selenium.LearningPOM_udemy.pages;

import org.openqa.selenium.WebDriver;
import selenium.LearningPOM_udemy.basePackage.PageClass;

public class ZooAppPage extends PageClass {

  //  WebDriver driver; // REMOVE THIS CAND FACEM EXTENDS

    // REMOVE THIS CAND FACEM EXTENDS
    /*public ZooAppPage(WebDriver driver){
        this.driver = driver;
    }

     */

    public void  goToChat(){
        System.out.println("Chat");

    }

    public void goToCRM(){
        System.out.println("CRM");
    }

}
