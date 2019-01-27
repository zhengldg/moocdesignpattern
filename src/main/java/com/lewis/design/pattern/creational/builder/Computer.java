package com.lewis.design.pattern.creational.builder;

/**
 * 建造者模式扩展
 */
public class Computer {
    private String cpu;
    private String monitor;
    private String graphicsCard;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public Computer(ComputerBuilder builder){
        this.cpu = builder.cpu;
        this.monitor = builder.monitor;
        this.graphicsCard = builder.graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", monitor='" + monitor + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }

    public static class ComputerBuilder{
       private   String cpu;
        private  String monitor;
        private  String graphicsCard;

        public ComputerBuilder builderCpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder builderMonitor(String monitor){
            this.monitor = monitor;
            return this;
        }

        public ComputerBuilder builderGraphicsCard(String graphicsCard){
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer builder(){
            return new Computer(this);
        }
    }
}
