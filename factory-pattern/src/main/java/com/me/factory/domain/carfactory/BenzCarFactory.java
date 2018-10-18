package com.me.factory.domain.carfactory;

import com.me.factory.domain.car.Benz;
import com.me.factory.domain.car.Car;

/**
 * @author OuyangJie
 * @Date 2018/10/17 21:34
 * @Description:
 */
public class BenzCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
