package Week03;

import java.util.Scanner;

public class W3dot1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Tells the user what the program does.
        System.out.println("Given today's day of the week and some number of days in the future\n" +
                "this program will tell you the day of the week for the future day.");
        //Prompts the user to enter a value for today's day of the week (0 for Sunday, 1, for Monday, etc. ).
        System.out.printf("Enter today's day of the week (0 for Sunday, 1 for Monday, etc): ");
        //Gets the user's input and saves it. If the value is less than 0 or greater than 6, tell the user the input is invalid, and terminate the program.
        int day = in.nextInt();
        String day_of_week = "";

        if ( day < 0 || day > 6){
            System.out.format(day + " is invalid. \nGoodbye.");

        }
        else {
            System.out.print("Enter the number of days in the future: ");
            int elapsed = in.nextInt();
            int future_day = (day + elapsed) % 7;
            switch (day) {
                case 0:
                    day_of_week = "Sunday";
                    break;
                case 1:
                    day_of_week = "Monday";
                    break;
                case 2:
                    day_of_week = "Tuesday";
                    break;
                case 3:
                    day_of_week = "Wednesday";
                    break;
                case 4:
                    day_of_week = "Thursday";
                    break;
                case 5:
                    day_of_week = "Friday";
                    break;
                case 6:
                    day_of_week = "Saturday";
                    break;
            }
            if (future_day == 0) {
                System.out.printf("Today is %s and the future day is Sunday", day_of_week);
            } else if (future_day == 1) {
                System.out.printf("Today is %s and the future day is Monday", day_of_week);
            } else if (future_day == 2) {
                System.out.printf("Today is %s and the future day is Tuesday", day_of_week);
            } else if (future_day == 3) {
                System.out.printf("Today is %s and the future day is Wednesday", day_of_week);
            } else if (future_day == 4) {
                System.out.printf("Today is %s and the future day is Thursday", day_of_week);
            } else if (future_day == 5) {
                System.out.printf("Today is %s and the future day is Friday", day_of_week);
            } else if (future_day == 6) {
                System.out.printf("Today is %s and the future day is Saturday", day_of_week);
            } else {
                System.out.format(elapsed + " is invalid. You must enter a positive number.");
            }
            System.out.println("\nGoodbye.");
        }
    }
    }