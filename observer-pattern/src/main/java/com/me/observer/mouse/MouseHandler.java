package com.me.observer.mouse;

import com.me.observer.core.EventListener;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @author OuyangJie
 * @Date 2018/10/23 20:51
 * @Description:
 */
public class MouseHandler implements InvocationHandler {
    private static Map<String, Enum> mouseEventTypeMap = new HashMap<>();

    private EventListener eventListener;

    private IMouse mouse;

    public MouseHandler(EventListener eventListener, IMouse mouse) {
        this.eventListener = eventListener;
        this.mouse = mouse;
    }

    static {
        mouseEventTypeMap.put("click", MouseEventType.ON_CLICK);
        mouseEventTypeMap.put("doubleClick", MouseEventType.ON_DOUBLE_CLICK);
        mouseEventTypeMap.put("up", MouseEventType.ON_UP);
        mouseEventTypeMap.put("down", MouseEventType.ON_DOWN);
        mouseEventTypeMap.put("wheel", MouseEventType.ON_WHEEL);
        mouseEventTypeMap.put("move", MouseEventType.ON_MOVE);
        mouseEventTypeMap.put("over", MouseEventType.ON_OVER);
    }

    /**
     * 动态生成代理对象
     *
     * @return
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(mouse.getClass().getClassLoader(), mouse.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(mouse, args);
        if(mouseEventTypeMap.containsKey(method.getName())){
            eventListener.trigger(mouseEventTypeMap.get(method.getName()), mouse);
        }
        return null;
    }
}
