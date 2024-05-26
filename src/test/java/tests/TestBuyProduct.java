package tests;

import loggerUtility.LoggerUtility;
import objectData.BuyProductObject;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MenPage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;
import sharedData.SharedData;
import org.testng.annotations.Test;

public class TestBuyProduct extends Hooks {
    @Test
    public void buyProductTest(){

        PropertyUtility propertyUtility = new PropertyUtility("BuyProduct");
        BuyProductObject buyProductObject = new BuyProductObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
//        homePage.acceptCookies();

        LoginPage loginPage = new LoginPage(getWebDriver());
        MenPage menPage = new MenPage(getWebDriver());
        CartPage cartPage = new CartPage(getWebDriver());

        homePage.navigateToAccountPage();
        loginPage.loginUser(buyProductObject);
        homePage.navigateToProductsPage();
        menPage.navigateToMenTshirts();
        menPage.addTshirtGreen();
        homePage.navigateToCart();
        cartPage.buyAndPay(buyProductObject);
        LoggerUtility.infotest("!!!!!!!! LOG IN TEST, NU IN PAGINA !!!!!!!");
    }
}
