package at.kaindorf;

import at.kaindorf.pojos.Kebab;
import at.kaindorf.pojos.MildKebab;
import at.kaindorf.pojos.WagnaStyleCheeseKebab;
import at.kaindorf.pojos.WagnaStyleSpicyKebab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Wagna Asia!");

        boolean isDone = false;
        String type = null;
        List<String> unwantedIngredients = new ArrayList<>();
        try (var scanner = new Scanner(System.in).useDelimiter("\n")) {
            System.out.print("What kind of kebab do you want? (cheese, spicy, mild) ");
            while (!isDone) {
                String input = scanner.next();

                if (type == null) {
                    if (input.equalsIgnoreCase("cheese")
                            || input.equalsIgnoreCase("spicy") || input.equalsIgnoreCase("mild")) {
                        type = input;
                        System.out.println("Any ingredients you don't want in your kebab? If none, just press enter.");
                    } else {
                        System.out.print("What kind of kebab do you want? (cheese, spicy, mild) ");
                    }
                } else {
                    if (input.isEmpty()) {
                        isDone = true;
                    } else {
                        unwantedIngredients.add(input);
                    }
                }
            }

            Kebab kebab = null;
            if (type.equalsIgnoreCase("cheese")) {
                kebab = new WagnaStyleCheeseKebab(unwantedIngredients);
            } else if (type.equalsIgnoreCase("spicy")) {
                kebab = new WagnaStyleSpicyKebab(unwantedIngredients);
            } else if (type.equalsIgnoreCase("mild")) {
                kebab = new MildKebab(unwantedIngredients);
            }
            System.out.println(kebab);
        }
    }
}