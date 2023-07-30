import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Calculator {

    // a huge HashMap will be created from main
    // it will store the things like: HashMap<Integer, double[]> resultState
    // 0: [1, 2, 3, 1] -> [N1, N2, R, T]
    // 1: [2, 2, 4, 1] -> [N1, N2, R, T]

    public static double[] handleCalculatorChoices(int choice, double n1, double n2) {
        double[] result = {1, 0};

        try {
            switch(choice) {
                case 1:
                    result[1] = addition(n1, n2);
                    break;

                case 2:
                    result[1] = subtract(n1, n2);
                    break;

                case 3:
                    result[1] = multiplication(n1, n2);
                    break;

                case 4:
                    // I have converted the entered numbers by the user
                    // from double to integer to trigger the exception devide by zero
                    result[1] = division((int) n1, (int) n2);


                    break;

                case 5:
                    result[1] = modulus(n1, n2);

                    break;

                case 6:
                    result[1] = findMinimum(n1, n2);
                    break;

                case 7:
                    result[1] = findMaximum(n1, n2);
                    break;

                case 8:
                    result[1] = findAverage(n1, n2);
                    break;

            }

            result[0] = 0;

        } catch(ArithmeticException e1) {
            System.out.println("You can't divide anything with zero.");
        } catch(Exception e2) {
            System.out.println("Oops.. Something went wrong try again.");
        }

        return result;
    }

    public static double createInputLoop(String message, Scanner s) {
        do {
            double[] n1 = Calculator.createInput(message, s);
            s.nextLine();

            double response = n1[0];

            if(response == 1) {
                continue;
            } else {
                return n1[1];
            }

        } while (true);
    }

    public static double[] createInput(String message, Scanner s) throws InputMismatchException {
        double[] response = {1, 0};

        try {
            System.out.println(message);
            double number = s.nextDouble();

            response[0] = 0;
            response[1] = number;

            return response;
        } catch (InputMismatchException e1) {
            System.out.println("You must enter a valid number.");
        } catch(Exception e2) {
            System.out.println("Oops.. Something went wrong try again.");
        }

        return response;
    }

    public static double addition(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtract(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplication(double n1, double n2) {
        return n1 * n2;
    }

    // for some reason a 1.0 / 0.0 = NaN
    public static double division(int n1, int n2) {
        return n1 / n2;
    }

    public static double modulus(double n1, double n2) {
        return n1 % n2;
    }

    public static double findMinimum(double n1, double n2) {
        return n1 < n2 ? n1 : n2;
    }

    public static double findMaximum(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static double findAverage(double n1, double n2) {
        return Calculator.addition(n1, n2) / 2;
    }






}



