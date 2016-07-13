package com.brainacad.oop.testshapes;

/**
 * Created by Maksym.Babych on 13.07.2016.
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: " + getShapeColor() + ", width = " + width + ", height = " + height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    public Rectangle(String color) {
        super(color);
    }
}
