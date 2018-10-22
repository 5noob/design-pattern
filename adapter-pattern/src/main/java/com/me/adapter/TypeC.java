package com.me.adapter;

/**
 * @author OuyangJie
 * @Date 2018/10/22 20:59
 * @Description:
 */
public class TypeC {
    private Adapter adapter;

    public TypeC(Adapter adapter) {
        this.adapter = adapter;
    }

    public void charge() {
        System.out.println("使用TypeC充电");
        adapter.charge();
    }
}
