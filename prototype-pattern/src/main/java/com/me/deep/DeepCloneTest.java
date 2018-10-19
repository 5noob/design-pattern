package com.me.deep;

/**
 * @author OuyangJie
 * @Date 2018/10/19 19:37
 * @Description:
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        Wheel wheel = new Wheel(50, 15);
        Car car = new Car("BMW", wheel);

        Car cloneCar = (Car) car.clone();
        System.out.println(car.getWheel() == cloneCar.getWheel());
    }
}
