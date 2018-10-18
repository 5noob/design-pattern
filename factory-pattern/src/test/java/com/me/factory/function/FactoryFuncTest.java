package com.me.factory.function;

import com.me.factory.domain.car.Car;
import com.me.factory.domain.carfactory.BMWCarFactory;
import com.me.factory.domain.carfactory.CarFactory;
import org.junit.Test;

/**
 * @author OuyangJie
 * @Date 2018/10/17 21:38
 * @Description: 工厂方法模式的测试 -- 此处可以看做产品使用者
 */
public class FactoryFuncTest {
    @Test
    public void getCar(){
        CarFactory carFactory = new BMWCarFactory();
        Car car = carFactory.getCar();
        System.out.println(car.getName());
    }
}
