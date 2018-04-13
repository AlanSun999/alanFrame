package me.alan.framework.bean;

/**
 * @Description: 封装请求信息
 * @Author: ALan
 * @Date: 2018-04-13
 * @Time: 16:12
 */
public class Request {
    /**
     * 请求方法
     */
    private String requestMethod;
    /**
     * 请求路径
     */
    private String requestPath;

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Request request = (Request) o;

        if (requestMethod != null ? !requestMethod.equals(request.requestMethod) : request.requestMethod != null) {
            return false;
        }
        return requestPath != null ? requestPath.equals(request.requestPath) : request.requestPath == null;
    }

    @Override
    public int hashCode() {
        int result = requestMethod != null ? requestMethod.hashCode() : 0;
        result = 31 * result + (requestPath != null ? requestPath.hashCode() : 0);
        return result;
    }
}
