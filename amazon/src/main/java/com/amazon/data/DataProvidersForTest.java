package com.amazon.data;

import org.testng.annotations.DataProvider;

public class DataProvidersForTest {

    @DataProvider(name = "getDataForSearchTest")
    public Object[][] getDataForSearchTest() {
        return new Object[][]{
                {"Java Books"},
                {"Selenium Books"}
        };
    }

    @DataProvider(name = "getUserForLoginTest")
    public Object[][] getUserForLoginTest() {
        return new Object[][]{
                {"testuser001", "testpass001"},
                {"testuser002", "testpass002"}
        };
    }
}
