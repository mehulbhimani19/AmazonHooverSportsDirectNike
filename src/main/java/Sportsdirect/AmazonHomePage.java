package Sportsdirect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static Sportsdirect.DriverManager.driver;

/**
 * Created by Mehul on 23/11/2016.
 */
public class AmazonHomePage extends DriverManager
{
    @FindBy (xpath =" .//*[@id='nav-link-shopall']")
    private WebDriver  _Department;

    @FindBy ( xpath = ".//*[@id='nav-flyout-shopAll']/div[2]/span[13]/span")
    private WebDriver _ToyChildrenBaby;

    @FindBy (xpath = ".//*[@id='nav-flyout-shopAll']/div[3]/div[14]/div/a[3]/span")
    private WebElement _baby;

    public  void DepartmentSelection()
    {
        Actions action = new Actions(driver);
        WebElement DepartmentSelection = driver.findElement(By.xpath(".//*[@id='nav-link-shopall']"));
        action.moveToElement(DepartmentSelection).build().perform();
        System.out.println(" Department open");



       // WebElement ChilAndBaby = driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[13]/span"));
        WebElement ChilAndBaby = driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[14]/span"));
        action.moveToElement(ChilAndBaby).build().perform();
        System.out.println(" move to Toy, Children and Baby section");


        WebElement BabyCloth = driver.findElement(By.linkText("Kids' Clothing"));
        action.moveToElement(BabyCloth).doubleClick().build().perform();
        System.out.println(" move to baby cloth section");


    Assert.assertEquals(driver.findElement(By.cssSelector(".bxw-pageheader__title__text>h1")).getText(),"KIDS' CLOTHES");
        System.out.println("Test is Pass.");


    }

}

