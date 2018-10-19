package com.me.singleton;

import com.me.singleton.hungry.HungryBean;
import com.me.singleton.lazy.LazyOneBean;
import com.me.singleton.lazy.LazyTwoBean;
import com.me.singleton.register.EnumBean;
import com.me.singleton.register.RegisterBean;
import org.junit.Test;

/**
 * @author OuyangJie
 * @Date 2018/10/19 10:21
 * @Description:
 */
public class SingletonTest {
    @Test
    public void test(){
        HungryBean hungryBean1 = HungryBean.getInstance();
        HungryBean hungryBean2 = HungryBean.getInstance();
        System.out.println("饿汉式测试：" + (hungryBean1 == hungryBean2));

        LazyOneBean lazyOneBean1 = LazyOneBean.getInstance();
        LazyOneBean lazyOneBean2 = LazyOneBean.getInstance();
        System.out.println("懒汉式one测试： " + (lazyOneBean1 == lazyOneBean2));

        LazyTwoBean lazyTwoBean1 = LazyTwoBean.getInstance();
        LazyTwoBean lazyTwoBean2 = LazyTwoBean.getInstance();
        System.out.println("懒汉式two测试： " + (lazyTwoBean1 == lazyTwoBean2));

        EnumBean enumBean1 = EnumBean.INSTANCE;
        EnumBean enumBean2 = EnumBean.INSTANCE;
        System.out.println("枚举式测试：" + (enumBean1 == enumBean2));

        RegisterBean registerBean1 = RegisterBean.getInstance(null);
        RegisterBean registerBean2 = RegisterBean.getInstance(null);
        System.out.println("注册式测试：" + (registerBean1 == registerBean2));
    }
}
