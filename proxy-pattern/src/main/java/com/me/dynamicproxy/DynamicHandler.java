package com.me.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author OuyangJie
 * @Date 2018/10/20 14:19
 * @Description:
 */
public class DynamicHandler implements InvocationHandler {
    private Object target;

    public DynamicHandler(Object target) {
        this.target = target;
    }

    /**
     * 动态生成代理对象
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("findJob".equals(method.getName())){
            System.out.println("中介开始帮人找工作");
        }else if("findHouse".equals(method.getName())){
            System.out.println("中介开始帮人找房子");
        }
        return method.invoke(target, args);
    }
}
