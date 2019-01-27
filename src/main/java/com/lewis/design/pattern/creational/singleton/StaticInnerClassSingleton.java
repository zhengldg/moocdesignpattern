package com.lewis.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 利用静态内部类初始化时Class对象的初始化锁机制解决重排序问题
 */
public class StaticInnerClassSingleton implements Serializable {
    private StaticInnerClassSingleton() {
    }

    /**
     * 解决反序列化破坏单例问题
     * @return
     */
    private Object readResolve(){
        return InnerClass.instance;
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static StaticInnerClassSingleton instance = null;

        static {
            instance = new StaticInnerClassSingleton();
        }
    }
}
