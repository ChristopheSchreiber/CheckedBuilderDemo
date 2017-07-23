package fr.christopheschreiber.checkedbuilder.model;

public class Salad extends FastFoodOrder {

    Salad(FastFoodOrderBuilder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "Salad {" +
                "orderType=" + orderType +
                ", recipe=" + recipe +
                ", " + (sauce != null ? "sauce=" + sauce : "no sauce") +
                '}';
    }
}
