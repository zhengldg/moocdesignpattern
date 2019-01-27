package com.lewis.design.pattern.creational.abstractfacotry;

public class CSharpCourseFactory extends CourseFactory {
    @Override
    public Video getVideo() {
        return new CSharpVideo();
    }

    @Override
    public Article getArticle() {
        return new CSharpArticle();
    }
}
