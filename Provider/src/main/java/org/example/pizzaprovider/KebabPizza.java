package org.example.pizzaprovider;

import org.example.pizzaservice.PizzaMaker;
import org.example.pizzaservice.PizzaType;

@PizzaType("1. KebabPizza")
public class KebabPizza implements PizzaMaker {

    @Override
    public String pizzaOrder() {
        return "Pizza order: Kebabpizza \n Kebabpizza on the way!\n";
    }
}
