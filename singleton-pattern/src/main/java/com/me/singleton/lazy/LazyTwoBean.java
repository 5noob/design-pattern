package com.me.singleton.lazy;

/**
 * @author OuyangJie
 * @Date 2018/10/19 9:54
 * @Description: 懒汉式单例--静态内部类
 */
public class LazyTwoBean {

    private boolean initialized = false;

    private LazyTwoBean(){
        synchronized (LazyTwoBean.class){
            if(!initialized){
                initialized = !initialized;
            }else {
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }

    public static LazyTwoBean getInstance(){
        return SingletonHolder.LAZY_TWO_INSTANCE;
    }


    /**
     * 静态内部类，在被调用时，才会被加载，起到了lazy loading的作用
     * 其中的静态属性，只会在第一次加载SingletonHolder类时初始化，保证了线程安全
     */
    private static class SingletonHolder{
        private static final LazyTwoBean LAZY_TWO_INSTANCE = new LazyTwoBean();
    }
}
