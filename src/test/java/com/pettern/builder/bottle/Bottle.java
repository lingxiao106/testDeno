package com.pettern.builder.bottle;

import com.pettern.builder.dao.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "装入饮料";
    }
}
