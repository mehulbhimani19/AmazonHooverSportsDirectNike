package Sportsdirect;

import org.openqa.selenium.WebElement;

/**
 * Created by Mehul on 22/11/2016.
 */
public class Utility extends DriverManager
{
    public static void enterText(WebElement element, String text)
   { element.sendKeys(text);

    }
    public static void clickOnElement(WebElement element)

    {
        element.click();

    }

       public static String getText (WebElement element)
       {  return element.getText();

      }


}
