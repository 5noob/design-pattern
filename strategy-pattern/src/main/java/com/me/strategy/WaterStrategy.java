package com.me.strategy;

/**
 * @author OuyangJie
 * @Date 2018/10/20 16:23
 * @Description:
 */
public class WaterStrategy implements IStrategy {
    @Override
    public void execute() {
        System.out.println("水淹七军");
    }
}
