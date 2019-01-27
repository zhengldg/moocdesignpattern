package com.lewis.design.pattern.creational.abstractfacotry;

/**
 * 抽象工厂模式
 * 适用场景：1.客户端不依赖产品类实例如何被创建、实现等细节；2.强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量重复代码；
 * 跟工厂方法模式区别：工厂方法适用于创建不同产品等级结构对象；抽象工厂适用于创建同一产品族的不同产品对象；
 * 优点：1.用户只关心所需产品对应的产品族工厂，不关心创建细节；2.加入新产品族符合开闭原则；
 * 缺点：1.产品族中扩展新的产品困难，需要修改抽象工厂接口，不符合开闭原则；
 *
 * 实例：org.apache.ibatis.session.SqlSessionFactory
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new   CSharpCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
