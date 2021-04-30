/*
* This is a program that calculates the thickness
* of a 1 board foot wood.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-04-29
*/

import java.util.Scanner;


final class BoardFoot {
    private BoardFoot() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }


    public static float boardFoot(final float width, final float length) {
        // This function calculates height
        final int oneBoardFoot = 144;
        float height;

        // calculate
        height = oneBoardFoot / (width * length);
        // output
        return height;
    }


    public static void main(final String[] args) {
        final float width;
        final float length;
        float height;

        System.out.println("This program figures out the height of a "
                           + "wood(1 board foot or 144 inches³) when "
                           + "given the width and length.");

        // input
        Scanner dimensions = new Scanner(System.in);

        System.out.println("Enter the width(inch): ");
        String widthString = dimensions.nextLine();
        System.out.println("Enter the length(inch): ");
        String lengthString = dimensions.nextLine();

        try {
            width = Float.parseFloat(widthString);
            length = Float.parseFloat(lengthString);

            if (width > 0 && length > 0) {
                // pass & accept parameters
                height = boardFoot(width, length);
                // output
                System.out.println("\nThe wood should be " + height
                                   + " inch(es) thick");
            } else {
                System.out.println("Please enter a positive integer");
            }
        } catch (Exception ex) {
            System.err.print("This is not an integer");
        }
    }
}
