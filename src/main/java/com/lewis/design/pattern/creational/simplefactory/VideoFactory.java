package com.lewis.design.pattern.creational.simplefactory;

public class VideoFactory {
    /**
     * 不需要被重写使用静态方法
     * 这种方法确定是增加类型时需要修改工厂方法
     * @param name
     * @return
     */
    public static Video getByName(String name){
        if("python".equalsIgnoreCase(name)){
            return new PythonVideo();
        }else if("csharp".equalsIgnoreCase(name)){
            return new CSharpVideo();
        }
        return null;
    }

    public static Video getByClass(Class clazz){
        Video video = null;
        try {
            video =  (Video) clazz.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
