package com.me.factory.simple;

import com.me.factory.domain.car.Car;
import org.junit.Test;

/**
 * @author OuyangJie
 * @Date 2018/10/17 20:19
 * @Description:
 */
public class SimpleCarFactoryTest {

    @Test
    public void getCar() {
        String name = "宝马";
        SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
        Car car = simpleCarFactory.getCar(name);
        System.out.println(car.getName());
    }
}