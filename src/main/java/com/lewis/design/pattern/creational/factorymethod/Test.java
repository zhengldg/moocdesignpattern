package com.lewis.design.pattern.creational.factorymethod;

/**
 * 工厂方法模式
 * 适用场景：1.创建对象需要大量重复代码；2.客户端不依赖产品类实例如何被创建细节；3.一个类通过子类来指定创建哪个对象；
 * 优点：1.用户只关心所需产品对应的工厂，不关心创建细节；2.加入新产品符合开闭原则；
 * 确定：1.增加类的个数，增加复杂度；
 *
 * 实例：1.Collection接口的 Iterator<E> iterator()方法；2.Logback ILoggerFactory.getLogger()方法
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        videoFactory.getVideo().play();

        VideoFactory videoFactory2 = new CSharpVideoFactory();
        videoFactory2.getVideo().play();
    }
}
