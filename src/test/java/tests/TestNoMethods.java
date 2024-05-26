package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNoMethods {
    public WebDriver webDriver;

    @Test
    public void openSomePage(){
        webDriver = new ChromeDriver();
        webDriver.get("https://automationexercise.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement cartPage = webDriver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a[@href='/view_cart']"));
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();",cartPage);
    }
}
