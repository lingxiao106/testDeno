package com.pettern.builder.burger;

import com.pettern.builder.dao.Item;
import com.pettern.builder.dao.Packing;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Warpper();
    }

    @Override
    public abstract float price();
}
