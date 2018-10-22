package com.me.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OuyangJie
 * @Date 2018/10/22 19:50
 * @Description:
 */
public class Professor {
    private Map<String, IStudent> workers = new HashMap<>();

    public Professor() {
        workers.put("前端", new StudentB());
        workers.put("后台", new StudentA());
    }

    public void work(String taskType){
        workers.get(taskType).work();
    }
}
