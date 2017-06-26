package fr.christopheschreiber.checkedbuilder.model.builder;

import fr.christopheschreiber.checkedbuilder.model.BreadType;

/**
 * Created by Christophe on 26/06/2017.
 */
public interface SandwichOrder {
    public EmptyMealOrder chooseBread(BreadType breadType);
}
