package com.me.proxy;

import com.me.dynamicproxy.DynamicHandler;
import com.me.staticproxy.Agent;
import com.me.staticproxy.Person;
import com.me.staticproxy.Zhangsan;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author OuyangJie
 * @Date 2018/10/20 14:33
 * @Description:
 */
public class ProxyTest {
    @Test
    public void staticProxyTest(){
        Agent agent = new Agent(new Zhangsan());
        agent.findJob();
        agent.findHouse();
    }

    @Test
    public void dynamicProxyTest(){
        DynamicHandler dynamicHandler = new DynamicHandler(new Zhangsan());
        Person agent = (Person) dynamicHandler.getProxy();
        agent.findJob();
        agent.findHouse();

        //类文件时缓存在java虚拟机中，我们将类文件打印到文件中，便于查看
        generateProxyFile();
    }

    private void generateProxyFile(){
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", Zhangsan.class.getInterfaces());
        String path = "E:/ZhangsanProxy.class";
        try(FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(classFile);
            fos.flush();
            System.out.println("代理类class文件写入成功");
        } catch (Exception e) {
            System.out.println("写文件错误");
        }
    }
}
