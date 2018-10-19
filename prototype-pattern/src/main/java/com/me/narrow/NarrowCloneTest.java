package com.me.narrow;

/**
 * @author OuyangJie
 * @Date 2018/10/19 19:22
 * @Description:
 */
public class NarrowCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacherZhang = new Teacher("张老师");
        Student s1 = new Student("小明", teacherZhang);

        Student s2 = (Student) s1.clone();
        System.out.println("s1 == s2 " + (s1 == s2));

        //Student{name='小明', teacher=com.me.narrow.Teacher@5679c6c6}
        //Student{name='小明', teacher=com.me.narrow.Teacher@5679c6c6}
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
