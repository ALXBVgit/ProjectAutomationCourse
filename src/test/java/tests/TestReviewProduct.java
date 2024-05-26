package tests;

import pages.HomePage;
import pages.MenPage;
import sharedData.SharedData;
import org.testng.annotations.Test;

public class TestReviewProduct extends SharedData {

    @Test
    public void reviewProductTest(){
        HomePage homePage = new HomePage(getWebDriver());
        MenPage menPage = new MenPage(getWebDriver());
    }
}
