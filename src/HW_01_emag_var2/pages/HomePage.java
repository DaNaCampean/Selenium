package HW_01_emag_var2.pages;

import HW_01_emag_var2.base.BasePage_driver_browser_init;

// HomePage is a Page - needs extends to base package, basePage

public class HomePage extends BasePage_driver_browser_init {

   public String getTitle(){
        // get EMAG title
       System.out.println("sunt in get title from home page");
       System.out.println("DRIVER = " +driver.getTitle());
        return driver.getTitle();
    }
}
