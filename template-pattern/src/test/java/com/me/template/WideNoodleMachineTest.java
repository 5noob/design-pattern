package com.me.template;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author OuyangJie
 * @Date 2018/10/21 11:30
 * @Description:
 */
public class WideNoodleMachineTest {

    @Test
    public void makeNoodle() {
        WideNoodleMachine wideNoodleMachine = new WideNoodleMachine();
        wideNoodleMachine.process();
    }
}