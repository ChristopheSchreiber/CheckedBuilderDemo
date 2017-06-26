package fr.christopheschreiber.checkedbuilder.app;

import fr.christopheschreiber.checkedbuilder.model.BreadType;
import fr.christopheschreiber.checkedbuilder.model.FastFoodOrder;
import fr.christopheschreiber.checkedbuilder.model.Sauce;

/**
 * This class is a quick main to show how the FastFoodOrderBuilder class is used
 */
public class FastFood {

    public static void main(String[] args) {
        FastFoodOrder order = FastFoodOrder.newOrder()
                .chooseBread(BreadType.SIMPLE)
                .orderSalad()
                .eatOnSite()
                .withSauce(Sauce.KETCHUP)
                .buildOrder();
        System.out.printf(order.toString());
    }
}
