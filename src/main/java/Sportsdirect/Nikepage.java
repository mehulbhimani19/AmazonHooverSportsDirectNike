package Sportsdirect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mehul on 22/11/2016.
 */
public class Nikepage extends DriverManager
{
    @FindBy (xpath = ".//*[@id='txtSearch']")
    WebElement  _EnterNike;

    @FindBy (xpath = ".//*[@id='cmdSearch']/span")
    WebElement _click;
    @FindBy (linkText = "Trainers")
    WebElement _TreinerClick;

    public void NikeFinder ()
    {
        Utility.enterText( _EnterNike , "Nike");
        Utility.clickOnElement( _click);
        Utility.clickOnElement( _TreinerClick);


    }
}
