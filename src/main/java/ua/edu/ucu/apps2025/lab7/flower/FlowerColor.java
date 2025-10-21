package ua.edu.ucu.apps2025.lab7.flower;

import lombok.Getter;

@Getter
public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"),
    WHITE("FFFFFF"),
    BLUE("#0000FF");
    private final String stringRepresentation;

    private FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}

