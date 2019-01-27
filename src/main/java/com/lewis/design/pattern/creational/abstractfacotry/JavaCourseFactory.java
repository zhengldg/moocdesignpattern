package com.lewis.design.pattern.creational.abstractfacotry;

public class JavaCourseFactory extends CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
