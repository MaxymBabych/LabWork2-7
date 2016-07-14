package com.brainacad.oop.testshapes;

import java.util.Random;

/**
 * Created by Maksym.Babych on 03.07.2016.
 */
public class Main {
    public static void main(String[] args) {


        Triangle triangle1 = new Triangle("red", 10, 25);
        Triangle triangle2 = new Triangle("red", 10, 30.5);
        System.out.println(triangle1.toString());
        System.out.println("Площадь - " + triangle1.calcArea());
        System.out.println();
        Circle circle1 = new Circle("Blu", 15.3);
        Circle circle2 = new Circle("Blu", 14);
        Circle circle3 = new Circle("Blu", 193);
        System.out.println(circle1.toString());
        System.out.println("Площадь - " + circle1.calcArea());
        System.out.println();
        Rectangle rectangle1 = new Rectangle("white", 45, 12);
        Rectangle rectangle2 = new Rectangle("white", 52, 12);
        Rectangle rectangle3 = new Rectangle("white", 45, 11);
        Rectangle rectangle4 = new Rectangle("white", 89, 12);
        Rectangle rectangle5 = new Rectangle("white", 45, 65);
        System.out.println(rectangle1.toString());
        System.out.println("Площадь - " + rectangle1.calcArea());
        System.out.println();
        Shape[] arr = {rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, circle1, circle2, circle3, triangle1, triangle2};
        double sumRectArea = 0;
        double sumCircleArea = 0;
        double sumTriangleArea = 0;
        for (Shape shape : arr) {
            System.out.println(shape.toString());
            if (shape instanceof Rectangle) {
                sumRectArea += shape.calcArea();
            } else if (shape instanceof Circle) {
                sumCircleArea += shape.calcArea();
            } else sumTriangleArea += shape.calcArea();
        }
        System.out.println();
        System.out.println("Circle total area: " + sumCircleArea);
        System.out.println("Rectangles total area: " + sumRectArea);
        System.out.println("Triangle total area: " + sumTriangleArea);

    }

}
