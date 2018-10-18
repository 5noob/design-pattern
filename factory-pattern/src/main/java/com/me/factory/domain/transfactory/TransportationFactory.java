package com.me.factory.domain.transfactory;

import com.me.factory.domain.car.Car;
import com.me.factory.domain.ship.Ship;

/**
 * @author OuyangJie
 * @Date 2018/10/18 10:23
 * @Description:
 */
public interface TransportationFactory {
    Car createCar();
    Ship createShip();
}
