package Task03;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        try {
            System.out.print("Enter first number:> ");
            Scanner sc = new Scanner(System.in);
            int firstNumber = Integer.parseInt(sc.nextLine());

            CheckFirstNumberOutOfRange(firstNumber);

            System.out.print("Enter second number:> ");
            Scanner sc1 = new Scanner(System.in);
            int secondNumber = Integer.parseInt(sc.nextLine());

            CheckSecondNumberOutOfRange(secondNumber);

            CheckNumberSum(firstNumber, secondNumber);

            System.out.print("Enter third number:> ");
            Scanner sc2 = new Scanner(System.in);
            int thirdNumber = Integer.parseInt(sc.nextLine());

            CheckDivisionByZero(thirdNumber);

            System.out.println("\33[32mVerification passed successfully\33[0m");

        } catch (NumberOutOfRangeException ex) {
            System.out.println(ex.getMessage());

        } catch (NumberSumException ex) {
            System.out.println(ex.getMessage());

        } catch (DivisionByZeroException ex) {
            System.out.println(ex.getMessage());

        } catch (NumberFormatException ex) {
            System.out.println("\33[33mYou didn't enter a number\33[0m");
        }
    }

    public static void CheckFirstNumberOutOfRange(int number) throws NumberOutOfRangeException {
        if ( number > 100)  throw new NumberOutOfRangeException("First number out of range");
    }

    public static void CheckSecondNumberOutOfRange(int number) throws NumberOutOfRangeException {
        if (number < 0 )  throw new NumberOutOfRangeException("Second number out of range");
    }

    public static void CheckNumberSum(int num1, int num2) throws NumberSumException {
        if ((num1 + num2) < 10) throw new NumberSumException("The sum of the first and second numbers is too small");
    }

    public static void CheckDivisionByZero(int number) throws DivisionByZeroException {
        if (number == 0) throw new DivisionByZeroException("Division by zero is not allowed");
    }
}

