package com.me.decorator;

/**
 * @author OuyangJie
 * @Date 2018/10/23 9:48
 * @Description:
 */
public class VillageMathTeacher extends VillageTeacher {

    public VillageMathTeacher(ITeacher iTeacher) {
        super(iTeacher);
    }

    @Override
    public void teach() {
        System.out.println("一个数学老师，来到乡村支教");
        System.out.println("不仅要");
        teachMath();
        System.out.println("而且要");
        teachEnglish();
    }

    public void teachMath(){
        this.getiTeacher().teach();
    }

    public void teachEnglish(){
        System.out.println("教英语");
    }
}
