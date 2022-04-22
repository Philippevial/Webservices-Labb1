package org.example.consumer;

import org.example.pizzaservice.PizzaMaker;
import org.example.pizzaservice.PizzaType;

import java.util.List;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    private final Scanner scanner = new Scanner(System.in);
    private final ServiceLoader<PizzaMaker> serviceLoader = ServiceLoader.load(PizzaMaker.class);


    public static void main(String[] args) {
        Main main = new Main();
        main.runApp();
    }

    private void runApp() {
        List<ServiceLoader.Provider<PizzaMaker>> pizzas = serviceLoader.stream().toList();

        while (true) {
            int userChoice = getPizzaChoice(pizzas);
            if (userChoice == 0) {
                break;
            }
            ServiceLoader.Provider<PizzaMaker> pizzaMaker = pizzas.get(userChoice - 1);
            printPizzas(pizzaMaker);
        }
    }

    private void printToConsole(String text) {
        System.out.println(text);
    }

    private void printPizzas(ServiceLoader.Provider<PizzaMaker> pizzas) {
        System.out.println(pizzas.get().pizzaOrder());
    }

    private String input() {
        return scanner.nextLine();
    }

    private int parseChoiceToInt() {
        return Integer.parseInt(input());
    }

    private int getPizzaChoice(List<ServiceLoader.Provider<PizzaMaker>> pizzas) {

        for (ServiceLoader.Provider<PizzaMaker> p : pizzas) {
            var pizzatype = p.type().getAnnotation(PizzaType.class);
            if (pizzatype == null)
                printToConsole("No annotations of PizzaType found");
            else
                printToConsole(pizzatype.value());
        }
        printToConsole("0. Exit\nEnter number of the pizza you want: \n");

        return parseChoiceToInt();
    }
}
