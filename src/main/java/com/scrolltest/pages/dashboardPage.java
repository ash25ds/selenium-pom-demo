package com.scrolltest.pages;

import com.scrolltest.base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboardPage extends basePage {
    WebDriver driver;

    public dashboardPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Dashboard Page Locators
    By usernameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");


    //Page Actions
    public String usernameOnDashboard(){
        waitForElementToAppear(usernameOnDashboard);
        return driver.findElement(usernameOnDashboard).getText();
    }
}
