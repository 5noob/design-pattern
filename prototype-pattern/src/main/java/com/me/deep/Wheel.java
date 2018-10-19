package com.me.deep;

import java.io.Serializable;

/**
 * @author OuyangJie
 * @Date 2018/10/19 19:38
 * @Description:
 */
public class Wheel implements Serializable {
    private int radius;

    private int width;

    public Wheel() {
    }

    public Wheel(int radius, int width) {
        this.radius = radius;
        this.width = width;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
