package com.me.factory.abst;

import com.me.factory.domain.car.Car;
import com.me.factory.domain.ship.Ship;
import com.me.factory.domain.transfactory.BMWTransFactory;
import com.me.factory.domain.transfactory.TransportationFactory;
import org.junit.Test;

/**
 * @author OuyangJie
 * @Date 2018/10/18 10:29
 * @Description:
 */
public class AbstractFactoryTest {
    @Test
    public void getTransportation(){
        TransportationFactory transportationFactory = new BMWTransFactory();
        Car car = transportationFactory.createCar();
        Ship ship = transportationFactory.createShip();
        System.out.println("car : " + car.getName());
        System.out.println("ship : " + ship.getName());
    }
}
