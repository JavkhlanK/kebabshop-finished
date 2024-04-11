package at.kaindorf.pojos;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: kebabshop
 * Created by: raph
 * Date: 2024-04-10
 * Time: 19:19:22
 */
public abstract class Kebab {
    protected List<String> ingredients = new ArrayList<>();
    protected String name;

    public void prepare() {
        System.out.println("Baking bread...");
        for (int i = 0; i < ingredients.size(); i++) {
            if (i==0)
                System.out.println("Adding ingredients: ");
            System.out.println(" " + ingredients.get(i));
        }
    }
    public void box() {
        System.out.println("Boxing kebab...");
        System.out.println("Your kebab has been created, enjoy your meal.");
    }

    public abstract double getPrice();
}
