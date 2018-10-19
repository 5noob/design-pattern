package com.me.deep;

import java.io.*;

/**
 * @author OuyangJie
 * @Date 2018/10/19 19:38
 * @Description:
 */
public class Car implements Cloneable, Serializable {
    private String name;

    private Wheel wheel;

    @Override
    protected Object clone() {
        return this.deepCopy();
    }

    private Object deepCopy(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Car() {
    }

    public Car(String name, Wheel wheel) {
        this.name = name;
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
