package com.pettern.factory;

import com.pettern.factory.color.Color;
import com.pettern.factory.shape.SquareFactoryPettern;
import com.pettern.factory.shape.Shape;

public class TestSquareFactory {

    public static void main(String[] args){

        SquareFactoryPettern squareFactoryPettern = new SquareFactoryPettern();
        Shape circle = squareFactoryPettern.getShape("CIRCLE");
        circle.draw();

        Shape square = squareFactoryPettern.getShape("SQUARE");

        square.draw();

        Shape rectangle = squareFactoryPettern.getShape("RECTANGLE");

        rectangle.draw();

        Color blue = squareFactoryPettern.getColor("BLUE");
        blue.fill();

        Color green = squareFactoryPettern.getColor("Green");

        green.fill();

        Color red = squareFactoryPettern.getColor("Red");
        red.fill();
    }
}
