package me.alan.framework.util;

/**
 * @Description:
 * @Author: ALan
 * @Date: 2018-04-11
 * @Time: 17:35
 */
public final class CollectionUtil {

    public static boolean isNotEmpty(Object object){
        return object==null || "".equals(object);
    }
}
