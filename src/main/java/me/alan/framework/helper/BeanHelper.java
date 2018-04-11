package me.alan.framework.helper;

import me.alan.framework.util.ReflectionUtil;
import org.apache.commons.collections4.map.HashedMap;

import java.util.Map;
import java.util.Set;

/**
 * @Description: bean 助手类
 * @Author: ALan
 * @Date: 2018-04-11
 * @Time: 16:55
 */
public final class BeanHelper {
    /**
     * 定义Bean映射（用于存放Bean类与Bean实例的映射关系）
     */
    private static final Map<Class<?>,Object> BEAN_MAP = new HashedMap<Class<?>, Object>();

    static {
        Set<Class<?>> beanCalssSet = ClassHelper.getBeanClassSet();
        for (Class<?> beanClass : beanCalssSet){
            Object object = ReflectionUtil.newInstance(beanClass);
            BEAN_MAP.put(beanClass,object);
        }
    }


    /**
     * 获取Bean映射
     * @return
     */
    public static Map<Class<?>,Object> getBeanMap(){
        return BEAN_MAP;
    }

    /**
     * 获取Bean实例
     * @param cls
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> cls){
        if (!BEAN_MAP.containsKey(cls)){
            throw new RuntimeException("can not get bean by class:"+cls);
        }
        return (T) BEAN_MAP.get(cls);
    }
}
