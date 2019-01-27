package com.lewis.design.pattern.creational.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {
    public static LazySingleton instance;
    private LazySingleton() {
    }

    /**
     * @return
     */
    public  static LazySingleton getInstance(){
        // 不加 synchronized 情况下多线程会同时进入导致初始化多次
       //断点的的suspend 设置为 thread模式
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
    private Object readResolve(){
        return instance;
    }

}
