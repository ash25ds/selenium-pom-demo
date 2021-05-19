package com.scrolltest.base;

import com.scrolltest.utils.Log;
import com.scrolltest.utils.PropertyReader;
import com.scrolltest.utils.driverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testBase extends driverManager {

    //Setup and TearDown

    public WebDriver driver;

    public testBase(){
        this.driver = super.getDriver();
    }
    PropertyReader pr = new PropertyReader();

    //Setup
    @BeforeMethod(alwaysRun = true)
    public  void setup(){

        //Read from property file and set the WebDriver
        try{

            if(PropertyReader.readItem("browser").equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\preet\\Downloads\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                Log.info("Browser Success");
            }
            else{
                try{
                    throw new Exception("Browser not defined");
                }
                catch(Exception e){
                    Log.error("No Compatible Browser", e);
                }
            }
        }catch(Exception e){
                    Log.error("Browser Launch Error", e);
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();

    }


}
