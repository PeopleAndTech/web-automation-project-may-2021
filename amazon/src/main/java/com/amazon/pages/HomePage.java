package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    public void typeOnSearchBar(String text) {
        searchTextBox.sendKeys(text);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

}
