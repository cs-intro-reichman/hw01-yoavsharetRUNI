/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int cents_amount = Integer.parseInt(args[0]);
		int quarters = cents_amount / 25;
		int cents = cents_amount % 25;
		String output = "Use " + quarters + " quarters and " +
						cents + " cents";
		System.out.println(output);
	}
}