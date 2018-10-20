package com.me.strategy;

/**
 * @author OuyangJie
 * @Date 2018/10/20 16:24
 * @Description:
 */
public class FireStrategy implements IStrategy {
    @Override
    public void execute() {
        System.out.println("火烧连营");
    }
}
