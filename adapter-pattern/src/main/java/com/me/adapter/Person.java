package com.me.adapter;

/**
 * @author OuyangJie
 * @Date 2018/10/22 21:03
 * @Description:
 */
public class Person {
    public static void main(String[] args) {
        TypeC typeC = new Adapter(new Usb());
        System.out.println("使用TypeC充电");
        typeC.charge();
    }
}
