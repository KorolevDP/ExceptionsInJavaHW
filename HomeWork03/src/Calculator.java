import java.util.Scanner;

public class Calculator {

    public  double divide(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) throw new ArithmeticException("Division by zero!");
        return num1 / num2;
    }

    public  double multiply(double num1, double num2) {
        if (num1 > Double.MAX_VALUE / num2) throw new ArithmeticException("Multiplication to overflow");
        return num1 * num2;
    }

    public  double subtract(double num1, double num2) {
        if (num1 < num2) throw new ArithmeticException("It is impossible to subtract from a smaller number!");
        else {
            return num1 - num2;
        }
    }

    // при формате данных double, если число больше 9_999_999.0, то в его запись добавляются буквы,
    // такие числа сложно интуитивно воспринимать.

    public  double addition(double num1, double num2) {
        if (num1 + num2 > 9_999_999.0) throw new ArithmeticException("Unreadable number!");
        else {
            return num1 + num2;
        }
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        try {
            System.out.print("Enter first number:> ");
            Scanner sc = new Scanner(System.in);
            double firstNumber = Double.parseDouble(sc.nextLine());

            System.out.print("Enter second number:> ");
            Scanner sc1 = new Scanner(System.in);
            double secondNumber = Double.parseDouble(sc.nextLine());

            System.out.println(firstNumber + " / " + secondNumber + " = " + calc.divide(firstNumber, secondNumber));

            System.out.println(firstNumber + " * " + secondNumber + " = " + calc.multiply(firstNumber, secondNumber));

            System.out.println(firstNumber + " - " + secondNumber + " = " + calc.subtract(firstNumber, secondNumber));

            System.out.println(firstNumber + " + " + secondNumber + " = " +calc.addition(firstNumber, secondNumber));

            System.out.println("\33[32mAll operations completed\33[0m");

        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());

            // обрабатываем исключение, если введено НЕ число.
        } catch (NumberFormatException ex) {
            System.out.println("\33[33mYou didn't enter a number\33[0m");
        }
    }

}
