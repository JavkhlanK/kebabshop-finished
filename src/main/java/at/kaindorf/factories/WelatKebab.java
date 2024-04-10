package at.kaindorf.factories;

import at.kaindorf.pojos.*;

import java.util.List;

/**
 * Project: kebabshop
 * Created by: raph
 * Date: 2024-04-10
 * Time: 20:00:35
 */
public class WelatKebab extends KebabFactory {
    @Override
    public Kebab createKebab(String type, List<String> unwantedIngredients) {
        Kebab kebab = null;
        if (type.equalsIgnoreCase("cheese")) {
            kebab = new CheeseKebab(unwantedIngredients);
        } else if (type.equalsIgnoreCase("spicy")) {
            kebab = new SpicyKebab(unwantedIngredients);
        } else if (type.equalsIgnoreCase("mild")) {
            kebab = new MildKebab(unwantedIngredients);
        }
        return kebab;
    }



    @Override
    public String getName() {
        return "Welat Kebabhaus";
    }
}
