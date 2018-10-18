package com.me.factory.domain.ship;

/**
 * @author OuyangJie
 * @Date 2018/10/18 10:07
 * @Description: 假设Benz 能造船 --！
 */
public class BenzShip implements Ship {
    @Override
    public String getName() {
        return "奔驰船";
    }
}
