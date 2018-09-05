package com.pettern.bulidType.prototype;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.err.println("Inside Circle::Draw() Method");
    }

    public Circle(){
        type = "Circle";
    }

}
