package com.pettern.bulidType.factory.abstractfactory;

import com.pettern.bulidType.factory.color.Color;
import com.pettern.bulidType.factory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String colorType);

    public abstract Shape getShape(String shapeType);

}
