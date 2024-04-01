import java.util.ArrayList;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 20) {
			System.out.println("The cart is full, please remove some disc in the cart to add more!");
			return ;
		}
		if(qtyOrdered >= 15 && qtyOrdered <20) {
			System.out.println("The cart is almost full, please take note!");
		}
		
		itemsOrdered.add(disc);
		qtyOrdered += 1;
		System.out.println("The disc has been added to the cart!");
	}
	
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		try {
			itemsOrdered.remove(disc);
			qtyOrdered -= 1;
			System.out.println("The disc is removed from the cart!");
		}
		catch (Exception e) {
			System.out.println("Disc has not been added to the cart yet!");
			return ;
		}
	}
	public float totalCost() {
		float sum = 0;
		for(int i= 0; i< itemsOrdered.size(); ++i) {
			sum += itemsOrdered.get(i).getCost();
		}
		return sum;
	}
}
