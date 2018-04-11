package me.alan.framework.util;

import java.io.IOException;
import java.util.Properties;

/**
 * @Description:
 * @Author: ALan
 * @Date: 2018-04-02
 * @Time: 15:45
 */
public class PropsUtil {

    public static Properties loadProps(String configFile){
        Properties properties = new Properties();
        try {
            properties.load(ClassLoader.getSystemResourceAsStream(configFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String getString(Properties properties, String name){
        return getString(properties,name,"");
    }
    public static String getString(Properties properties, String name, String defalut){
        if ("".equals(defalut)){
            return properties.getProperty(name);
        }else {
            return defalut;
        }
    }
}
