package com.pettern.factory.abstractfactory;

import com.pettern.factory.color.Color;
import com.pettern.factory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String colorType);

    public abstract Shape getShape(String shapeType);

}
