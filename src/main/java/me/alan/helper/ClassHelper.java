package me.alan.helper;

import me.alan.config.ConfigHelper;
import me.alan.util.CalssUtil;
import org.apache.commons.lang3.ClassUtils;

import java.util.Set;

/**
 * @Description: 类操作助手类
 * @Author: ALan
 * @Date: 2018-04-02
 * @Time: 17:28
 */
public final class ClassHelper {
    /**
     * 定义类集合（用于存放所加载的类）
     */
    private static final Set<Class<?>> CLASS_SET;
    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = CalssUtil.getClassSet(basePackage);
    }
}
