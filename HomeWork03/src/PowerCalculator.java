import java.util.Scanner;

public class PowerCalculator {

    public double calculatePower(double base, double degree) throws InvalidInputException {
        if (base == 0){
            throw new InvalidInputException("Incorrect value of base");
        }
        if ( degree < 0){
            throw new InvalidInputException("Incorrect value of degree");
        }
        return Math.pow(base, degree);
    }

    public static void main(String[] args) {

        PowerCalculator calcP = new PowerCalculator();

        try {
            System.out.print("Enter first number:> ");
            Scanner sc = new Scanner(System.in);
            double firstNumber = Double.parseDouble(sc.nextLine());

            System.out.print("Enter second number:> ");
            Scanner sc1 = new Scanner(System.in);
            double secondNumber = Double.parseDouble(sc.nextLine());

            System.out.println(firstNumber + " in power " + secondNumber + " = " + calcP.calculatePower(firstNumber, secondNumber));

        } catch (InvalidInputException ex) {
            System.out.println(ex.getMessage());

        } catch (NumberFormatException ex) {
            System.out.println("\33[33mYou didn't enter a number\33[0m");
        }
    }
}