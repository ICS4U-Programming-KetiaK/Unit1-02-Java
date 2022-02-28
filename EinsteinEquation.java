import java.util.Scanner;

/**
* This program asks the user to enter the mass of an object
* and then tells the user the energy that the object can release.
*
* @throws IllegalStateException when error occurs
*
*/
final class EinsteinEquation {
    /**
    * Declaring constants.
    */
    private static final double SPEED_LIGHT = 2.998 * Math.pow(10, 8);

    /**
     * Display result to the console.
     *
     * @param args nothing passed in
     */
    public static void main(String[]args) {
        // create scanner
        final Scanner sc = new Scanner(System.in);
        // get user input
        System.out.print("Enter the mass of an object (kg): ");
        // read user input
        final String massString = sc.nextLine();
        try {
            // convert user input from string to a double
            final double massDouble = Double.parseDouble(massString);
            // checks if the value is negative
            if (massDouble >= 0) {
                // calculate the energy
                final double energy = massDouble * (Math.pow(SPEED_LIGHT, 2));
                // Display the result to the user
                System.out.println("The energy that the object can release is "
                                   + energy);
            } else {
                // Catch negative inputs
                System.out.println("The mass of object must be greater than 0");
            }
        } catch (IllegalArgumentException exception) {
            // catch invalid inputs
            System.out.println("Please enter a number.");
        }
    }
}
