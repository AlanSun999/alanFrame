package me.alan.framework.helper;

import me.alan.framework.bean.Handler;
import me.alan.framework.bean.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 控制器助手类
 * @Author: ALan
 * @Date: 2018-04-13
 * @Time: 16:11
 */
public final class ControllerHelper {
    private static final Map<Request,Handler> ACTION_MAP = new HashMap<Request, Handler>();
}
