package com.me.strategy;

/**
 * @author OuyangJie
 * @Date 2018/10/20 16:25
 * @Description:
 */
public class PersonStrategy implements IStrategy {
    @Override
    public void execute() {
        System.out.println("公子献头");
    }
}
