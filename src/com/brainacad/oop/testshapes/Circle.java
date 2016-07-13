package com.brainacad.oop.testshapes;

/**
 * Created by Maksym.Babych on 13.07.2016.
 */
public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "This is Circle, color: " + getShapeColor() + ", radius=" + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public Circle(String color) {
        super(color);
    }
}
