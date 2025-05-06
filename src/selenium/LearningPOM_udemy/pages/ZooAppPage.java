package selenium.LearningPOM_udemy.pages;

import org.openqa.selenium.By;
import selenium.LearningPOM_udemy.basePackage.Page;

public class ZooAppPage extends Page {

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
        driver.findElement(By.xpath("//div[@class='app-nm' and text()='CRM']")).click();
    }

    public void gotoSales(){
        System.out.println("SALES");
    }

}
