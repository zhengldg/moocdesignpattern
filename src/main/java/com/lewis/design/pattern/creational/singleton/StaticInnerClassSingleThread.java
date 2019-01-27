package com.lewis.design.pattern.creational.singleton;

public class StaticInnerClassSingleThread implements Runnable {
    @Override
    public void run() {
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(staticInnerClassSingleton);
    }
}
