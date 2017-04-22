package Sportsdirect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Mehul on 22/11/2016.
 */
public class TestSuitsNike extends DriverManager
{

    @BeforeMethod
     public static void OpenBro()
    {
        DriverManager.OpenBrowserSports();
    }
        @AfterMethod
        public static void colesbr()
        {
            DriverManager.CloseBrowsers();
        }

    @Test
    public void nike ()
    {
        Nikepage nikepage = new Nikepage();
        nikepage.NikeFinder();


        List<WebElement>nike=driver.findElements(By.xpath(".//*[@id='navlist']/li/div/div[2]/div[1]/div[1]/a/span[1]"));
        System.out.println("Total number of Nike Trainers ");
        System.out.println(nike.size());



        List<WebElement>nikeMustgo=driver.findElements(By.xpath(".//*[@id='navlist']/li/div/div[1]/a[1]/img"));
        System.out.println("Number of MustGo and preOrder item");
        System.out.println(nikeMustgo.size());



    }

}
