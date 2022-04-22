package org.example.pizzaprovider;

import org.example.pizzaservice.PizzaMaker;
import org.example.pizzaservice.PizzaType;

@PizzaType
public class MargheritaPizza implements PizzaMaker {

    @Override
    public String pizzaOrder() {
        return "Pizza order: Margherita \n Margherita on the way!\n";
    }
}
