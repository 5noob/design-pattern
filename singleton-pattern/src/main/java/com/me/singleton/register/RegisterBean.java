package com.me.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author OuyangJie
 * @Date 2018/10/19 10:09
 * @Description: 注册式单例
 */
public class RegisterBean {
    private static Map<String, Object> registerMap = new ConcurrentHashMap<>();

    private RegisterBean(){}

    public static RegisterBean getInstance(String name){
        if(name == null){
            name = RegisterBean.class.getName();
        }

        if(registerMap.get(name) == null){
            registerMap.put(name, new RegisterBean());
        }

        return (RegisterBean) registerMap.get(name);

    }
}
