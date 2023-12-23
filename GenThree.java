/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int min_limit = Integer.parseInt(args[0]); 
		int max_limit = Integer.parseInt(args[1]);
		
		// generate rand values in the given range (max not inclusive) 
		int rand_1 = (int)(Math.random()*(max_limit - min_limit)) + min_limit;
		int rand_2 = (int)(Math.random()*(max_limit - min_limit)) + min_limit;
		int rand_3 = (int)(Math.random()*(max_limit - min_limit)) + min_limit;
		// finding minimum generated value
		int min_rand = Math.min(rand_1, Math.min(rand_2, rand_3));

		//output
		System.out.println(rand_1);
		System.out.println(rand_2);
		System.out.println(rand_3);
		System.out.println("The minimal generated number was " + min_rand);
	}
}
