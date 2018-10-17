package com.me.factory.function;

import com.me.factory.domain.BMW;
import com.me.factory.domain.Car;

/**
 * @author OuyangJie
 * @Date 2018/10/17 21:33
 * @Description:
 */
public class BMWFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new BMW();
    }
}
