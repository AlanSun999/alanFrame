package me.alan.config;

import me.alan.util.PropsUtil;

import java.util.Properties;

/**
 * @Description: 属性文件助手类
 * @Author: ALan
 * @Date: 2018-04-02
 * @Time: 15:33
 */
public final class ConfigHelper {
    private static final Properties CONFIG_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);
}
