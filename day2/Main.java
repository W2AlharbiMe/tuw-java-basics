import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.

	System.out.println("Enter first number:");
        int n1 = input.nextInt();

        System.out.println("Enter second number:");
        int n2 = input.nextInt();

        int sum = n1 + n2;
        int multiply = n1 * n2;
        int subtract = n1 - n2;
        double divide = n1 / n2;
        double reminder = n1 % n2;

        String output = "Numbers You Entered: " + n1 + ", and " + n2;
        output += "\nSum: " + sum;
        output += "\nMultiply: " + multiply;
        output += "\nSubtract: " + subtract;
        output += "\nDivide: " + divide;
        output += "\nReminder: " + reminder;

        System.out.println(output);

    }

}
