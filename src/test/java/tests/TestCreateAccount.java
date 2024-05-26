package tests;

import objectData.CreateAccountObject;
import pages.HomePage;
import pages.LoginPage;
import pages.NewAccountFormPage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;
import sharedData.SharedData;
import org.testng.annotations.Test;

public class TestCreateAccount extends Hooks {
    @Test
    public void createUserTest(){

        PropertyUtility propertyUtility = new PropertyUtility("CreateAccount");
        CreateAccountObject createAccountObject = new CreateAccountObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
//        homePage.acceptCookies();
        homePage.navigateToAccountPage();

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.createNewAccount(createAccountObject);

        NewAccountFormPage newAccountFormPage = new NewAccountFormPage(getWebDriver());
        newAccountFormPage.fillInFirstName(createAccountObject);
        newAccountFormPage.fillInLastName(createAccountObject);
        newAccountFormPage.fillInPassword(createAccountObject);

        newAccountFormPage.pickDateOfBirth(createAccountObject);
        newAccountFormPage.acceptNewsletter();
        newAccountFormPage.acceptPartnerOffer();
        newAccountFormPage.fillInAddress(createAccountObject);
        newAccountFormPage.selectCountry(createAccountObject);
        newAccountFormPage.fillInState(createAccountObject);
        newAccountFormPage.fillInCity(createAccountObject);
        newAccountFormPage.fillInZipCode(createAccountObject);
        newAccountFormPage.fillInMobileNumber(createAccountObject);
        newAccountFormPage.createAccount();
        newAccountFormPage.continueButton();
//        homePage.deleteAccount();
    }
}
