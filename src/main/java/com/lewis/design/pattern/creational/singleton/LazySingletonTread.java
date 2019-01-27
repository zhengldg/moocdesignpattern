package com.lewis.design.pattern.creational.singleton;

public class LazySingletonTread implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
    }
}
