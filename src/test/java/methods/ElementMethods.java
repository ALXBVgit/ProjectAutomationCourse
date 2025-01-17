package methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementMethods {
    private WebDriver webDriver;

    public ElementMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void scrollPageByPixel(Integer x, Integer y){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy("+x+","+y+")", "");
    }
    public void waitVisibleElement (WebElement element){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void clickElement(WebElement element){
        waitVisibleElement(element);
        element.click();
    }
    public void clickForceElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();",element);
    }
    public void fillElement(WebElement element, String value){
        waitVisibleElement(element);
        element.sendKeys(value);
    }
    public void selectTextElement(WebElement element, String value){
        waitVisibleElement(element);
        Select select=new Select(element);
        select.selectByVisibleText(value);
    }
    public void selectValueElement(WebElement element, String value) {
        waitVisibleElement(element);
        Select select = new Select(element);
        select.selectByValue(value);
    }
}
