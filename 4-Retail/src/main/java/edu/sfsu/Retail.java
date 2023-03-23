package edu.sfsu;

public class Retail {
    private final String description;
    private final double price;
    private final int unitsOnHand;
    public static int referenceCount = 0;
    Retail(String description, double price, int unitsOnHand) {
        this.description = description;
        this.price = price;
        this.unitsOnHand = unitsOnHand;
        referenceCount++;
    }
    public int getReferenceCount() {
        return referenceCount;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public int getUnitsOnHand() {
        return unitsOnHand;
    }

}