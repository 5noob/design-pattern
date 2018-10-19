package com.me.singleton.hungry;

/**
 * @author OuyangJie
 * @Date 2018/10/19 9:38
 * @Description: 饿汉式单例
 */

/**
 * 优点：在类加载时，完成实例化，避免了线程同步问题
 * 缺点：没有达到lazy loading的效果，如果从始至终未使用这个实例，那么会造成内存浪费
 */
public class HungryBean {
    private static final HungryBean HUNGRY_INSTANCE = new HungryBean();

    private HungryBean(){}

    public static HungryBean getInstance(){
        return HUNGRY_INSTANCE;
    }
}
