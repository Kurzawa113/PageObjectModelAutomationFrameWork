package com.nopcommerce.tests;

import com.nopcommerce.base.BaseTest;
import com.nopcommerce.util.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(value = com.nopcommerce.tests.TestNGListeners.class)

public class SearchPageTest extends BaseTest {
@BeforeMethod
    public void searchPageSetUp(){
    searchPage=homePage.doSearch(prop.getProperty("searchItem"));


}
@Test(priority = 1)
    public void verifySearchPageNameTest(){
    Assert.assertEquals(searchPage.getSearchPageName(), Constants.SEARCHPAGE_NAME);


}
@Test(priority = 2)
    public void verifyManufactureDropdownListTest(){
    Assert.assertTrue(searchPage.verifyManufactureDropDownList());
}

@Test(priority = 3)
public  void validateCategoryListTest(){
    Assert.assertEquals(searchPage.getCategoriesList(),Constants.actualCategoryList());
}
}
