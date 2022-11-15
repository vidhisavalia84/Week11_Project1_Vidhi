package Priject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromeBrowser {
    public static class ChromeBrowser {
        public static void main(String[] args) {
            String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            System.setProperty(" webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //lauch url
            driver.get(baseUrl);
            //maximise the window
            driver.manage().window().maximize();

            //get title of the page
            String title=driver.getTitle();
            System.out.println("Title of the page is :"+title);
            //print current url
            String url=driver.getCurrentUrl();
            System.out.println("Current webpage url is : "+url);
            System.out.println("Page source is : "+driver.getPageSource());
            //Enter the email to email field
            WebElement emailFeild=driver.findElement(By.id("Email"));
            emailFeild.sendKeys("test12345@gmail.com");
            WebElement paswordField=driver.findElement(By.id("Password"));
            paswordField.sendKeys("abc123");
            driver.close();

        }


    }
}


