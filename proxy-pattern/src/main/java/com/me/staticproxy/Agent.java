package com.me.staticproxy;

/**
 * @author OuyangJie
 * @Date 2018/10/20 14:02
 * @Description:
 */
public class Agent implements Person {
    private Person person;

    public Agent(Person person) {
        this.person = person;
    }

    @Override
    public void findJob() {
        System.out.println("中介开始帮人找工作");
        person.findJob();
    }

    @Override
    public void findHouse() {
        System.out.println("中介开始帮人找房子了");
        person.findHouse();
    }
}
