package org.example.consumer;

import org.example.pizzaservice.PizzaMaker;

import java.util.List;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    private final Scanner scanner = new Scanner(System.in);
    private final ServiceLoader<PizzaMaker> serviceLoader = ServiceLoader.load(PizzaMaker.class);
    private boolean loop = true;

    public static void main(String[] args) {
        Main main = new Main();
        main.runApp();
    }

    private void runApp() {
        List<PizzaMaker> pizzas = serviceLoader.stream().map(ServiceLoader.Provider::get).toList();

        while(loop) {
            int userChoice = getPizzaChoice();
            if(userChoice == 0)
                loop = false;
            PizzaMaker pizzaMaker = pizzas.get(userChoice - 1);
            printPizzas(pizzaMaker);
        }
    }

    private void printToConsole(String text) {
        System.out.println(text);
    }

    private void printPizzas(PizzaMaker pizzas) {
        printToConsole(pizzas.pizzaOrder());
    }

    private String input() {
        return scanner.nextLine();
    }

    private int parseChoiceToInt() {
        return Integer.parseInt(input());
    }

    private int getPizzaChoice() {
        printToConsole("\nMENY:\nKebabpizza(1) \nHawaiiPizza (2) \nExit(0)");
        return parseChoiceToInt();
    }

}
