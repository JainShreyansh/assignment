package test;

import java.io.IOException;

public class InventoryMain {
	public static void main(String[] args) throws IOException {
		Inventory inv = new Inventory("Mango", 5, 10);
		Inventory.add(inv);
		Inventory inv1 = new Inventory("Banana", 7, 15);
		Inventory.add(inv1);
		Inventory inv2 = new Inventory("Mango", 5, 13);
		Inventory.add(inv2);
		Inventory inv3 = new Inventory("Banana", 9, 16);
		Inventory.add(inv3);
		
		System.out.println("Mango in inventory: "+Inventory.get("Mango"));
		
		System.out.println("Mango of Price 10 in inventory: "+Inventory.get("Mango", 10));
		
		Inventory.remove("Banana");
		
		Inventory.remove("Mango", 13);
	}
}
