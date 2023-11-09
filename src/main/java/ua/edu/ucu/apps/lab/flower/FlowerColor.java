package ua.edu.ucu.apps.lab.flower;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF");

    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }

    public static FlowerColor toFlowerColor(String color) {
        if (color == "blue") {
            return FlowerColor.BLUE;
        }
        if (color == "red") {
            return FlowerColor.RED;
        }
        return null;
    }
}
