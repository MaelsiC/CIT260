package Week03;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        final int MINOR = 21;

        System.out.println("How old are you?");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();

        if(age < MINOR) {
            System.out.println("Youth is a wonderful thing... enjoy it.");
        }
        else {
            System.out.println("Old age is a state of mind.");
        }
        System.out.println("Goodbye!");
    }
}
