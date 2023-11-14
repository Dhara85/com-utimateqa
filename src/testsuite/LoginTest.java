package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    static String baseUrl = "https://courses.ultimateqa.com/ ";

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        //Maximize the window
        driver.manage().window().maximize();
        //Timeout for hold the page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Print the title of the page.
        System.out.println(driver.getTitle());
        //Print the current url.
        System.out.println(driver.getCurrentUrl());
        //Print the page source
        System.out.println(driver.getPageSource());
        //Click on sign in link
        driver.findElement(By.linkText("Sign In")).click();
        //Print the current url
        System.out.println(driver.getCurrentUrl());
        //Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("selenium456@yahoo.com");
        //Enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("abc123");
        //Click on login button
        driver.findElement(By.partialLinkText("Sign")).click();
        //Navigate to the base URL
        driver.navigate().to(baseUrl);
        //Navigate forward to Homepage.
        driver.navigate().forward();
        //Navigate back to baseUrl
        driver.navigate().back();
        //Refresh the page
        driver.navigate().refresh();
        //Close the browser
        driver.quit();

    }
}
