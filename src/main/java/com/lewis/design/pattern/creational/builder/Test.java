package com.lewis.design.pattern.creational.builder;

/**
 * 建造者模式扩展
 * 适用场景：1.对象有非常复杂的内部结构；2.想把对象的创建和使用分离；
 * 优点：1.封装性好，创建和使用分离；2.扩展性好，建造类之间独立，一定程度解耦；
 * 缺点：1.产生多余的Builder对象；2.产品内部修改，建造者对象都需要修改，成本较大；
 * 实例：StringBuilder；ImmutableSet；com.google.common.cache.CacheBuilder
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder().builderCpu("酷睿I7").builderGraphicsCard("七彩虹").builderMonitor("三星显示屏").builder();
        System.out.println(computer.toString());

//        Set<String> set = ImmutableSet.<String>builder().add("A").add("B").build();
//        System.out.println(set);
    }
}
