package com.me.strategy;

/**
 * @author OuyangJie
 * @Date 2018/10/20 16:29
 * @Description:
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        strategy.execute();
    }
}
