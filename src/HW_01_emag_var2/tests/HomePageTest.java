package HW_01_emag_var2.tests;

import org.testng.annotations.Test;

import HW_01_emag_var2.pages.HomePage;

import static HW_01_emag_var1.testCases.TC01_searchAddCartDelete.verificationAssert;

public class HomePageTest extends baseTests{

    @Test
    public  void checkTitle(){
        System.out.println("home page test 111111");
        HomePage home = new HomePage();
        System.out.println("home page test 22222");
       // String actual = home.getTitle();


        //String actual = home.getTitle();


        System.out.println("home page test 11133333111");


        System.out.print("CHECK that EMAG opens ok, by Title - ");
        verificationAssert(home.getTitle(), "eMAG.ro - Căutarea nu se oprește niciodată", "Verific ca sunt pe partea de start emag"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - landing page EMAG opens correctly");


    }
}
