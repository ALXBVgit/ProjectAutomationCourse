package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonPage{
    public HomePage(WebDriver webDriver){
        super(webDriver);
    }
    @FindBy(className = "fc-button-label")
    private WebElement consentField;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a/i[@class='fa fa-home']")
    WebElement homePageLink;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/products']")
    WebElement productsPage;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/view_cart']")
    WebElement cartPage;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/login']")
    WebElement accountPage;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/test_cases']")
    WebElement testsPage;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/api_list']")
    WebElement apiPage;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a/i[@class='fa fa-youtube-play']")
    WebElement tutorualsPage;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/contact_us']")
    WebElement contactPage;

    //delete button is only available if account is created and user is logged in
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[@href='/delete_account']")
    WebElement deleteAccountButton;

    public void acceptCookies(){
        elementMethods.clickElement(consentField);
    }

    public void navgateToHomepage(){
        elementMethods.clickForceElement(homePageLink);
    }
    public void navigateToProductsPage(){
        elementMethods.clickForceElement(productsPage);
    }
    public void navigateToCart(){
        elementMethods.clickForceElement(cartPage);
    }
    public void navigateToAccountPage(){
        elementMethods.clickForceElement(accountPage);
    }
    public void navigateToTestCases(){
        elementMethods.clickElement(testsPage);
    }
    public void navigateToAPIPage(){
        elementMethods.clickElement(apiPage);
    }
    public void nagivateToTutorialsPage(){
        elementMethods.clickElement(tutorualsPage);
    }
    public void navigateToContactPage(){
        elementMethods.clickElement(contactPage);
    }
    public void deleteAccount(){
        elementMethods.clickElement(deleteAccountButton);
    }
}
