package Priject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowserPriject1 {
    static WebDriver driver ;
    static  String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
static  String browser="firefox";
    public static void main(String[] args) {




        if(browser.equalsIgnoreCase("crome")) {
            System.setProperty("webdriver.crome.driver", "drivers/chromedriver.exe");
                 driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver=new EdgeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver=new FirefoxDriver();

        }else {
            System.out.println("Invalid browser");
        }
        //set url
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //page source
        System.out.println("Page source is : "+driver.getPageSource());
        //Get title of the page

        System.out.println("Title of teh page is : "+driver.getTitle());
        // Get the url
        System.out.println("Url of the page is : "+driver.getCurrentUrl());
        //Enter the email to email field
        WebElement email=driver.findElement(By.name("Email"));
        email.sendKeys("abcd1234");
        //Enter the password to password field
        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("abc123");
        driver.close();

    }
}