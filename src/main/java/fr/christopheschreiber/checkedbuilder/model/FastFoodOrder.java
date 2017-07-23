package fr.christopheschreiber.checkedbuilder.model;

/**
 * This data class is the model of a fast food order
 * There is no getter in order to keep it simple for the example
 */
public class FastFoodOrder {

    protected OrderType orderType;
    protected Recipe recipe;
    protected Sauce sauce;

    FastFoodOrder(FastFoodOrderBuilder builder) {
        this.orderType = builder.orderType;
        this.recipe = builder.recipe;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "FastFoodOrder {" +
                "orderType=" + orderType +
                ", recipe=" + recipe +
                ", " + (sauce != null ? "sauce=" + sauce : "no sauce") +
                '}';
    }

    public static FastFoodOrderBuilder newOrder() {
        return new FastFoodOrderBuilder();
    }

}
