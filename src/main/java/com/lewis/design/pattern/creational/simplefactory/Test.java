package com.lewis.design.pattern.creational.simplefactory;

/**
 * 简单工厂模式
 * Calenday
 * Mysql driver
 * Logback getLogger()
 */
public class Test {
    public static void main(String[] args) {
        Video v1 = VideoFactory.getByName("python");
        v1.play();

        Video v2 = VideoFactory.getByClass(CSharpVideo.class);
        v2.play();
    }
}
