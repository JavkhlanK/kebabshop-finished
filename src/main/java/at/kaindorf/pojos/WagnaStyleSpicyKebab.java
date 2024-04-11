package at.kaindorf.pojos;

import java.util.List;

/**
 * Project: kebabshop
 * Created by: raph
 * Date: 2024-04-10
 * Time: 19:38:45
 */
public class WagnaStyleSpicyKebab extends Kebab {
    public WagnaStyleSpicyKebab(List<String> unwantedIngredients) {
        name = "Spicy Wagna Kebab";
        ingredients.addAll(List.of("Meat", "Salad", "Spicy Sauce", "Tomato", "Cabbage", "Wagna-Special-Ingredient"));
        ingredients.removeAll(unwantedIngredients);
    }

    @Override
    public double getPrice() {
        return 3;
    }
}
