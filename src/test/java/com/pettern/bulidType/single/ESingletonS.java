package com.pettern.bulidType.single;

public class ESingletonS {

    private static ESingletonS singletonS;

    private ESingletonS() {
    }

    public static synchronized ESingletonS ESingletonS() {
        if (singletonS == null) {
            singletonS = new ESingletonS();
        }
        return singletonS;
    }
}
