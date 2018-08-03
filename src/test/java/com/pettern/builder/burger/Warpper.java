package com.pettern.builder.burger;

import com.pettern.builder.dao.Packing;

public class Warpper implements Packing {

    @Override
    public String pack() {
        return "包装";
    }
}
