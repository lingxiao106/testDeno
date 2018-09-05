package com.pettern.bulidType.single;

public class TestSingle {

    public static void main(String[] args){
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.getMessage();
    }
}
