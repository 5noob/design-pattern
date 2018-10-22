package com.me.delegate;

/**
 * @author OuyangJie
 * @Date 2018/10/22 19:51
 * @Description:
 */
public class StudentA implements IStudent {
    @Override
    public void work() {
        System.out.println("学生A，进行后台开发");
    }
}
