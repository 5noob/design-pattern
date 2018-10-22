package com.me.adapter;

/**
 * @author OuyangJie
 * @Date 2018/10/22 21:03
 * @Description:
 */
public class Person {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Usb());
        TypeC typeC = new TypeC(adapter);
        typeC.charge();
    }
}
