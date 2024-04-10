package at.kaindorf.pojos;

import java.time.LocalDate;
import java.util.List;

/**
 * Project: kebabshop
 * Created by: raph
 * Date: 2024-04-10
 * Time: 19:38:04
 */
public class WagnaStyleCheeseKebab extends Kebab {
    public WagnaStyleCheeseKebab(List<String> unwantedIngredients) {
        ingredients.addAll(List.of("Meat", "Salad", "Mystery Sauce", "Tomato", "Cheese", "Cabbage", "Wagna-Special-Ingredient"));
        name = "Wagna Cheese Kebab";
    }

    @Override
    public double getPrice() {
        return 3.5;
    }
}
