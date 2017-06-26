package fr.christopheschreiber.checkedbuilder.model.builder;

import fr.christopheschreiber.checkedbuilder.model.FastFoodOrder;
import fr.christopheschreiber.checkedbuilder.model.Sauce;

/**
 * Created by Christophe on 26/06/2017.
 */
public interface OrderFinalizer {

    public OrderFinalizer withSauce(Sauce sauce);
    public FastFoodOrder buildOrder();

}
