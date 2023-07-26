import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2

        int[] numbers = {60, 89, 55, 26, 55, 11, 44, 11, 33, 100, 400, 60};

        if(numbers.length < 2) {
            System.out.println("The array must have at least 2 elements.");
        }

        // the easy approach haha
        // System.out.println(numbers[0] == numbers[numbers.length - 1]);

        // but to practice:
        int n = numbers.length;
        int firstElement = numbers[0];

        for (int i = 0; i < n; i++) {
            if(i == (n - 1)) {
                System.out.println(firstElement == numbers[i]);
            }
        }


        // 2.Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.


        int _k;
        int[] numbers = {1, 4, 17, 7, 25, 3, 100};

        do {
            System.out.println("How many large numbers you want to find (k): ");
            _k = s.nextInt();

            if(_k <= 0) {
                System.out.println("You can't enter a 0 or a negative number.");
                continue;
            }

            if(_k > numbers.length) {
                System.out.println("You can only enter a number from 1 to 7.");
                continue;
            }

            break;
        } while(true);




//        another sample data.
//        int[] numbers = {1, 4, 14, 18, 22, 33, 17, 200, 7, 25, 3, 100};


        System.out.println("Before sort: " + Arrays.toString(numbers));

//        I know this is a bad way of doing sorting. bubble sort -> O(n^3).
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length; j++) {
                for (int k = i; k < j; k++) {
                    if(numbers[i] >= numbers[j]) {
                        int tmp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = tmp;
                    }
                }
            }
        }

        System.out.println("After sort: " + Arrays.toString(numbers));


        int[] largest_numbers = new int[_k];
        int counter = 0;
        int stop_at = (_k - 1); // optimization tick.

        for (int i = (numbers.length - 1); i >= 0; i--) {
            largest_numbers[counter] = numbers[i];

            if(counter == stop_at) {
                break;
            }

            counter++;
        }

        String output = _k + " largest elements of the said array are: ";
        for(int ln : largest_numbers) {
            output += ln + " ";
        }

        System.out.println(output);

    }
}
