package com.pettern.bulidType.builder.burger;

import com.pettern.bulidType.builder.dao.Packing;

public class Warpper implements Packing {

    @Override
    public String pack() {
        return "包装";
    }
}
