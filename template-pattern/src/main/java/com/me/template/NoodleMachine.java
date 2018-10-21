package com.me.template;

/**
 * @author OuyangJie
 * @Date 2018/10/21 11:21
 * @Description:
 */
public abstract class NoodleMachine {

    public void process(){
        //加入原材料
        addMaterial();
        //制作面条
        makeNoodle();
    }

    void addMaterial(){
        System.out.println("加入面粉、水、鸡蛋");
    }

    protected abstract void makeNoodle();
}
