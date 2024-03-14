package com.supriya.staticMethod;

public class StaticDemo {
    public static void main(String[] args) {
        Shape.type ="Circle";


        //circle 1 illustration
        Shape circle1 = new Shape();
        circle1.radius = 5;
        circle1.print();

        //circle 2 illustration
        Shape circle2 = new Shape();
        circle2.radius = 8;
        circle2.print();

        //circle 3 illustration
        Shape circle3 = new Shape();
        circle3.radius = 3;
        circle3.print();
    }

}
