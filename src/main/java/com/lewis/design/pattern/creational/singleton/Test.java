package com.lewis.design.pattern.creational.singleton;

import java.io.*;

/**
 * 懒汉单例模式
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 懒汉模式
//        Thread t1 = new Thread(new LazySingletonTread());
//        Thread t2 = new Thread(new LazySingletonTread());
//        t1.start();
//        t2.start();

        // 双重检查
//        Thread t1 = new Thread(new LazyDoubleCheckSingletonTread());
//        Thread t2 = new Thread(new LazyDoubleCheckSingletonTread());
//        t1.start();
//        t2.start();

        // 内部类
//        Thread t1 = new Thread(new StaticInnerClassSingleThrea());
//        Thread t2 = new Thread(new StaticInnerClassSingleThrea());
//        t1.start();
//        t2.start();

        // 反序列化破坏单例(饿汉模式\延迟加载模式\静态内部类 均有此问题，通过 readResolve方法解决)
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        objectOutputStream.writeObject(instance);
//        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("singleton_file"));
//        HungrySingleton newInstance = (HungrySingleton) inputStream.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance); // false

    }
}
