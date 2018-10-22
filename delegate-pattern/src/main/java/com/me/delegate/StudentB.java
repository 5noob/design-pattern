package com.me.delegate;

/**
 * @author OuyangJie
 * @Date 2018/10/22 19:51
 * @Description:
 */
public class StudentB implements IStudent {
    @Override
    public void work() {
        System.out.println("学生B，进行前端开发");
    }
}
