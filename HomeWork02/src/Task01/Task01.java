package Task01;

import java.util.Scanner;

public class Task01 {
    public static void invalidNumber(int number) {

        if (number < 0 || number == 0) {
            throw new InvalidNumberException("\33[31mInvalid number! \33[0m");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number:> ");
        Scanner sc = new Scanner(System.in);

        int number = 0;

        try {
            number = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(number + "\n\33[33mYou didn't enter a number\33[0m");
        }

        try {
            invalidNumber(number);
            System.out.println("Number is correct");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
