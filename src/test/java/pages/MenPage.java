package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenPage extends CommonPage{
    public MenPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "Men")
    WebElement manCategory;
    @FindBy(xpath = "//div[@class='panel-body']/ul/li/a[@href='/category_products/3']")
    WebElement manTshirts;
    @FindBy(xpath = "//div[@class='panel-body']/ul/li/a[@href='/category_products/6']")
    WebElement manJeans;
    @FindBy(xpath = "//div[@class='product-image-wrapper']/div/ul/li/a[@href='/product_details/2']")
    WebElement tShirtGreen;
    @FindBy(xpath = "//div[@class='product-information']/span/button[@class='btn btn-default cart']")
    WebElement addToCartButton;
    @FindBy(xpath = "//div[@class='modal-footer']/button")
    WebElement continueShoppingButton;

    public void navigateToMenTshirts(){
        elementMethods.clickForceElement(manCategory);
        LoggerUtility.infotest("Click on MEN cathegory");
        elementMethods.clickForceElement(manTshirts);
        LoggerUtility.infotest("UClick on MEN Tshirts");
    }
    public void navigateToMenJeans(){
        elementMethods.clickElement(manCategory);
        elementMethods.clickElement(manJeans);
    }
    public void addTshirtGreen(){
        elementMethods.scrollPageByPixel(0, 250);
        LoggerUtility.infotest("Scroll down");
        elementMethods.clickElement(tShirtGreen);
        LoggerUtility.infotest("Click on Men green shirt");
        elementMethods.clickElement(addToCartButton);
        LoggerUtility.infotest("Clicks add to cart button");
        elementMethods.clickElement(continueShoppingButton);
        LoggerUtility.infotest("Click on continue shopping");
    }
}
