package com.me.factory.domain.transfactory;

import com.me.factory.domain.car.Car;
import com.me.factory.domain.carfactory.BMWCarFactory;
import com.me.factory.domain.ship.Ship;
import com.me.factory.domain.shipfactory.BMWShipFactory;

/**
 * @author OuyangJie
 * @Date 2018/10/18 10:27
 * @Description:
 */
public class BMWTransFactory implements TransportationFactory {
    @Override
    public Car createCar() {
        return new BMWCarFactory().getCar();
    }

    @Override
    public Ship createShip() {
        return new BMWShipFactory().getShip();
    }
}
