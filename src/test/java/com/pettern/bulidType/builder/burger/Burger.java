package com.pettern.bulidType.builder.burger;

import com.pettern.bulidType.builder.dao.Item;
import com.pettern.bulidType.builder.dao.Packing;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Warpper();
    }

    @Override
    public abstract float price();
}
