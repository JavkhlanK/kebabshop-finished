package at.kaindorf.factories;

import at.kaindorf.pojos.Kebab;

import java.util.List;

/**
 * Project: kebabshop
 * Created by: raph
 * Date: 2024-04-10
 * Time: 19:26:41
 */
public abstract class KebabFactory {

    public abstract Kebab createKebab(String type, List<String> unwantedIngredients);

    public abstract String getName();
}
