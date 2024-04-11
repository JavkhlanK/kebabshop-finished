package at.kaindorf.pojos;

import java.util.List;

/**
 * Project: kebabshop
 * Created by: raph
 * Date: 2024-04-10
 * Time: 19:22:02
 */
public class SpicyKebab extends Kebab {
    public SpicyKebab(List<String> unwantedIngredients) {
        ingredients.add("Meat");
        ingredients.add("Salad");
        ingredients.add("Spicy Sauce");
        ingredients.add("Tomato");
        name = "Spicy Kebab";
        ingredients.removeAll(unwantedIngredients);
    }

    @Override
    public double getPrice() {
        return 3;
    }
}
