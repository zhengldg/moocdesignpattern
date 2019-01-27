package com.lewis.design.pattern.creational.singleton;


public class LazyDoubleCheckSingletonTread implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(lazySingleton);
    }
}
