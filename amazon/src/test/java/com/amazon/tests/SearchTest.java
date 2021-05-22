package com.amazon.tests;

import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    private static Logger LOGGER = Logger.getLogger(SearchTest.class);

    @Test
    public void validateUserBeingAbleToSearchForAnItem() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java Books");
        ExtentTestManager.log("Java Books typed in the search bar", LOGGER);
        driver.findElement(By.id("nav-search-submit-button")).click();

        ExtentTestManager.log("Clicked on the search button", LOGGER);
    }

}
