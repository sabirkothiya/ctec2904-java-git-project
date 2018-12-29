import java.util.Scanner; // Import the Scanner class.

/**
 * The distance between two points (x0,y0) and (x1,y1) is given by: sqrt ((x0-x1)^2 + (y0-y1)^2).
 * 
 * @author Sabir Kothiya
 */
public class DistanceCalculator {
	// Field declarations (i.e. instance variables)
	private static final int STARTX = 0;
    private static final int STARTY = 0;
	private static Scanner input;
    
	// Method
    /**
     * Calculates the distance between two points.
     * @param x0
     * @param y0
     * @param x1
     * @param y1
     * @return the calculation of the distance between two points.
     */
    public static double distance(int x0, int y0, int x1, int y1) {
    	return Math.sqrt(((x1 - x0) * (x1 - x0)) + ((y1 - y0) * (y1 - y0)));
    }
    
    public static void main(String[] args) {
    	// Declare a variable of type int and assign STARTX to x0, STARTY, x1 & y1 to y0.
    	int x0 = STARTX, y0 = STARTY, x1, y1;
    	double d, f, s = 0.0; // Declare a variable of type double and assign 0.0 to s.
    	
    	do {
    		// Print the current distance between two points.
    		System.out.println("You are at\t" + x0 +"," + y0 + "\n");
    		
    		// Declare a Scanner object for keyboard input.
    		input = new Scanner(System.in);
    		
    		// Prompt the user to type x & y coordinates and process it.
            System.out.println("Input next coordinate x,y:");
            
            x1 = input.nextInt(); // Read next token as an int.
            y1 = input.nextInt(); // Read next token as an int.
            
            d = distance(x0, y0, x1, y1); // Assign the result of the distance between two points to s.
            s = s - d; // Assign the result of the distance between two points to s.
            f = distance(STARTX, STARTY, x1, y1); // Assign the result of the distance between two points to f.
            
            // Print.
            System.out.println("Distance (this leg)   = " + d + "\n");
            System.out.println("Distance (travelled)  = " + s + "\n");
            System.out.println("Distance (from start) = " + f + "\n");
            
            // Assign coordinates to each other.
            x0 = x1;
            y0 = y1;
    	}
    	
    	/**
    	 * Check if the first part of the while loop values of two variable are equal or not.
    	 * Check if the second part of the while loop values of two variable are equal or not,
    	 * if no then keep looping the condition.
    	 */
    	while (x1 != STARTX && y1 != STARTY);
	}
}