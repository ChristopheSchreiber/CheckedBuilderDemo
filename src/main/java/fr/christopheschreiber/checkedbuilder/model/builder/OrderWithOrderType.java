package fr.christopheschreiber.checkedbuilder.model.builder;

/**
 * Created by Christophe on 26/06/2017.
 */
public interface OrderWithOrderType {

    public SandwichOrder orderSandwich();
    public EmptyMealOrder orderSalad();
}
