package com.pettern.prototype;

public class Square extends Shape {
    @Override
    public void draw() {
        System.err.println("Inside Square::Draw() method.");
    }

    public Square(){
        type = "Square";
    }
}
