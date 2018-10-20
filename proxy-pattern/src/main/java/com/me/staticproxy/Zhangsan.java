package com.me.staticproxy;

/**
 * @author OuyangJie
 * @Date 2018/10/20 14:00
 * @Description:
 */
public class Zhangsan implements Person {
    @Override
    public void findJob() {
        System.out.println("钱多事少离家近");
    }

    @Override
    public void findHouse() {
        System.out.println("120平起步");
    }
}
