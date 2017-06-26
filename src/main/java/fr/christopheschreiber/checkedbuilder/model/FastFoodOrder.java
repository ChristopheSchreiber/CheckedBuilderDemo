package fr.christopheschreiber.checkedbuilder.model;

import fr.christopheschreiber.checkedbuilder.model.builder.*;

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
                (mealType == MealType.SANDWICH ? ", breadType=" + breadType : "") +
                ", recipe=" + recipe +
                (sauce != null ? ", sauce=" + sauce : "") +
                '}';
    }

    public static EmptyOrder newOrder() {
        return new FastFoodOrderBuilder();
    }

    public static class FastFoodOrderBuilder implements EmptyOrder, OrderWithMealType,
            SandwichOrder, EmptyMealOrder, OrderFinalizer {

        OrderType orderType;
        MealType mealType;
        BreadType breadType;
        Recipe recipe;
        Sauce sauce;

        public FastFoodOrder buildOrder() {
            return new FastFoodOrder(this);
        }

        public OrderWithMealType eatOnSite() {
            this.orderType = OrderType.ON_SITE;
            return this;
        }

        public OrderWithMealType takeAway() {
            this.orderType = OrderType.TAKE_AWAY;
            return this;
        }

        public SandwichOrder orderSandwich() {
            this.mealType = MealType.SANDWICH;
            return this;
        }

        public EmptyMealOrder orderSalad() {
            this.mealType = MealType.SALAD;
            return this;
        }

        public EmptyMealOrder chooseBread(BreadType breadType) {
            this.breadType = breadType;
            return this;
        }

        public OrderFinalizer withBaseRecipe(Recipe recipe) {
            this.recipe = recipe;
            return this;
        }

        public OrderFinalizer withSauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }
    }
}
