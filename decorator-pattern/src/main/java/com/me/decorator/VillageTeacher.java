package com.me.decorator;

/**
 * @author OuyangJie
 * @Date 2018/10/23 9:46
 * @Description:
 */
public abstract class VillageTeacher implements ITeacher {

    private ITeacher iTeacher;

    public VillageTeacher() {
    }

    public VillageTeacher(ITeacher iTeacher) {
        this.iTeacher = iTeacher;
    }

    public ITeacher getiTeacher(){
        return iTeacher;
    }
}
