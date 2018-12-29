import java.util.Scanner; // Import the Scanner class.

/**
 * The program below is a simple factorial algorithm. It asks the user for a number and then returns
 * the factorial of that result (i.e. if the user enters 3 then the output should be 3 * 2 * 1 = 6).
 * 
 * @author Sabir Kothiya
 */
public class FactorialApp {

	public static void main(String[] args) {
		// Create a Scanner object for keyboard input.
		Scanner scanner = new Scanner(System.in);
		
		int n = 0; // Declare a variable of type int and assign zero.
		long value; // Declare a variable of type long.
		
		// Print the string inside double quotation.
		System.out.println("Hello World!\n");
		
		// Prompt the user to type a number and process it.
		System.out.print("Please enter a number: ");
		n = scanner.nextInt(); // Read next token as an int.
		
		value = factorial(n); // Assign the result of the factorial to value.
		
		// Print the factorial result, including keyboard input from the user.
		System.out.println("\nFactorial " + n + " is " + value);
		
		scanner.close(); // Close the Scanner.
	}
	
	/**
	 * The method calculates the factorial by given number
	 * from the user and returns the answer of that factorial.
	 * @param n the int value from the user.
	 * @return the result of the factorial.
	 */
	public static long factorial(int n) {
		// Declare a variable of type long and assign one.
		long factorial = 1;
		
		/* Loop through each element.
		 * True if and only if the int value from the user is greater than zero.
		 */
		while (n > 0) {
			/* Multiply the right given value from the user with the left
			 * factorial value and assign the result to left variable (factorial).
			 */
			factorial *= n;
			n--; // Decrement the given value from the user by one.
		}
		return factorial; // Return the result of the factorial.
	}
}