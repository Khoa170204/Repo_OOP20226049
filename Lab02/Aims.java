
public class Aims {

	public static void main(String[] args) {
		// Creat the cart
		Cart anOrder = new Cart();
		//Add disc to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		// Display the information
		System.out.print("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		//Removing disc from the cart
		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.print("Total Cost is: ");
		System.out.println(anOrder.totalCost());
	}

}
