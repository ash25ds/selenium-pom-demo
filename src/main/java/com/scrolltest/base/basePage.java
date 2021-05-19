package com.scrolltest.base;

import com.scrolltest.utils.waitForHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class basePage {

    //Navigate
    //Wait for Element
    //Wait for Item
    //Click
    //Write text
    //Read Text
    //Move to elements

    protected WebDriver driver;

    public basePage(WebDriver driver){
        this.driver = driver;
    }

    public void goToURL(String url){
        driver.get(url);
    }

    public void waitForElementToAppear(By locator){
        new waitForHelper(driver).presenceOfElement(locator);
    }

    public void waitForLoading(){
        new waitForHelper(driver).implicitWait(10);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void readText(By locator){
        driver.findElement(locator).getText();
    }

    public void writeText(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public void moveToElement(By locator){
        new Actions(driver).moveToElement(driver.findElement(locator)).build().perform();
    }

}
