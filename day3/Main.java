import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        // 1.Write a program that prints the numbers from 1 to 100 such that:

        System.out.println("Enter the range (how many numbers you want to check) for fizzBuzz: ");
        int range = s.nextInt();
        
        for (int i = 0; i <= range; i++) {
            
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


        //  2.Write a Java program to reverse a string.

        System.out.println("Enter any Word:");
        String word = s.nextLine();
        String output = "";

        for (int i = word.length(); i > 0; i--) {
            output += word.charAt(i - 1);
        }

        System.out.println(output);

        // 3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

        do {
            System.out.println("enter a positive number to show multiplication table for it:");
            int number = s.nextInt();

            if(number <= 0) {
                System.out.println("please enter a positive number (it should be greater than 0 because any number multiplied by 0 is 0).");
                continue;
            }


            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + number + " = " + (i * number));
            }

            break;
        } while(true);


        // 4.Write a program to find the factorial value of any number entered through the keyboard.

        System.out.println("Enter a number to get it's factorial: ");
        int n = s.nextInt();

        int total = 1;
        String output = "The Numbers for factorial "+ n + "! are:";

        for (int i = n; i > 0; i--) {
            output += "\n" + i;

            total *= i;
        }

        if(total == 0) {
            output = "The Factorial for number ("+n+") Exceeded Memory!!!";
        } else {
            output += "\nTotal: " + total; // if value is 0 then you exceeded int limit size.
        }


        System.out.println(output);


        // 5.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)


        // global scope
        int total = 1, number1 = 0, number2 = 0;

        do {
            // inner scope 1 used to validate input 1 only
            System.out.println("Enter number 1: ");
            number1 = s.nextInt();

            // make sure both numbers are not zeros
            if (number1 <= 0) {
                System.out.println("Please enter a positive number that's greater than 0.");
                continue;
            }

            do {
                // inner scope 2 used to validate number 2 after entering number 1 
                System.out.println("Enter a number to raise ("+ number1 +") to: ");
                number2 = s.nextInt();

                // make sure both numbers are not zeros
                if (number2 <= 0) {
                    System.out.println("Please enter a positive number that's greater than 0.");
                    continue; // this will start from the 2nd inner loop, exactly from "Enter number 2:"
                }


                for (int i = 1; i <= number2; i++) {
                    total *= number1; // 5 ** 3, 1 * 5 -> 5, 5 * 5 -> 25, 25 * 5 -> 125
                }

                break;
            } while(true);

            break;
        } while(true);

        System.out.println("The numbers you entered are: " + number1 + " ** " + number2 + " = " + total);


        // 6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        int sum_even = 0;
        int sum_odd = 0;
        String numbers = "Numbers you entered:\n":

        do {

            System.out.println("Enter any number or enter 0 to quit:");
            int number = s.nextInt();

            if(number == 0) {
                break;
            }

            if(number % 2 == 0) {
                sum_even += number;
            }

            if (number % 2 == 1) {
                sum_odd += number;
            }

            numbers += number + ", ";

        } while(true);

        System.out.println("Total Sum of Even Numbers: " + sum_even + "\nAnd Total Sum of Odd Numbers: " + sum_odd + "\n" + numbers);

        // 7.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.

        do {

            System.out.println("Enter a number to check if it's a prime number: ");

            int n = s.nextInt();

            if (n < 0) {
                System.out.println("please enter a positive number.");
                continue;
            }

            // optimization tick
            if (n == 0 || n == 1) {
                System.out.println("The number " + n + " is not a prime.");
                break;
            }

            // assume n is prime
            boolean n_prime = true;

            // linear approach -> O(n)
            // when n == 2 the operation will be constant time -> O(1).
            // because 2 / 2 = 1. 2 is greater than 1.
            for (int i = 2; i <= n / 2; i++) {
                if(n % i == 0) {
                    System.out.println("The number " + n + " is not a prime.");
                    n_prime = false;
                    break; // stop inner loop (optimization tick). got the result now. end the loop don't continue.
                }
            }

            // another approach for writing this condition would be: (n / n == 1).
            if(n % n == 0 && n_prime) {
                System.out.println("The number " + n + " is a prime.");
            }


            break;
        } while(true);


        // 8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.


        int positive_count = 0;
        int negative_count = 0;
        int zeros_count = 0;

        String positive_numbers = "\nPositive Numbers You Entered:\n";
        String negative_numbers = "\nNegative Numbers You Entered:\n";
        String zeros_numbers = "\nZeros Numbers You Entered:\n";

        do {
            System.out.println("Enter any number or enter (q) to quit:");

            String input = s.nextLine();

            if(input.equalsIgnoreCase("q")) {
                break;
            }


            int number = 0;

            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("you entered an invalid input try again. enter any number or q to quit.");
                continue;
            }


            if(number > 0) {
                positive_count += 1;
                positive_numbers += number + ", ";
            }

            if(number < 0) {
                negative_count += 1;
                negative_numbers += number + ", ";
            }

            if (number == 0) {
                zeros_count += 1;
                zeros_numbers += number + ", ";
            }



        } while(true);

        String output = "Positive Numbers Count: " + positive_count;
        output += "\nNegative Numbers Count: " + negative_count;
        output += "\nZeros Number Count: " + zeros_count + "\n";

        output += positive_numbers + negative_numbers + zeros_numbers;

        System.out.println(output);

        // 9.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.

        for (int i = 1; i <= 4; i++) {
            System.out.println("Week " + i);
            for (int j = 1; j <= 7; j++) {
                System.out.println("Day" + j);
            }
        }


        // 10.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.

        System.out.println("Enter a word to check if it's a palindrome or not:");
        String word = s.nextLine();

        String reversed = "";

        for (int i = word.length(); i > 0; i--) {
            reversed += word.charAt(i - 1);
        }

        if (word.equals(reversed)) {
            System.out.println("The word "+ word +" is palindrome. you can read it from left to right and from right to left.");
        } else {
            System.out.println("The word " + word + " is not palindrome.");
        }
        
        
    }
}
