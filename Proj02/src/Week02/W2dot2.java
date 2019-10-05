package Week02;

import java.util.Scanner;

public class W2dot2 {
    public static void main(String[] args) {
        // Step 1: Reads in the users input on value of the cost of the meal and a percentage value for the tip
        // Step 2: Computes the value of the tip using the percentage given by the user, calculates the total value of the bill, and calculates the tax on the meal based on tax rate of 3.2%
        // Step 3: Displays the tip, the tax, and the total value of the bill followed by a goodbye message

        // Create an object of Scanner type
        Scanner in = new Scanner(System.in);

        // Tell the user what the program does
        System.out.print("Given the price of a meal and a percentage to use for the tip, \n" +
                "this program calculates the tip, the tax, and the total amount of the bill. \n");

        //  Prompt the user to enter a value for the cost of their meal
        System.out.print("Enter the cost of the meal: ");

        // Get the user's input and saves it in a variable declared as a double
        double meal = in.nextDouble();

        // Prompt the user to enter a percentage value for the tip
        System.out.print("Enter the tip percentage: ");

        // Get the user's input and saves it in a variable declared as a double
        double percentage = in.nextDouble();

        //  Calculate the value of the tip, using the percentage entered by the user
        double tip = percentage/100 * meal;

        // Calculate the tax on the meal. The tax rate is 3.2%
        double tax = 3.2/100 * meal;

        // Calculate the total bill = meal cost + tip + tax
        double total = meal + tip + tax;

        // Output the tip, the tax, and the total value of the bill
        System.out.format("\nThe tip is $%.2f%n",tip);
        System.out.format("The tax is $%.2f%n",tax);
        System.out.format("The total of bill is $%.2f%n",total);

        // Output a goodbye message
        System.out.println("Goodbye.");
    }
}
