package com.test.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestLambda {

    @Test
    public void textLambda() {
        List<String> strings = new ArrayList<>();
        strings.add("x");
        strings.add("x1");
        strings.add("x2");
        strings.add("x3");
        strings.add("x4");
        strings.forEach(System.out::println);

        TestLambda testLambda = new TestLambda();

        MathOperation mathOperation = (int a, int b) -> a + b;

        MathOperation subtraction = ((a, b) -> a - b);

        MathOperation multiplication = ((a, b) -> {
            return a * b;
        });

        MathOperation division = (int a, int b) -> a / b;

        System.out.println("no1" + testLambda.operate(1, 2, mathOperation));
        System.out.println("no2" + testLambda.operate(1, 2, subtraction));
        System.out.println("no3" + testLambda.operate(1, 2, multiplication));
        System.out.println("no4" + testLambda.operate(1, 2, division));

        GreetingService greetingService = (String message) -> System.out.println(message);

        GreetingService greetingService1 = message -> {
            System.out.println(message);
        };

        greetingService.sayMessage("xiaowang");

        greetingService1.sayMessage("xiaohei");


    }

    @Test
    public void testFunMethod(){

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
