package at.kaindorf;

import at.kaindorf.factories.KebabFactory;
import at.kaindorf.factories.WagnaAsia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KebabStore kebabStore = new KebabStore(new WagnaAsia());
        System.out.println("Welcome to " + kebabStore.getName() + "!");

        boolean isDone = false;
        String type = "";
        List<String> unwantedIngredients = new ArrayList<>();
        try (var scanner = new Scanner(System.in).useDelimiter("\n")) {
            while (!isDone) {
                System.out.print("What kind of kebab do you want? (cheese, spicy, mild) ");
                String input = scanner.next();
                // String input = "cheese";
                if (input.equalsIgnoreCase("cheese") || input.equalsIgnoreCase("spicy") || input.equalsIgnoreCase("mild")) {
                    type = input;
                    isDone = true;
                } else System.out.println("Wrong input!");
            }

            isDone = false;
            while (!isDone) {
                String input = scanner.next();
                // String input = "";
                if (unwantedIngredients.isEmpty()) {
                    System.out.println("Any ingredients you don't want in your kebab? If none, just press enter.");
                }

                if (input.isEmpty()) {
                    isDone = true;
                } else {
                    unwantedIngredients.add(input);
                }

            }


            var kebab = kebabStore.orderKebab(type, unwantedIngredients);
            System.out.println(kebab);
        }
    }
}