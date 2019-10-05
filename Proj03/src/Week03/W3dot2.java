package Week03;

import java.util.Scanner;

public class W3dot2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Tells the user what the program does.
        System.out.println("Given a year and a month in that year, this program will tell you\n" +
                "the number of days in that month.");
        //Prompts the user to enter a year.
        System.out.printf("Enter a year: ");
        //Gets the user's input and saves it.
        int year = in.nextInt();
        //Prompts the user to enter a value for the month(1 = Jan, 2 = Feb, etc).
        System.out.printf("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        //Gets the user's input and saves it. If the value is is not between 1 and 12 inclusive, tell the user and terminate the program.
        int month = in.nextInt();
        int number_Of_DaysInMonth = 0;
        String MonthOfName = "";

        if (month > 12 || month < 1) {
            System.out.format(month + " is invalid. Month values must be between between 1 and 12, inclusive.\n" +
                    "Goodbye.");
        }
        else{
            switch (month) {
                case 1:
                    MonthOfName = "January";
                    number_Of_DaysInMonth = 31;
                    break;
                case 2:
                    MonthOfName = "February";
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        number_Of_DaysInMonth = 29;
                    } else {
                        number_Of_DaysInMonth = 28;
                    }
                    break;
                case 3:
                    MonthOfName = "March";
                    number_Of_DaysInMonth = 31;
                    break;
                case 4:
                    MonthOfName = "April";
                    number_Of_DaysInMonth = 30;
                    break;
                case 5:
                    MonthOfName = "May";
                    number_Of_DaysInMonth = 31;
                    break;
                case 6:
                    MonthOfName = "June";
                    number_Of_DaysInMonth = 30;
                    break;
                case 7:
                    MonthOfName = "July";
                    number_Of_DaysInMonth = 31;
                    break;
                case 8:
                    MonthOfName = "August";
                    number_Of_DaysInMonth = 31;
                    break;
                case 9:
                    MonthOfName = "September";
                    number_Of_DaysInMonth = 30;
                    break;
                case 10:
                    MonthOfName = "October";
                    number_Of_DaysInMonth = 31;
                    break;
                case 11:
                    MonthOfName = "November";
                    number_Of_DaysInMonth = 30;
                    break;
                case 12:
                    MonthOfName = "December";
                    number_Of_DaysInMonth = 31;
                    break;
            }
            System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days.\nGoodbye.");
        }
    }
}

