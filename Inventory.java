package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Inventory implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	Inventory() {
	}

	Inventory(String i, int q, double p) {
		item = i;
		qty = q;
		price = p;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private String item;
	private int qty;
	private double price;

	public void print() {
		System.out.println("Item : " + item);
		System.out.println("Qty : " + qty);
		System.out.println("Price : " + price);
	}

	public static int get(String item) throws IOException {
		List<Inventory> list = readInventory();
		int qty=0;
		if (list!=null) {
			for (Inventory inv : list) {
				if (inv.getItem().equals(item))
					qty+=inv.getQty();
			}
			return qty;
		}
		return -1;
	}
	
	public static int get(String item, double price) throws IOException {
		List<Inventory> list = readInventory();
		int qty=0;
		if (!list.isEmpty()) {
			for (Inventory inv : list) {
				if (inv.getItem().equals(item) && (inv.getPrice() == price))
					qty+=inv.getQty();
			}
			return qty;
		}
		return -1;
	}

	public static void add(Inventory in) {
		writeInventory(in);
	}

	private static List<Inventory> readInventory() throws IOException {
		List<Inventory> invList = new ArrayList<Inventory>();
		try {
			FileInputStream fi = new FileInputStream(new File("C:\\workspace\\test\\src\\\\test\\InventoryFile.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			Inventory inv;
			while (oi.available()>0) {
				inv = (Inventory) oi.readObject();
				invList.add(inv);
				System.out.println(inv.toString());
			}

			oi.close();
			fi.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static void writeInventory(Inventory i) {
		try {
			FileOutputStream f = new FileOutputStream(new File("C:\\workspace\\test\\src\\test\\InventoryFile.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(i);

			o.close();
			f.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void remove(String i) throws IOException {
		List<Inventory> list = readInventory();
		if (!list.isEmpty()) {
			for (Inventory inv : list) {
				if (inv.getItem().equals(i))
					list.remove(inv);
			}
			updateInventoryAfterDelete(list);
		} else {
			System.out.println("Inventory is empty!!!");
		}
	}

	public static void remove(String item, double price) throws IOException {
		List<Inventory> list = readInventory();
		if (!list.isEmpty()) {
			for (Inventory inv : list) {
				if (inv.getItem().equals(item) && (inv.getPrice() == price))
					list.remove(inv);
			}
			updateInventoryAfterDelete(list);
		} else {
			System.out.println("Inventory is empty!!!");
		}
	}

	private static void updateInventoryAfterDelete(List<Inventory> list) {
		try {
			FileOutputStream fos = new FileOutputStream(new File("C:\\workspace\\test\\src\\\\test\\tempInventory.txt"));
			ObjectOutputStream o = new ObjectOutputStream(fos);

			for (Inventory i : list) {
				o.writeObject(i);
			}

			o.close();
			fos.close();

			File source = new File("C:\\workspace\\test\\src\\\\test\\InventoryFile.txt");
			File target = new File("C:\\workspace\\test\\src\\\\test\\tempInventory.txt");

			source.delete();
			target.renameTo(source);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public String toString() {
		return new StringBuffer(" Item Name : ").append(this.item)
				.append(", Qty : ").append(this.qty).append(", Price : ").append(this.price).toString();
	}
}
