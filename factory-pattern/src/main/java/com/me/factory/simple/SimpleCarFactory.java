package com.me.factory.simple;

import com.me.factory.domain.car.BMW;
import com.me.factory.domain.car.Benz;
import com.me.factory.domain.car.Car;
import com.me.factory.domain.car.Volkswagen;

/**
 * @author OuyangJie
 * @Date 2018/10/17 20:04
 * @Description:
 */
public class SimpleCarFactory {
    private static final String BMW = "宝马";
    private static final String BENZ = "奔驰";
    private static final String VOL = "大众";


    public Car getCar(String carName){
        if(BMW.equals(carName)){
            return new BMW();
        }else if(BENZ.equals(carName)){
            return new Benz();
        }else if(VOL.equals(carName)){
            return new Volkswagen();
        }else {
            throw new RuntimeException("该厂家不生产名字为" + carName + "的车辆");
        }
    }
}
