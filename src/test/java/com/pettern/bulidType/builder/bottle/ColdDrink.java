package com.pettern.bulidType.builder.bottle;

import com.pettern.bulidType.builder.dao.Item;
import com.pettern.bulidType.builder.dao.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
