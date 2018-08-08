package com.pettern.prototype;

public class PrototypePattern {

    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape cloneShape = ShapeCache.getShape("1");

        System.out.println("aaaa" + cloneShape.getType());
    }
}
