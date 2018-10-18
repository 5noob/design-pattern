package com.me.factory.domain.shipfactory;

import com.me.factory.domain.ship.BenzShip;
import com.me.factory.domain.ship.Ship;

/**
 * @author OuyangJie
 * @Date 2018/10/18 10:15
 * @Description:
 */
public class BenzShipFactory implements ShipFactory {
    @Override
    public Ship getShip() {
        return new BenzShip();
    }
}
