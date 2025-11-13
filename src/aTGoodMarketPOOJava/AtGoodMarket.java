package aTGoodMarketPOOJava;

import java.time.LocalDate;

public class AtGoodMarket {

    public static void main(String[] args) {
        // Création d'un fruit avec le nom, le prix, le stock et la date de cueillette
        Fruit clementine = new Fruit("Clémentine", 2.90, 6, LocalDate.of(2025, 11, 13));

        // Affichage du fruit
        System.out.println(clementine);
    }
}
