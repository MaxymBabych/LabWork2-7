package com.brainacad.oop.testshapes;

import java.util.Random;

/**
 * Created by Maksym.Babych on 03.07.2016.
 */
public class Main {
    public static void main(String[] args) {



        Triangle triangle1 = new Triangle("red", 10, 25);
        Triangle triangle2 = new Triangle("red", 10, 25);
        System.out.println(triangle1.toString());
        System.out.println("Площадь - " + triangle1.calcArea());

        Circle circle1 = new Circle("Blu", 15.3);
        Circle circle2 = new Circle("Blu", 15.3);
        Circle circle3 = new Circle("Blu", 15.3);
        System.out.println(circle1.toString());
        System.out.println("Площадь - " + circle1.calcArea());

        Rectangle rectangle1 = new Rectangle("white", 45, 12);
        Rectangle rectangle2 = new Rectangle("white", 45, 12);
        Rectangle rectangle3 = new Rectangle("white", 45, 12);
        Rectangle rectangle4 = new Rectangle("white", 45, 12);
        Rectangle rectangle5 = new Rectangle("white", 45, 12);
        System.out.println(rectangle1.toString());
        System.out.println("Площадь - " + rectangle1.calcArea());

        Shape[]arr = {rectangle1,rectangle2, rectangle3,rectangle4, rectangle5, circle1,circle2,circle3,triangle1,triangle2};


    }

}
