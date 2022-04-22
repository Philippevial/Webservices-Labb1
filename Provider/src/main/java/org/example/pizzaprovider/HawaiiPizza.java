package org.example.pizzaprovider;

import org.example.pizzaservice.PizzaMaker;
import org.example.pizzaservice.PizzaType;

@PizzaType("2. Hawaii")
public class HawaiiPizza implements PizzaMaker {

    @Override
    public String pizzaOrder() {
        return "Pizza order: Hawaii \n Hawaii on the way!\n";
    }
}
