package aTGoodMarketPOOJava;

import java.time.LocalDate;

public class Vegetable extends Product {

    public Vegetable(String name, double unitPrice, double stockQuantity, LocalDate pickingDate) {
        super(name, unitPrice, stockQuantity, pickingDate, 7); 
    }

    @Override
    public LocalDate calculateExpirationDate() {
        return getPickingDate().plusDays(getShelfLifeDays());
    }

    @Override
    public String toString() {
        return "Legume : " + super.toString();
    }
}
