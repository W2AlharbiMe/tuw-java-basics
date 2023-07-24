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




//        2.Write a Java program to convert a given string into lowercase.
        System.out.println("Enter a sentence in UPPER CASE.");
        String sentence = input.nextLine();
        System.out.println(sentence.toLowerCase());

//        3.Write a Java program that takes a string and a number from the user,then prints the character in the given index.

        System.out.println("Enter any value: ");
        String value1 = input.nextLine();

        System.out.println("Enter char index:");
        int index = input.nextInt();

        System.out.println("Value You Entered: " + value1 + "\nIndex: " + index + "\nChar: " + value1.charAt(index));

//        4.Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. (use if-statement)

        System.out.println("Enter a number:");
        int number = input.nextInt();
//        I used ternary operator here because I think it's redundant to use if else for this check
        int response = (number % 2 == 0) ? 1 : 0;
        System.out.println(response);



//        5.Write a program that checks the role of the user

        System.out.println("Enter your role:");

        String role = input.nextLine().trim();

        if(role.equalsIgnoreCase("admin")) {
            System.out.println("Welcome Admin.");
        } else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("Welcome Superuser.");
        } else if (role.equalsIgnoreCase("user")) {
            System.out.println("Welcome User.");
        } else {
            System.out.println("Invalid Role.");
        }

        // 6.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

        System.out.println("Enter number one:");
        int number1 = input.nextInt();

        System.out.println("Enter number two:");
        int number2 = input.nextInt();

        System.out.println("Enter number three:");
        int number3 = input.nextInt();


        if ((number1 + number2) == number3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//        7.Take three numbers from the user and print the greatest number.

        System.out.println("Enter number one:");
        int number1 = input.nextInt();

        System.out.println("Enter number two:");
        int number2 = input.nextInt();

        System.out.println("Enter number three:");
        int number3 = input.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println(number3);
        }


//        8.Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

        System.out.println("enter a number between 1 and 7 to print week day.");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("you entered invalid number, please provide a number between 1 and 7.");
                break;
        }

    }
}
