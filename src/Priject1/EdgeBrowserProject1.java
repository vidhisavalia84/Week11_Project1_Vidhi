package Priject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserProject1 {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //launch url
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //get current url

        System.out.println("Url f the current page  " + driver.getCurrentUrl());
        //get title of the page
        System.out.println("Title of the webpage  " + driver.getTitle());
        //get page source
        System.out.println("Page source is : " + driver.getPageSource());
        //Enter email address into email field
        WebElement loginLink = driver.findElement(By.id("Email"));
        loginLink.sendKeys("abcd1234@gmail.com");

        //Enter password into password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("abc1234");
       // driver.close();

    }


}