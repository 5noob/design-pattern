package com.me.factory.domain.transfactory;

import com.me.factory.domain.car.Car;
import com.me.factory.domain.carfactory.BenzCarFactory;
import com.me.factory.domain.ship.Ship;
import com.me.factory.domain.shipfactory.BenzShipFactory;

/**
 * @author OuyangJie
 * @Date 2018/10/18 10:24
 * @Description:
 */
public class BenzTransFactory implements TransportationFactory {
    @Override
    public Car createCar() {
        return new BenzCarFactory().getCar();
    }

    @Override
    public Ship createShip() {
        return new BenzShipFactory().getShip();
    }
}
