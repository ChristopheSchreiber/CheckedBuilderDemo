package fr.christopheschreiber.checkedbuilder.app;

import fr.christopheschreiber.checkedbuilder.model.BreadType;
import fr.christopheschreiber.checkedbuilder.model.FastFoodOrder;
import fr.christopheschreiber.checkedbuilder.model.Recipe;
import fr.christopheschreiber.checkedbuilder.model.Sauce;

/**
 * This class is a quick main to show how the {@link fr.christopheschreiber.checkedbuilder.model.builder.FastFoodOrderBuilder} class is used
 */
public class FastFood {

    public static void main(String[] args) {
        FastFoodOrder chickenSandwichWithoutSauce = FastFoodOrder.newOrder()
                .eatOnSite()
                .orderSandwich()
                .chooseBread(BreadType.SIMPLE)
                .withBaseRecipe(Recipe.CHICKEN)
                .buildOrder();
        System.out.println(chickenSandwichWithoutSauce.toString());

        FastFoodOrder veggieSandwichWithKetchup = FastFoodOrder.newOrder()
                .takeAway()
                .orderSandwich()
                .chooseBread(BreadType.CHEESY)
                .withBaseRecipe(Recipe.VEGGIE)
                .withSauce(Sauce.KETCHUP)
                .buildOrder();
        System.out.println(veggieSandwichWithKetchup.toString());

        FastFoodOrder hamSalad = FastFoodOrder.newOrder()
                .eatOnSite()
                .orderSalad()
                .withBaseRecipe(Recipe.HAM)
                .withSauce(Sauce.OLIVE_OIL)
                .buildOrder();
        System.out.println(hamSalad.toString());
    }
}
