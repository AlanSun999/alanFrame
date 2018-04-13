package me.alan.framework.bean;

import java.lang.reflect.Method;

/**
 * @Description: 封装Action信息
 * @Author: ALan
 * @Date: 2018-04-13
 * @Time: 16:15
 */
public class Handler {
    /**
     * Controller类
     */
    private Class<?> controllerClass;
    /**
     * Action方法
     */
    private Method actionMethod;

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }


    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }



}
