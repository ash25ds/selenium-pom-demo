package com.scrolltest.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    //Read the Properties file in resource

    static Properties properties;

    public PropertyReader(){
        loadAllProperties();
    }

    //load file from resource
    public void loadAllProperties(){
        properties = new Properties();

        try{
            String fileName= System.getProperty("user.dir")+"/src/main/resources/prod_config.properties";
            properties.load(new FileInputStream(fileName));

        }catch(IOException e){
            throw new RuntimeException("Not able to find the file.");

        }

    }

    //Fetch Property
    public static String readItem(String propertyName){
        return properties.getProperty(propertyName);
    }
}
