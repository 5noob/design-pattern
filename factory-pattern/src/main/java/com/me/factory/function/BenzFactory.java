package com.me.factory.function;

import com.me.factory.domain.Benz;
import com.me.factory.domain.Car;

/**
 * @author OuyangJie
 * @Date 2018/10/17 21:34
 * @Description:
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
