package com.brainacad.oop.testshapes;

/**
 * Created by Maksym.Babych on 03.07.2016.
 */
public class Triangle extends Shape {

    private double storona;
    private double vusota;
    private double area;

    public Triangle(String color, double storona, double vusota) {
        super(color);
        this.storona = storona;
        this.vusota = vusota;
    }

    @Override
    public String toString() {
        return "Shape, color is: " + getShapeColor() + ". Это триугольник со стороной  :" + getStorona() + "высотой: " + getVusota();
    }

    @Override
    public double calcArea() {
        return storona / 2 * vusota;
    }

    public double getStorona() {
        return storona;
    }

    public void setStorona(double storona) {
        this.storona = storona;
    }

    public double getVusota() {
        return vusota;
    }

    public void setVusota(double vusota) {
        this.vusota = vusota;
    }

    public Triangle(String color, double area) {
        super(color);
    }


}
