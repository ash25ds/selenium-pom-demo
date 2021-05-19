package com.scrolltest.pages;

import com.scrolltest.base.basePage;
import com.scrolltest.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage extends basePage {

    WebDriver driver;

    public loginPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    //Page Locators
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signIn = By.id("js-login-btn");

    //Page Actions
    public void openLoginPage(){
        waitForLoading();
        goToURL(PropertyReader.readItem("url"));
    }

    //Sign In
    public void loginToVWO(){
        waitForLoading();
        writeText(username,PropertyReader.readItem("username"));
        writeText(password,PropertyReader.readItem("password"));
        click(signIn);
    }

    public dashboardPage afterLogin(){
        return new dashboardPage(driver);
    }

}
