package HW_01_emag.BrowserSetup;

import static org.testng.Assert.assertEquals;

public class AssertStuff {

    public void verificationAsser(String actualResult, String expectedResult, String verifText){
        assertEquals(actualResult, expectedResult, verifText);

    }

}
