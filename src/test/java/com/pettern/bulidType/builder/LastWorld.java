package com.pettern.bulidType.builder;

import com.pettern.bulidType.builder.burger.ChickenBurger;
import com.pettern.bulidType.builder.done.Meal;
import com.pettern.bulidType.builder.done.MealBuilder;

public class LastWorld {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
//        Meal meal = mealBuilder.prepareVegMeal();
//        meal.showItem();
//        System.out.println(meal.getCost());

//
//        Meal meal1 = mealBuilder.prepareNonVegMeal();
//        meal1.showItem();
//        System.out.println(meal1.getCost());

        Meal meal = new Meal();
        meal.setItem(new ChickenBurger());
        System.err.println(mealBuilder.prepareVegMeal().getCost() +    mealBuilder.prepareNonVegMeal().getCost() + meal.getCost());
    }
}
