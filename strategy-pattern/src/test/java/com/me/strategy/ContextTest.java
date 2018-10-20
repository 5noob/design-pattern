package com.me.strategy;


import org.junit.Test;

/**
 * @author OuyangJie
 * @Date 2018/10/20 16:31
 * @Description:
 */
public class ContextTest {

    @Test
    public void executeTest() {
        System.out.println("-----来到了树木多的地方，发动技能-----");
        Context context = new Context(new FireStrategy());
        context.execute();

        System.out.println("-----旁边有条大河，发动技能--------");
        context = new Context(new WaterStrategy());
        context.execute();

        System.out.println("-----有叛徒谋反，将计就计，发动技能------");
        context = new Context(new PersonStrategy());
        context.execute();
    }
}