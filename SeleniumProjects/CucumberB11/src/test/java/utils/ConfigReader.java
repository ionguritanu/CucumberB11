package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //File class assign given file to the java object
    public static String readProperty(String key)  {
        File file = new File("configurations.properties");
        Properties properties = new Properties();
        //properties object will read the properties fiele
        try {
            properties.load((new FileInputStream(file)));
            //load method will load every value from file object to the properties object
        } catch (IOException e) {
            e.printStackTrace();
        }
        //more actions surround by try and catch
        return properties.getProperty(key);
        //I can read the value from properties object using the key
    }
}
