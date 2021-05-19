package com.scrolltest.tests;

import com.scrolltest.base.testBase;
import com.scrolltest.pages.dashboardPage;
import com.scrolltest.pages.loginPage;
import com.scrolltest.utils.Log;
import com.scrolltest.utils.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends testBase {

    @Test(priority = 1, description = "Login with Credentials")
    public void loginToVWO() {
        Log.startTestcase("Login with Credentials");
        loginPage loginPage = new loginPage(driver);
        loginPage.openLoginPage();
        loginPage.loginToVWO();
    }

    @Test(priority = 2, description = "Verify Login")
    public void verifyloginToVWO() {
        Log.startTestcase("Verify Login");
        loginPage loginPage = new loginPage(driver);
        loginPage.openLoginPage();
        loginPage.loginToVWO();
        dashboardPage dashboardPage = new dashboardPage(driver);
        Assert.assertEquals(dashboardPage.usernameOnDashboard(), PropertyReader.readItem("expectedUsername"));
    }
}
