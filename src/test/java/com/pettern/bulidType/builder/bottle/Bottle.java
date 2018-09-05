package com.pettern.bulidType.builder.bottle;

import com.pettern.bulidType.builder.dao.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "装入饮料";
    }
}
