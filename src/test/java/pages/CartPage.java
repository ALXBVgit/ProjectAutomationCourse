package pages;

import loggerUtility.LoggerUtility;
import objectData.BuyProductObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends CommonPage{
    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = "//div[@class='col-sm-6']/a[@class='btn btn-default check_out']")
    WebElement checkOutButton;
    @FindBy(xpath = "//div/a[@href='/payment']")
    WebElement payButton;
    @FindBy(xpath = "//div[@class='col-sm-12 form-group']/input")
    WebElement cardnameField;
    @FindBy(xpath = "//div[@class='col-sm-12 form-group card']/input")
    WebElement cardNumberField;
    @FindBy(xpath = "//div[@class='form-row']/div/input[@name='cvc']")
    WebElement cvcField;
    @FindBy(xpath = "//div[@class='form-row']/div/input[@name='expiry_month']")
    WebElement expiryMonth;
    @FindBy(xpath = "//div[@class='form-row']/div/input[@name='expiry_year']")
    WebElement expiryYear;
    @FindBy(id = "submit")
    WebElement placeOrderButton;

    public void buyAndPay(BuyProductObject buyProductObject){
        elementMethods.clickElement(checkOutButton);
        LoggerUtility.infotest("User clicks on checkout button");
        elementMethods.scrollPageByPixel(0,450);
        LoggerUtility.infotest("Scroll page vertically");
        elementMethods.clickForceElement(payButton);
        LoggerUtility.infotest("Click on pay button");
        elementMethods.fillElement(cardnameField, buyProductObject.getCardNameValue());
        LoggerUtility.infotest("Enter card user details");
        elementMethods.fillElement(cardNumberField, buyProductObject.getCardNumberValue());
        LoggerUtility.infotest("Enter card number");
        elementMethods.fillElement(cvcField, buyProductObject.getCvcValue());
        LoggerUtility.infotest("Enter card code");
        elementMethods.fillElement(expiryMonth, buyProductObject.getExpirationMonthValue());
        LoggerUtility.infotest("Enter card expiration month");
        elementMethods.fillElement(expiryYear, buyProductObject.getExpirationYearValue());
        LoggerUtility.infotest("Enter card expiration year");
        elementMethods.clickForceElement(placeOrderButton);
        LoggerUtility.infotest("Click place order button");
    }
}
