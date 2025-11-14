package aTGoodMarketPOOJava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AtGoodMarket {

	public static void main(String[] args) {
	    
	    ArrayList<Object> stock = creation_products();

	    // Menu simple
	    Scanner scanner = new Scanner(System.in);
	    int choice = 0;

	    while (choice != 3) {  
	        System.out.println("1. Passer Commande");
	        System.out.println("2. Bilan de la journée");
	        System.out.println("3. Quitter");
	        System.out.print("Votre choix : ");
	        choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("\n--- Stock total ---");
	                for (Object produce : stock) {
	                    System.out.println(produce);
	                }
	                break;
	            case 2:
	                System.out.println("Bilan");
	                break;
	            case 3:
	                System.out.println("Au revoir");
	                scanner.close();
	                break;  
	            default:
	                System.out.println("Choix invalide, réessayez");
	        }
	    }
	}


	private static ArrayList<Object> creation_products() {
		ArrayList<Object> stock = new ArrayList<>();
    	
        // Fruits
        Fruit clementine = new Fruit("Clementine", 2.90, 6, LocalDate.of(2025, 11, 3), 7);
        Fruit date = new Fruit("Date", 7.00, 4, LocalDate.of(2025, 11, 7), 3);
        Fruit pomegranate = new Fruit("Pomegranate", 3.50, 3, LocalDate.of(2025, 11, 12), 10);
        Fruit khaki = new Fruit("Khaki", 4.50, 3, LocalDate.of(2025, 11, 18), 15);
        Fruit kiwi = new Fruit("Kiwi", 3.50, 5, LocalDate.of(2025, 11, 5), 6);
        Fruit mandarine = new Fruit("Mandarin", 2.80, 6, LocalDate.of(2025, 11, 22), 21);
        Fruit orange = new Fruit("Orange", 1.50, 8, LocalDate.of(2025, 11, 15), 12);
        Fruit grapefruit = new Fruit("Grapefruit", 2.00, 8, LocalDate.of(2025, 11, 28), 3);
        Fruit pear = new Fruit("Pear", 2.50, 5, LocalDate.of(2025, 11, 9), 4);
        Fruit apple = new Fruit("Apple", 1.50, 8, LocalDate.of(2025, 11, 30), 8);
        stock.add(clementine);
        stock.add(date);
        stock.add(pomegranate);
        stock.add(khaki);
        stock.add(kiwi);
        stock.add(mandarine);
        stock.add(orange);
        stock.add(grapefruit);
        stock.add(pear);
        stock.add(apple);

        // Légumes
        Vegetable carrot = new Vegetable("Carrot", 1.30, 7, LocalDate.of(2025, 11, 2), 15);
        Vegetable brusselsSprouts = new Vegetable("Brussels Sprouts", 4.00, 4, LocalDate.of(2025, 11, 6), 20);
        Vegetable greenCabbage = new Vegetable("Green Cabbage", 2.50, 12, LocalDate.of(2025, 11, 10), 4);
        Vegetable butternutSquash = new Vegetable("Butternut Squash", 2.50, 6, LocalDate.of(2025, 11, 14), 8);
        Vegetable endive = new Vegetable("Endive", 2.50, 5, LocalDate.of(2025, 11, 19), 23);
        Vegetable spinach = new Vegetable("Spinach", 2.60, 4, LocalDate.of(2025, 11, 23), 9);
        Vegetable leek = new Vegetable("Leek", 1.20, 5, LocalDate.of(2025, 11, 11), 2);
        Vegetable pumpkin = new Vegetable("Pumpkin", 2.50, 6, LocalDate.of(2025, 11, 17), 4);
        Vegetable blackRadish = new Vegetable("Black Radish", 5.00, 10, LocalDate.of(2025, 11, 25), 5);
        Vegetable salsify = new Vegetable("Salsify", 2.50, 3, LocalDate.of(2025, 11, 29), 7);
        stock.add(carrot);
        stock.add(brusselsSprouts);
        stock.add(greenCabbage);
        stock.add(butternutSquash);
        stock.add(endive);
        stock.add(spinach);
        stock.add(leek);
        stock.add(pumpkin);
        stock.add(blackRadish);
        stock.add(salsify);
		return stock;
	}
}
