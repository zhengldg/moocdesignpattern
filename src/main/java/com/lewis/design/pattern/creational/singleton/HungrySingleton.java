package com.lewis.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉单例模式
 */
public class HungrySingleton implements Serializable {
    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return instance;
    }

    private  HungrySingleton(){
    }

    private Object readResolve(){
        return instance;
    }

    public static void main(String[] args) {
    }
}
