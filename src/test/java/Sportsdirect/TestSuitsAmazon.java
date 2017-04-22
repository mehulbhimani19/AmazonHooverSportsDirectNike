package Sportsdirect;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Mehul on 23/11/2016.
 */
public class TestSuitsAmazon extends DriverManager
{ @BeforeMethod
    public static void OpenBr ()
  {
    DriverManager.OpenBrowserAmazon();
  }
     @AfterMethod
    public static void CloseBr(){
//         driver.quit();
     }
     @Test
    public void AmazonHover ()
     {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
         amazonHomePage.DepartmentSelection();

     }
}
