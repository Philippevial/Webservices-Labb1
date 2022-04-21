package org.example.consumer;

import org.example.pizzaservice.PizzaMaker;

import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        ServiceLoader<PizzaMaker> pizzaLoader = ServiceLoader.load(PizzaMaker.class);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\nKebabpizza(1) \nHawaiiPizza (2) \nExit(0)");
            String input = scanner.nextLine();

            var kebabpizza = pizzaLoader.stream()
                    .filter(pizzaMakerProvider -> pizzaMakerProvider.type().getSimpleName().startsWith("Kebab"))
                    .map(ServiceLoader.Provider::get)
                    .toList();

            var hawaiipizza = pizzaLoader.stream()
                    .filter(pizzaMakerProvider -> pizzaMakerProvider.type().getSimpleName().startsWith("Hawaii"))
                    .map(ServiceLoader.Provider::get)
                    .toList();

            if (input.equals("1"))
                for (PizzaMaker pizzaMaker : kebabpizza)
                    System.out.println(pizzaMaker.pizzaOrder());

            if (input.equals("2"))
                for (PizzaMaker pizzaMaker : hawaiipizza)
                    System.out.println(pizzaMaker.pizzaOrder());

            if(input.equals("0")) {
                System.out.println("Goodbye");
                break;
            }
        }
    }
}
