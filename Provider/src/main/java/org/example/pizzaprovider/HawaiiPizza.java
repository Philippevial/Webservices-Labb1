package org.example.pizzaprovider;

import org.example.pizzaservice.PizzaMaker;

public class HawaiiPizza implements PizzaMaker {

    @Override
    public String pizzaOrder() {
        return "Pizza order: HawaiiPizza \n HawaiiPizza on the way!";
    }
}
