package Week02;

import java.util.Scanner;

public class W2dot1 {
    public static void main(String[] args) {
        // Step 1: Reads in degrees in Celsius from the user
        // Step 2: Computes degrees Celsius into degrees Fahrenheit
        // Step 3: Displays degrees Celsius given by the user and degrees Fahrenheit calculated within the program

        // Create an object of Scanner type
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a temperature in degrees Celsius
        System.out.print("This program converts a temperature in degrees Celsius into \n" +
                "a temperature in degrees Fahrenheit. Enter a temperature in\n" +
                "degrees Celsius: ");

        // Get the user's input and saves it in a variable declared as a double
        double tempC = input.nextDouble();

        //  Convert the Celsius temperature to a temperature in degrees Fahrenheit
        double tempF = (9.0 / 5.0) * tempC + 32;

        // Output the Celsius temperature and the Fahrenheit temperature, with 2 digits after the decimal point
        System.out.format("%.2f",tempC);
        System.out.format(" degree Celsius is equal to ");
        System.out.format("%.2f",tempF);
        System.out.format(" degrees Fahrenheit. %n");

        // Output a goodbye message
        System.out.println("Goodbye.");
    }
}
