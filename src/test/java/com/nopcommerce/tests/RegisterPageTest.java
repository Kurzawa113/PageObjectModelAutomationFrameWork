package com.nopcommerce.tests;

import com.nopcommerce.base.BaseTest;
import com.nopcommerce.util.ExcelUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
    @BeforeMethod
    public void registerPageSetUp() {
        registerPage = homePage.goToRegisterPage();

    }

    @Test(dataProvider = "getUserData")
    public void registerNewUser(String gender, String firstName, String lastName, String day, String month, String year,
                                String email, String company, String password) {


        registerPage.registerNewUser(gender, firstName, lastName, day, month, year, email, company, password);
        Assert.assertTrue(homePage.verifyMyAccountLink());


    }

    @DataProvider
    public Object[][] getUserData() {
        Object data[][] = ExcelUtil.getTestData("Sheet1");
        return data;
    }


}
