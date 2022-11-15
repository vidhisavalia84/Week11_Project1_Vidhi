package Priject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserProject1 {
    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        //set Url on Firefox browser
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //Get title
        String title=driver.getTitle();
        System.out.println("Title of the Page : "+title);
        //get Pagesource
        String pageSource=driver.getPageSource();
        System.out.println("Page source is :"+ pageSource);
        //get Url
        String url=driver.getCurrentUrl();
        System.out.println("Current Url is : "+url);
        //Enter the email to email field
        WebElement emailField=driver.findElement(By.name("Email"));
        emailField.sendKeys("abcd1234@gmail.com");
        //Enter the password to password field
        WebElement password=driver.findElement(By.name("Password"));
        password.sendKeys("abc123");
        driver.close();


    }
}
