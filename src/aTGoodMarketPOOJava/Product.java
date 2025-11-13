package aTGoodMarketPOOJava;

import java.time.LocalDate;

public abstract class Product {

    private String name;
    private double unitPrice;
    private double stockQuantity;
    private LocalDate pickingDate;
    private int shelfLifeDays;

    // Constructeur
    public Product(String name, double unitPrice, double stockQuantity, LocalDate pickingDate, int shelfLifeDays) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.stockQuantity = stockQuantity;
        this.pickingDate = pickingDate;
        this.shelfLifeDays = shelfLifeDays;
    }

    // Getters et setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(double stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public LocalDate getPickingDate() {
        return pickingDate;
    }

    public void setPickingDate(LocalDate pickingDate) {
        this.pickingDate = pickingDate;
    }

    public int getShelfLifeDays() {
        return shelfLifeDays;
    }

    public void setShelfLifeDays(int shelfLifeDays) {
        this.shelfLifeDays = shelfLifeDays;
    }
    
    @Override
    public String toString() {
        return getName() 
               + " : prix unitaire = " + getUnitPrice() + " €, "
               + "stock = " + getStockQuantity() + ", "
               + "cueillette le " + getPickingDate() + ", "
               + "expiration le " + calculateExpirationDate();
    }



    public abstract LocalDate calculateExpirationDate();

    public static void updateStock() {
        return;
    }
}
