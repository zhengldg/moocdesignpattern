package com.lewis.design.pattern.creational.factorymethod;

public class CSharpVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new CSharpVideo();
    }
}
