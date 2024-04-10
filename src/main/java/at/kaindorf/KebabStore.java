package at.kaindorf;

import at.kaindorf.factories.KebabFactory;
import at.kaindorf.pojos.Kebab;

import java.util.List;

/**
 * Project: kebabshop
 * Created by: raph
 * Date: 2024-04-10
 * Time: 20:07:33
 */
public class KebabStore {
    private KebabFactory kebabFactory;

    public  KebabStore(KebabFactory kebabFactory) {
        this.kebabFactory = kebabFactory;
    }

    public String getName() {
        return kebabFactory.getName();
    }
    public Kebab orderKebab(String type, List<String> unwantedIngredients) {
        Kebab kebab = kebabFactory .createKebab(type, unwantedIngredients);
        kebab.prepare();
        kebab.box();

        return kebab;
    }
}
