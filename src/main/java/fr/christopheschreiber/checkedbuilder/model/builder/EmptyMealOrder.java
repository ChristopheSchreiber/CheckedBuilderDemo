package fr.christopheschreiber.checkedbuilder.model.builder;

import fr.christopheschreiber.checkedbuilder.model.Recipe;

/**
 * Created by Christophe on 26/06/2017.
 */
public interface EmptyMealOrder {
    public OrderFinalizer withBaseRecipe(Recipe recipe);
}
