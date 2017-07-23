package fr.christopheschreiber.checkedbuilder.model;

import fr.christopheschreiber.checkedbuilder.model.builder.*;

/**
 * Created by Christophe on 26/06/2017.
 */
public class FastFoodOrderBuilder implements EmptyOrder, OrderWithOrderType, SandwichOrder, EmptyMealOrder,
        OrderFinalizer{

    OrderType orderType;
    MealType mealType;
    BreadType breadType;
    Recipe recipe;
    Sauce sauce;

    public FastFoodOrder buildOrder() {
        switch (mealType) {
            case SANDWICH:
                return new Sandwich(this);
            case SALAD:
                return new Salad(this);
            default:
                throw new IllegalArgumentException("Unknown meal type" + mealType);
        }
    }

    public OrderWithOrderType eatOnSite() {
        this.orderType = OrderType.ON_SITE;
        return this;
    }

    public OrderWithOrderType takeAway() {
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