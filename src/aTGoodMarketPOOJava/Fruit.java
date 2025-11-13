package aTGoodMarketPOOJava;

import java.time.LocalDate;

public class Fruit extends Product {

    // 🔹 Constructeur
    public Fruit(String name, double unitPrice, double stockQuantity, LocalDate pickingDate) {
        setName(name);
        setUnitPrice(unitPrice);
        setStockQuantity(stockQuantity);
        setPickingDate(pickingDate);
        setShelfLifeDays(7);
    }


    public LocalDate calculateExpirationDate() {
        return getPickingDate().plusDays(getShelfLifeDays());
    }

    // 🔹 Pour un affichage lisible
    @Override
    public String toString() {
        return "Fruit : " + getName()
                + ", prix unitaire = " + getUnitPrice() + " €"
                + ", stock = " + getStockQuantity()
                + ", date de cueillette = " + getPickingDate()
                + ", expiration = " + calculateExpirationDate();
    }
}
