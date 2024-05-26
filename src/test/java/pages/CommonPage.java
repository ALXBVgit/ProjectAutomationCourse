package pages;

import methods.ElementMethods;
import methods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
    public WebDriver webDriver;
    public ElementMethods elementMethods;
    public WindowMethods windowMethods;

    public CommonPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        elementMethods = new ElementMethods(webDriver);
        windowMethods = new WindowMethods(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
