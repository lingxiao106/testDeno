package com.pettern.prototype;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.err.println("Inside Rectangle::draw() method.");
    }

    public Rectangle(){
        type = "Rectangle";
    }
}
