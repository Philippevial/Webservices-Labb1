package org.example.consumer;

import org.example.pizzaservice.PizzaMaker;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {


        ServiceLoader<PizzaMaker> pizzaLoader = ServiceLoader.load(PizzaMaker.class);

        for (PizzaMaker get : pizzaLoader)
            System.out.println(get.pizzaOrder());
    }
}
