package com.me.adapter;

/**
 * @author OuyangJie
 * @Date 2018/10/22 20:45
 * @Description:
 */
public class Adapter {
    private Usb usb;

    public Adapter(Usb usb) {
        this.usb = usb;
    }

    public void charge(){
        System.out.println("使用转换器转换一下");
        usb.charge();
    }
}
