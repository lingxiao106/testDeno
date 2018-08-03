package com.pettern.builder.done;

import com.pettern.builder.bottle.Coke;
import com.pettern.builder.bottle.Pepsi;
import com.pettern.builder.burger.ChickenBurger;
import com.pettern.builder.burger.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.setItem(new VegBurger());
        meal.setItem(new Coke());

        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.setItem(new VegBurger());
        meal.setItem(new Coke());
        meal.setItem(new Pepsi());
        meal.setItem(new ChickenBurger());
        return meal;
    }
}
