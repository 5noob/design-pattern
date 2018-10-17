package com.me.factory.simple;

import com.me.factory.domain.Car;
import com.me.factory.function.BMWFactory;
import com.me.factory.function.CarFactory;
import org.junit.Test;

/**
 * @author OuyangJie
 * @Date 2018/10/17 21:38
 * @Description: 工厂方法模式的测试 -- 此处可以看做产品使用者
 */
public class FactoryFuncTest {
    @Test
    public void getCar(){
        CarFactory carFactory = new BMWFactory();
        Car car = carFactory.getCar();
        System.out.println(car.getName());
    }
}
