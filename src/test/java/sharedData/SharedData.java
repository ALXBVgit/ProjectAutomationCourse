package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {
    private WebDriver webDriver;
    public void prepareDriver(){
        webDriver = new ChromeDriver();
        webDriver.get("https://automationexercise.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void clearDriver(){
//        webDriver.quit();
    }
    public WebDriver getWebDriver(){
        return webDriver;
    }
}
