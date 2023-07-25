
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

            if(i == 0) {
                break;
            }
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
        
    }
}