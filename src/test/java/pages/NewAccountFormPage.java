package pages;

import loggerUtility.LoggerUtility;
import objectData.CreateAccountObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountFormPage extends CommonPage{
    public NewAccountFormPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "days")
    WebElement dayofBirth;
    @FindBy(id = "months")
    WebElement monthOfBirth;
    @FindBy(id = "years")
    WebElement yearOfBirth;
    @FindBy(id = "newsletter")
    WebElement newsletterConsent;
    @FindBy(id = "optin")
    WebElement partnerConsent;
    @FindBy(id = "first_name")
    WebElement firstName;
    @FindBy(id = "last_name")
    WebElement lastName;
    @FindBy(id = "address1")
    WebElement address1;
    @FindBy(id = "country")
    WebElement country;
    @FindBy(id = "state")
    WebElement state;
    @FindBy(id = "city")
    WebElement city;
    @FindBy(id = "zipcode")
    WebElement zipcode;
    @FindBy(id = "mobile_number")
    WebElement mobileNumber;
    @FindBy(xpath = "//div[@class='login-form']/form/button[@class='btn btn-default']")
    WebElement createAccountButton;
    @FindBy(xpath = "//div[@class='pull-right']/a[@class='btn btn-primary']")
    WebElement continueButton;


    public void fillInPassword(CreateAccountObject createAccountObject){
        elementMethods.fillElement(password, createAccountObject.getPasswordValue());
    }
    public void acceptNewsletter(){
        elementMethods.clickElement(newsletterConsent);
    }
    public void acceptPartnerOffer(){
        elementMethods.clickForceElement(partnerConsent);
    }
    public void fillInFirstName(CreateAccountObject createAccountObject){
        elementMethods.fillElement(firstName, createAccountObject.getFirstNameValue());
    }
    public void fillInLastName(CreateAccountObject createAccountObject){
        elementMethods.fillElement(lastName, createAccountObject.getLastNameValue());
    }
    public void selectCountry(CreateAccountObject createAccountObject){
        elementMethods.clickElement(country);
        elementMethods.selectTextElement(country, createAccountObject.getCountryValue());
    }
    public void fillInAddress(CreateAccountObject createAccountObject){
        elementMethods.fillElement(address1, createAccountObject.getAddressValue());
    }
    public void fillInState(CreateAccountObject createAccountObject){
        elementMethods.fillElement(state, createAccountObject.getStateValue());
    }
    public void fillInCity(CreateAccountObject createAccountObject){
        elementMethods.fillElement(city, createAccountObject.getCityvalue());
    }
    public void fillInZipCode(CreateAccountObject createAccountObject){
        elementMethods.fillElement(zipcode, createAccountObject.getZipPValue());
    }
    public void fillInMobileNumber(CreateAccountObject createAccountObject){
        elementMethods.fillElement(mobileNumber, createAccountObject.getMobileNumber());
    }
    public void pickDateOfBirth(CreateAccountObject createAccountObject){
        elementMethods.clickElement(dayofBirth);
        LoggerUtility.infotest("Click on date of birth");
        elementMethods.selectValueElement(dayofBirth, createAccountObject.getDayValue());
        LoggerUtility.infotest("Select date of birth from date pucker");
        elementMethods.clickElement(monthOfBirth);
        LoggerUtility.infotest("Click on the month of birth");
        elementMethods.selectTextElement(monthOfBirth, createAccountObject.getMonthValue());
        LoggerUtility.infotest("Select the month of birth");
        elementMethods.clickElement(yearOfBirth);
        LoggerUtility.infotest("Click on year of birth");
        elementMethods.selectValueElement(yearOfBirth, createAccountObject.getYearValue());
        LoggerUtility.infotest("Select the year of birth");
    }
    public void createAccount(){
        elementMethods.clickForceElement(createAccountButton);
        LoggerUtility.infotest("Click the create account button");
    }
    public void continueButton(){
        elementMethods.clickElement(continueButton);
        LoggerUtility.infotest("Click on continue button");
    }
}
