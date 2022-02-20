package com.nopcommerce.tests;

import com.nopcommerce.base.BasePage;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.util.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
///Users/admin/Desktop/CodingISD/JAVA/PageObjectModelAutomationFrameWork/src/main/java/com/nopcommerce/testdata
public class HomePageTest extends BaseTest {


    @Test(priority = 1)
    public  void validatePageTitle(){
        Assert.assertEquals(homePage.getPageTitle(), Constants.PAGE_TITLE);
        Assert.assertTrue(homePage.verifyLogo());
    }
    @Test(priority = 2)
    public void verifyLogoTest(){
        Assert.assertTrue(homePage.verifyLogo());
    }
    @Test(priority = 3)
    public void verifyRegisterLinkTest(){
        Assert.assertTrue(homePage.verifyRegisterLink());//verifyRegisterLinkTest()
    }
    @Test(priority = 4)
    public void verifyLoginTest(){
        Assert.assertTrue(homePage.verifyLoginLink());
    }




}
