package com.example.autowire.constructor;

public class Specification {
    private String make;
    private String model;

    public String getMake() {

        System.out.println("getter is called");//just for validation
        return make;
    }

    public void setMake(String make) {
        System.out.println("setter is called");//just for validation
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
