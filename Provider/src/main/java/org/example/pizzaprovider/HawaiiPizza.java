package org.example.pizzaprovider;

import org.example.pizzaservice.PizzaMaker;

public class HawaiiPizza implements PizzaMaker {

    public HawaiiPizza() {
        System.out.println("Pizza order: HawaiiPizza");
    }

    @Override
    public String pizzaOrder() {
        return "HawaiiPizza on the way!";
    }
}
