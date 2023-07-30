import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Calculator {

    // a huge HashMap will be created from main
    // it will store the things like: HashMap<Integer, double[]> resultState
    // 0: [1, 2, 3, 1] -> [N1, N2, R, T]
    // 1: [2, 2, 4, 1] -> [N1, N2, R, T]

    public static double handleCalculatorChoices(int choice, double n1, double n2) {
        double result = 0;

        switch(choice) {
            case 1:
                result = addition(n1, n2);
                break;

            case 2:
                result = subtract(n1, n2);
                break;

            case 3:
                result = multiplication(n1, n2);
                break;

            case 4:
                result = modulus(n1, n2);
                break;

            case 5:
                result = division(n1, n2);
                break;

            case 6:
                result = findMinimum(n1, n2);
                break;

            case 7:
                result = findMaximum(n1, n2);
                break;

            case 8:
                result = findAverage(n1, n2);
                break;

        }

        return result;
    }

    public static double createInput(String message, Scanner s) {
        System.out.println(message);
        double number = s.nextDouble();

        return number;
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

    public static double division(double n1, double n2) {
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



