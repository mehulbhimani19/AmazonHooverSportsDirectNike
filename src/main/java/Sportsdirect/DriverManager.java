package Sportsdirect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 22/11/2016.
 */
public class DriverManager
{
    protected static WebDriver driver;

    public DriverManager() {
        PageFactory.initElements(driver,this);
    }


    public static void OpenBrowserSports()      // sports direct nike trainers count in page
    {
        String browser ="chrome";
        if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\chromedriver_win32(1)\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","src\\test\\Resources\\chromedriver_win32(1)\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else
        {
            driver = new FirefoxDriver();
        }
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.sportsdirect.com/");
    }

    public static void OpenBrowserAmazon()        // for amazon hover
   {
       String browser ="ie";
       if (browser.equalsIgnoreCase("chrome"))
       {
           System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\chromedriver_win32(1)\\chromedriver.exe");
           driver = new ChromeDriver();
           System.out.println("Chrome works ");
       }
       else if (browser.equalsIgnoreCase("ie"))
       {
           System.setProperty("webdriver.ie.driver","src\\test\\Resources\\chromedriver_win32(1)\\IEDriverServer.exe");
           driver = new InternetExplorerDriver();
           System.out.println("IE works ");
       }
       else
       {
           driver = new FirefoxDriver();
       }
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.get("https://www.amazon.co.uk/");

    }



    public static void CloseBrowsers()
    {
        driver.quit();
    }

}
