package at.kaindorf.pojos;

import java.util.List;

/**
 * Project: kebabshop
 * Created by: raph
 * Date: 2024-04-10
 * Time: 19:25:47
 */
public class MildKebab extends Kebab {
    public MildKebab(List<String> unwantedIngredients) {
        name = "Mild Kebab";
        ingredients.addAll(List.of("Meat", "Salad", "Mild Sauce", "Tomato", "Cabbage"));
        ingredients.removeAll(unwantedIngredients);
    }

    @Override
    public double getPrice() {
        return 2.5;
    }
}
