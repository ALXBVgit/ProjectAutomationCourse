package sharedData;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.bidi.log.Log;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData{


    private String testName;

    @BeforeMethod
    public void prepareEnvironment(){
        testName = this.getClass().getSimpleName();
        LoggerUtility.startTestCase(testName);
        prepareDriver();
        LoggerUtility.infotest("Driwar was opened succesfully");
    }

    @AfterMethod
    public void clearEnvironment(ITestResult result){
        if (!result.isSuccess()){
            LoggerUtility.errorTest(result.getThrowable().getMessage());
        }
        clearDriver();
        LoggerUtility.infotest("Driver was closed succesfully");
        LoggerUtility.finishTestCase(testName);
    }
}
