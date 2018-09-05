package com.pettern.bulidType.builder.burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 10f;
    }
}
