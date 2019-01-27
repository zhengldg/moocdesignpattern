package com.lewis.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 双重检查实现单例模式
 */
public class LazyDoubleCheckSingleton implements Serializable {
    //volatile 关键字解决 重排序问题
    private volatile static LazyDoubleCheckSingleton instance;
    private LazyDoubleCheckSingleton() {
    }

    /**
     * @return
     */
    public  static LazyDoubleCheckSingleton getInstance(){
        // 不加 synchronized 情况下多线程会同时进入导致初始化多次
       //断点的的suspend 设置为 thread模式
        if(instance == null) { // 重排序导致线程在这里判断不为空，但是对象并没有初始化；
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                    // ! 2.3步骤重排序导致多线程时会出现问题
                    // 1.分配内存给对象；
                    // 3.设置instance指向刚刚分配的内存地址；
                    // 2.对象初始化；
                }
            }
        }
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
