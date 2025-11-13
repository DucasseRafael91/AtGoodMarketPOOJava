package aTGoodMarketPOOJava;

import java.time.LocalDate;

public class Vegetable extends Product {

    public Vegetable(String name, double unitPrice, double stockQuantity, LocalDate pickingDate, int shelfLifeDays) {
        super(name, unitPrice, stockQuantity, pickingDate, shelfLifeDays); 
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
