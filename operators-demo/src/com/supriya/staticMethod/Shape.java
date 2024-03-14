package com.supriya.staticMethod;

public class Shape {

    int radius;
    static String type;

        //parameterized constructor
        Shape(int radius) {
            this.radius = radius;  //this in which we are pointing to the current object
            System.out.println("Shape constructor initialized...");
        }

        //no parameter constructor
        Shape() {
            System.out.println("Shape constructor initialized...");
        }

        public void print() {
            System.out.println("Radius of this shape is: " + radius + " and shape is: " + type);
        }
}