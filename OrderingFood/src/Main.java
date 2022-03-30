import javax.swing.JOptionPane;

public class Main {

	//food
	
	public static int food, drink, snack;
	static int total;
	static String name;
	static int price;
	static int number;
	
	public static void main(String[] args) {

		//food cost
		int hot_dog=1200;
		int burger = 8000;
		int sandwich = 22000;
		
		//drink
		int coca_cola = 11000;
		int pepsi = 7500;
		int fanta = 9000;
		
		//snack
		int chips = 4000;
		int chocolate = 12000;
		int fruits = 16000;
		
		name =JOptionPane.showInputDialog("Hello! Welcome :), Enter your name:");
		number = Integer.valueOf(JOptionPane.showInputDialog("Enter your phone number, please: "));
		food = Integer.valueOf(JOptionPane.showInputDialog("Choose an item below: "
				+ "\n 1. Hot-dog"
				+ "\n 2. Burger"
				+ "\n 3. Lavash"
				+ "\n 0. Nothing"));
		drink = Integer.valueOf(JOptionPane.showInputDialog("Choose an item below: "
				+ "\n 1. Coca-cola"
				+ "\n 2. pepsi"
				+ "\n 3. Fanta"
				+ "\n 0. Nothing"));
		snack = Integer.valueOf(JOptionPane.showInputDialog("Choose an item below: "
				+ "\n 1. Chips"
				+ "\n 2. chocolate"
				+ "\n 3. fruits"
				+ "\n 0. Nothing"));
		
		
		switch (food) {
		case 0:
			total+=0;
			break;
		case 1:
			total+=hot_dog;
			break;
		case 2:
			total+=burger;
			break;
		case 3:
			total+=sandwich;
			break;

		}
		
		switch (drink) {
		case 0:
			total+=0;
			break;
		case 1:
			total+=coca_cola;
			break;
		case 2:
			total+=pepsi;
			break;
		case 3:
			total+=fanta;
			break;
			
		}
		
		switch (snack) {
		case 0:
			total+=0;
			break;
		case 1:
			total+=chips;
			break;
		case 2:
			total+=chocolate;
			break;
		case 3:
			total+=fruits;
			break;
			
		}
		
		JOptionPane.showMessageDialog(null, "your name: " + name +
				"\n your number: " + number+
				"\n your total cost: " + total);
		

		
	}
}
