package me.alan.framework.config;

/**
 * @Description: 提供相关配置项常量
 * @Author: ALan
 * @Date: 2018-04-02
 * @Time: 15:38
 */
public interface ConfigConstant {
    String  CONFIG_FILE = "alan.properties";

    String  JDBC_DRIVER = "jdbc.driver";
    String  JDBC_URL = "jdbc.url";
    String  JDBC_USERNAME = "jdbc.username";
    String  JDBC_PASSWORD = "jdbc.password";

    String  APP_BASE_PACKAGE = "app.base.package";
    String  APP_JSP_PATH = "app.jsp.path";
    String  APP_ASSET_PATH = "app.asset.path";
}
