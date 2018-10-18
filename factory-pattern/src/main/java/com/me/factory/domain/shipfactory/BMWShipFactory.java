package com.me.factory.domain.shipfactory;

import com.me.factory.domain.ship.BMWShip;
import com.me.factory.domain.ship.Ship;

/**
 * @author OuyangJie
 * @Date 2018/10/18 10:15
 * @Description:
 */
public class BMWShipFactory implements ShipFactory {
    @Override
    public Ship getShip() {
        return new BMWShip();
    }
}
