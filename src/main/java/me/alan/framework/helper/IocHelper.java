package me.alan.framework.helper;


import me.alan.framework.util.CollectionUtil;

import java.util.Map;

/**
 * @Description: 依赖注入助手类（或控制反转助手类）
 * @Author: ALan
 * @Date: 2018-04-11
 * @Time: 17:31
 */
public class IocHelper {
    static {
//        获取所有的Bean类与Bean实例之间的映射关系（简称Bean Map）
        Map<Class<?>,Object> beanMap = BeanHelper.getBeanMap();
        if(CollectionUtil.isNotEmpty(beanMap)){
//          遍历Bean Map
            for(Map.Entry<Class<?>,Object> beanEntry : beanMap.entrySet()){
                //从BeanMap中获取Bean类与Bean实例
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
            }
        }
    }
}
