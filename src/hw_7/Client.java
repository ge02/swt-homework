package hw_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		// Define Visitor
		PriceVisitor priceVisitor = new PriceVisitor();
		PackInstVisitor packVisitor = new PackInstVisitor();

		// Initialise some household
		List<HouseholdItem> householdItmes = new ArrayList<>();

		Electronic microwaveOven = new Electronic("Microwave Oven", 37, 48, 27, 13, false);
		Electronic tv = new Electronic("TV", 122, 73, 15, 18, true);

		Glass wineGlass = new Glass("Wine glasses", 33, 28, 23, 1);
		Glass coffeeTable = new Glass("Glass Coffee Table ", 80, 80, 45, 3);

		Furniture bed = new Furniture("Bed", "Metal", 205, 91, 94, 26);
		Furniture cupboard = new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);

		List<HouseholdItem> namesList = Arrays.asList(microwaveOven, tv, wineGlass, coffeeTable, bed, cupboard);
		householdItmes.addAll(namesList);
		
		System.out.println("Total Cost for TV is: " + tv.accept(priceVisitor) + " ");
		System.out.println("Total Cost for Microwave Oven is: " + microwaveOven.accept(priceVisitor) + " Euros");
		System.out.println("Total Cost for TV is: " + tv.accept(priceVisitor) + " Euros");
		System.out.println("Total Cost for Wine glasses is: " + wineGlass.accept(priceVisitor) + " Euros");
		System.out.println("Total Cost for Glass Coffee Table is: " + coffeeTable.accept(priceVisitor) + " Euros");
		System.out.println("Total Cost for Bed is: " + bed.accept(priceVisitor) + " Euros");
		System.out.println("Total Cost for Bookshelf is: " + cupboard.accept(priceVisitor) + " Euros" + "\n");
		
		System.out.println("Microwave Oven:\n" + microwaveOven.accept1(packVisitor));
		System.out.println("TV:\n" + tv.accept1(packVisitor));
		System.out.println("Wine Glass: " + "\n" + wineGlass.accept1(packVisitor));
		System.out.println("Glass Coffee Table:\n" + coffeeTable.accept1(packVisitor));
		System.out.println("Bed:\n" + bed.accept1(packVisitor));
		System.out.println("Bookshelf:\n" + cupboard.accept1(packVisitor));
		


	}

}