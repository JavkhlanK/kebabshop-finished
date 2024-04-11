package at.kaindorf.pojos;

import java.util.List;

/**
 * Project: kebabshop
 * Created by: raph
 * Date: 2024-04-10
 * Time: 19:25:16
 */
public class CheeseKebab extends Kebab {
    public CheeseKebab(List<String> unwantedIngredients) {
        name = "Cheese Kebab";
        ingredients.addAll(List.of("Meat", "Salad", "Mystery Sauce", "Tomato", "Cheese"));
        ingredients.removeAll(unwantedIngredients);
    }

    @Override
    public double getPrice() {
        return 3.5;
    }
}
