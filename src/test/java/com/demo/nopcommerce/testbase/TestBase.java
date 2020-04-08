package com.demo.nopcommerce.testbase;

import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Pradip
 */
//test base class extends with base page class
public class TestBase extends BasePage {

    //object created for browser selector
    BrowserSelector browserSelector = new BrowserSelector();
    //string to define URL of website
    String baseUrl = "https://demo.nopcommerce.com/";

    //before method of testNG
    @BeforeMethod
    //browser opening
    public void openBrowser(){
        browserSelector.selectBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

     //after method of testNG
    }@AfterMethod
    //browser closing
    public void tearDown(){
        driver.quit();
    }
}
