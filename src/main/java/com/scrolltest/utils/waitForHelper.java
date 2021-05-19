package com.scrolltest.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitForHelper {

    public WebDriver driver;

    public waitForHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void implicitWait(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.MILLISECONDS);
    }

    public WebElement presenceOfElement(final By locator){
        return new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public WebElement elementToBeClickable(final By locator){
        return new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(locator));
    }

}
