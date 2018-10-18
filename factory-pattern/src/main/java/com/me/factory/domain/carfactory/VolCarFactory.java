package com.me.factory.domain.carfactory;

import com.me.factory.domain.car.Car;
import com.me.factory.domain.car.Volkswagen;

/**
 * @author OuyangJie
 * @Date 2018/10/17 21:35
 * @Description:
 */
public class VolCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Volkswagen();
    }
}
