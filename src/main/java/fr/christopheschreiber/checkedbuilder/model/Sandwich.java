package fr.christopheschreiber.checkedbuilder.model;

public class Sandwich extends FastFoodOrder {

    private BreadType breadType;

    Sandwich(FastFoodOrderBuilder builder) {
        super(builder);
        this.breadType = builder.breadType;
    }

    @Override
    public String toString() {
        return "Sandwich {" +
                "orderType=" + orderType +
                ", bread=" + breadType +
                ", recipe=" + recipe +
                ", " + (sauce != null ? "sauce=" + sauce : "no sauce") +
                '}';
    }
}
