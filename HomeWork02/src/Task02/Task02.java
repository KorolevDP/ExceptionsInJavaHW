package Task02;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        try {
            System.out.print("Enter first number:> ");
            Scanner sc = new Scanner(System.in);
            int firstNumber = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number:> ");
            Scanner sc1 = new Scanner(System.in);
            int secondNumber = Integer.parseInt(sc.nextLine());

            int result = (int) divideNumbers(firstNumber,secondNumber);
            System.out.println("Result = " + result);

        } catch (DivisionByZeroException ex) {
            System.out.println("Caught CustomException: " + ex.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("\33[33mYou didn't enter a number\33[0m");
        }
    }

    public static double divideNumbers(int dividend, int divisior) throws DivisionByZeroException {
        if(divisior == 0) {
            throw new DivisionByZeroException("\33[31mDivision by zero is not allowed\33[0m");
        }
        return dividend / divisior;
    }

}
