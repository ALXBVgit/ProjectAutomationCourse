package pages;

import loggerUtility.LoggerUtility;
import methods.ElementMethods;
import objectData.BuyProductObject;
import objectData.CreateAccountObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonPage{
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }
    ElementMethods elementMethods = new ElementMethods(webDriver);

    @FindBy(xpath = "//div[@class='signup-form']/form/input[@placeholder='Name']")
    WebElement newNameField;
    @FindBy(xpath = "//div[@class='signup-form']/form/input[@placeholder='Email Address']")
    WebElement newEmailAddressField;
    @FindBy(xpath = "//div[@class='signup-form']/form/button[@class='btn btn-default']")
    WebElement signUpButton;
    @FindBy(xpath = "//div[@class='login-form']/form/input[@placeholder='Email Address']")
    WebElement loginEmailField;
    @FindBy(xpath = "//div[@class='login-form']/form/input[@placeholder='Password']")
    WebElement loginPasswordField;
    @FindBy(xpath = "//div[@class='login-form']/form/button[@class='btn btn-default']")
    WebElement loginButton;

    public void createNewAccount(CreateAccountObject createAccountObject){
        elementMethods.waitVisibleElement(newNameField);
        LoggerUtility.infotest("Wait for field visibility");
        elementMethods.fillElement(newNameField, createAccountObject.getNameValue());
        LoggerUtility.infotest("Complete name field");
        elementMethods.fillElement(newEmailAddressField, createAccountObject.getEmailValue());
        LoggerUtility.infotest("Complete email field");
        elementMethods.clickElement(signUpButton);
        LoggerUtility.infotest("Click Signup button");
    }
    public void loginUser(BuyProductObject buyProductObject){
        elementMethods.waitVisibleElement(loginEmailField);
        LoggerUtility.infotest("Wait for field visibility");
        elementMethods.fillElement(loginEmailField, buyProductObject.getUserEmalValue());
        LoggerUtility.infotest("Complete email field");
        elementMethods.fillElement(loginPasswordField, buyProductObject.getUserPasswordValue());
        LoggerUtility.infotest("Complete password field");
        elementMethods.clickForceElement(loginButton);
        LoggerUtility.infotest("Click Login button");
    }
}
