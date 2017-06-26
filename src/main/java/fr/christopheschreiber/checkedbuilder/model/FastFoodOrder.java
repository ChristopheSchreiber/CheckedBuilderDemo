package fr.christopheschreiber.checkedbuilder.model;

/**
 * This data class is the model of a fast food order
 * There is no getter in order to keep it simple for the example
 */
public class FastFoodOrder {

    private OrderType orderType;
    private MealType mealType;
    private BreadType breadType;
    private Recipe recipe;
    private Sauce sauce;

    FastFoodOrder(FastFoodOrderBuilder builder) {
        this.orderType = builder.orderType;
        this.mealType = builder.mealType;
        this.breadType = builder.breadType;
        this.recipe = builder.recipe;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "FastFoodOrder{" +
                "orderType=" + orderType +
                ", mealType=" + mealType +
                ", breadType=" + breadType +
                ", recipe=" + recipe +
                ", sauce=" + sauce +
                '}';
    }

    public static FastFoodOrderBuilder newOrder() {
        return new FastFoodOrderBuilder();
    }

}
