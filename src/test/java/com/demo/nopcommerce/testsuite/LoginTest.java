package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by Pradip
 */
//login test class extends with test base class
public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    //object created
    @Test
    public void verifyUserShouldNavigateToLoginFeature(){
        //below methods calling from pages package
        homePage.clickOnLoginFeature();
        //compare expected with actual result
        String expectedResult= "Welcome, Please Sign In!";
        String actualResult = loginPage.getWelcomeMessage();
        Assert.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void verifyUserShouldLoginWithValidCredentialsSuccessfully(){
        //below methods calling from pages package
        homePage.clickOnLoginFeature();
        loginPage.waitForVisibilityToseeElement();
        loginPage.enterEmailId();
        loginPage.enterPassword();
        loginPage.setClickOnLoginButton();
        //compare expected with actual result
        String expectedResult = "Welcome to our store";
        String actualResult = loginPage.welcomeToStore();
        Assert.assertEquals(expectedResult,actualResult);

    }
}
