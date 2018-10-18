package com.me.factory.domain.carfactory;

import com.me.factory.domain.car.BMW;
import com.me.factory.domain.car.Car;

/**
 * @author OuyangJie
 * @Date 2018/10/17 21:33
 * @Description:
 */
public class BMWCarFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new BMW();
    }
}
