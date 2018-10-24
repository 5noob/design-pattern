package com.me.observer.mouse;

import com.me.observer.core.EventListener;

/**
 * @Description:
 */
public class MouseTest {
    public static void main(String[] args) {

        //人为的调用鼠标的单击、双击事件
        IMouse mouse = (IMouse) new MouseHandler(new EventListener(), new Mouse()).getProxy();
        mouse.click();
        mouse.doubleClick();

    }


}
