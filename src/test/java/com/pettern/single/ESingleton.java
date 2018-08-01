package com.pettern.single;

public class ESingleton {
    private static ESingleton singleton;

    private ESingleton() {
    }

    public static  ESingleton ESingleton() {
        if (singleton == null) {
            singleton = new ESingleton();
        }
        return singleton;
    }
}
