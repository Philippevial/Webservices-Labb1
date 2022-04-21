package org.example.pizzaprovider;

import org.example.pizzaservice.PizzaMaker;

public class KebabPizza implements PizzaMaker {

    @Override
    public String pizzaOrder() {
        return "Pizza order: Kebabpizza \n Kebabpizza on the way!";
    }
}
