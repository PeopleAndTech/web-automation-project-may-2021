package com.amazon.tests;

import com.pnt.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {


    @Test
    public void validateUserBeingAbleToSearchForAnItem() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java Books");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
