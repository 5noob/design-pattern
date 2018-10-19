package com.me.singleton.lazy;

/**
 * @author OuyangJie
 * @Date 2018/10/19 9:44
 * @Description: 懒汉式单例--双重校验锁
 */
public class LazyOneBean {
    private static LazyOneBean lazyOneInstance = null;

    private LazyOneBean(){
    }

    public static LazyOneBean getInstance(){
        if(lazyOneInstance == null){
            synchronized (LazyOneBean.class){
                if(lazyOneInstance == null){
                    lazyOneInstance = new LazyOneBean();
                }
            }
        }
        return lazyOneInstance;
    }
}
