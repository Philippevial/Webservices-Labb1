package org.example.pizzaprovider;

import org.example.pizzaservice.PizzaMaker;

public class KebabPizza implements PizzaMaker {

    public KebabPizza() {
        System.out.println("Pizza order: Kebabpizza");
    }

    @Override
    public String pizzaOrder() {
        return "Kebabpizza on the way!";
    }
}
