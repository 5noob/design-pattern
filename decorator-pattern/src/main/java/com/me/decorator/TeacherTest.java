package com.me.decorator;

/**
 * @author OuyangJie
 * @Date 2018/10/23 9:52
 * @Description:
 */
public class TeacherTest {
    public static void main(String[] args) {
        VillageMathTeacher villageMathTeacher = new VillageMathTeacher(new MathTeacher());
        villageMathTeacher.teach();
    }
}
