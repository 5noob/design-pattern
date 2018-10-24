package com.me.observer.core;

import com.me.observer.mouse.MouseEventCallback;
import com.me.observer.mouse.MouseEventType;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 事件注册监听
 */
public class EventListener {
    /**
     * Map相当于是一个注册器
     */
    public static Map<Enum, Event> events = new HashMap<>();

    static {
        try {
            MouseEventCallback callback = new MouseEventCallback();
            Method onClick = MouseEventCallback.class.getMethod("onClick", Event.class);
            Method onDoubleClick = MouseEventCallback.class.getMethod("onDoubleClick", Event.class);

            addListener(MouseEventType.ON_CLICK, callback, onClick);
            addListener(MouseEventType.ON_DOUBLE_CLICK, callback, onDoubleClick);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void addListener(Enum eventType, Object target, Method callback) {
        //注册事件
        //用反射调用这个方法
        events.put(eventType, new Event(target, callback));
    }

    private void trigger(Event e, Object source) {
        e.setSource(source);
        e.setTime(System.currentTimeMillis());

        try {
            e.getCallback().invoke(e.getTarget(), e);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }


    public void trigger(Enum call, Object source) {
        if (!events.containsKey(call)) {
            return;
        }
        trigger(events.get(call).setTrigger(call.toString()), source);
    }

}
