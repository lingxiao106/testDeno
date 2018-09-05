package com.pettern.bulidType.factory.shape;

import com.pettern.bulidType.factory.abstractfactory.AbstractFactory;
import com.pettern.bulidType.factory.color.Blue;
import com.pettern.bulidType.factory.color.Color;
import com.pettern.bulidType.factory.color.Green;
import com.pettern.bulidType.factory.color.Red;

public class SquareFactoryPettern extends AbstractFactory {


    @Override
    public Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
