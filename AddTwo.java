/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		int first_number = Integer.parseInt(args[0]);
		int second_number = Integer.parseInt(args[1]);
		int sum = first_number + second_number;

		String out = first_number + " + " + second_number + 
					" = " + sum;
					
		System.out.println(out);
	}
}
