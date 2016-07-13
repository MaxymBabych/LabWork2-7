package com.brainacad.oop.testshapes;

/**
 * Created by Maksym.Babych on 03.07.2016.
 */
public class Shape {
    private String shapeColor;
    private double area = 0;

    @Override
    public String toString() {
        return "Shape, color is: " + shapeColor;
    }

    public double calcArea() {
        return area;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Shape(String color) {
        this.shapeColor = color;

    }
}
