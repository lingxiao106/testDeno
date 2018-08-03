package com.pettern.builder.bottle;

import com.pettern.builder.dao.Item;
import com.pettern.builder.dao.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
