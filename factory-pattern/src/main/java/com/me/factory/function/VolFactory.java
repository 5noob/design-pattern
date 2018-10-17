package com.me.factory.function;

import com.me.factory.domain.Car;
import com.me.factory.domain.Volkswagen;

/**
 * @author OuyangJie
 * @Date 2018/10/17 21:35
 * @Description:
 */
public class VolFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Volkswagen();
    }
}
