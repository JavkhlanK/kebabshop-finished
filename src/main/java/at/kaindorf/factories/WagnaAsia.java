package at.kaindorf.factories;

import at.kaindorf.pojos.*;

import java.util.List;

/**
 * Project: kebabshop
 * Created by: raph
 * Date: 2024-04-10
 * Time: 19:35:19
 */
public class WagnaAsia extends KebabFactory {
    @Override
    public Kebab createKebab(String type, List<String> unwantedIngredients) {
        Kebab kebab = null;
        if (type.equalsIgnoreCase("cheese")) {
            kebab = new WagnaStyleCheeseKebab(unwantedIngredients);
        } else if (type.equalsIgnoreCase("spicy")) {
            kebab = new WagnaStyleSpicyKebab(unwantedIngredients);
        } else if (type.equalsIgnoreCase("mild")) {
            kebab = new MildKebab(unwantedIngredients);
        }
        return kebab;
    }

    @Override
    public String getName() {
        return "Wagna Asia";
    }
}
