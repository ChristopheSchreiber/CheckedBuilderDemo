package fr.christopheschreiber.checkedbuilder.model;

/**
 * Created by Christophe on 26/06/2017.
 */
public class FastFoodOrderBuilder {

    OrderType orderType;
    MealType mealType;
    BreadType breadType;
    Recipe recipe;
    Sauce sauce;

    public FastFoodOrder buildOrder() {
        return new FastFoodOrder(this);
    }

    public FastFoodOrderBuilder eatOnSite() {
        this.orderType = OrderType.ON_SITE;
        return this;
    }

    public FastFoodOrderBuilder takeAway() {
        this.orderType = OrderType.TAKE_AWAY;
        return this;
    }
    public FastFoodOrderBuilder orderSandwich() {
        this.mealType = MealType.SANDWICH;
        return this;
    }

    public FastFoodOrderBuilder orderSalad() {
        this.mealType = MealType.SALAD;
        return this;
    }

    public FastFoodOrderBuilder chooseBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    public FastFoodOrderBuilder withBaseRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }

    public FastFoodOrderBuilder withSauce(Sauce sauce) {
        this.sauce = sauce;
        return this;
    }
}