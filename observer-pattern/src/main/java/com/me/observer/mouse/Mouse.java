package com.me.observer.mouse;

/**
 * 被观察者
 * @Description:
 */
public class Mouse implements IMouse {
    @Override
    public void click(){
        System.out.println("鼠标单击");
    }


    @Override
    public void doubleClick(){
        System.out.println("鼠标双击");
    }

    @Override
    public void up(){
        System.out.println("鼠标弹起");
    }

    @Override
    public void down(){
        System.out.println("鼠标按下");
    }


    @Override
    public void wheel(){
        System.out.println("鼠标滚动");
    }

    @Override
    public void move(){
        System.out.println("鼠标移动");
    }

    @Override
    public void over(){
        System.out.println("鼠标悬停");
    }

}
