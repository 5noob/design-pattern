package com.me.decorator;

/**
 * @author OuyangJie
 * @Date 2018/10/23 9:42
 * @Description:
 */
public class MathTeacher implements ITeacher {
    @Override
    public void teach() {
        System.out.println("教数学");
    }
}
