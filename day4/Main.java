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
            // make sure i is equal to the last index (numbers.length - 1).
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


        // 3.Write a Java program to find the numbers greater than the average of the numbers of a given array.

        int[] numbers = {1, 4, 17, 7, 25, 3, 100};
//        another sample data
//        int[] numbers = {1, 4, 14, 18, 22, 39, 17, 200, 7, 25, 3, 100};

        int sum = 0;
        double avg = 0.0f;

        for (int n : numbers) {
            sum += n;
        }

        avg = sum / numbers.length;

        String output = "The average of the said array is: " + avg + " The numbers in the said array that are greater than the average are: ";

        for (int n : numbers) {
            if(n >= avg) {
                output += n + " ";
            }
        }

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println(output);



        //  4.Write a Java program to get the larger value between first and last element of an array of integers.

        int[] numbers = {50, 2, 1, 1, 1, 1, 30, 40};

//        the easy approach haha
//        int n = numbers.length - 1;
//        System.out.println("Larger value between first and last element: " + ((numbers[0] > numbers[n]) ? numbers[0] : numbers[n]));

//        but to practice:

        int n = numbers.length;
        int firstElement = numbers[0];
        String output = "Larger value between first and last element: ";

        for (int i = 0; i < n; i++) {
            // make sure i is equal to the last index (numbers.length - 1).
            if(i == (n - 1)) {
                if(firstElement > numbers[i]) {
                    System.out.println(output + firstElement);
                } else {
                    System.out.println(output + numbers[i]);
                }
            }
        }


        // 5.Write a Java program to swap the first and last elements of an array and create a new array.

        int[] numbers = {20, 30, 40};
        int[] swapped = new int[numbers.length];
        int firstElement = numbers[0];
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            if(i == (n - 1)) {
                swapped[i] = firstElement;
                swapped[0] = numbers[i];
            } else {
                swapped[i] = numbers[i];
            }
        }

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(swapped));


        // 6.Write a Java program to find all of the longest word in a given dictionary.

        // one way to solve this in optimized manner would be to create array of tuples:
        // [ [0, 3], [1, 3], [2, 3] ] -> [ [INDEX, LENGTH] ]
        // 1. create array list with tuples.
        // 2. sort by length in descending.
        // 3. only add the longest lengths to the new array list (longest_words).
        // 4. print

        // words must be unique.
        String[] words = {"cccc", "a", "cat", "vvvv", "dog", "red", "is", "am", "dddd", "app", ""};

        ArrayList<String> longest_words = new ArrayList<String>();

        ArrayList<int[]> dict = new ArrayList<int[]>();


        // 1. fill the array list with each word index and length.
        for (int i = 0; i < words.length; i++) {
            String current_word = words[i];
            int[] tuple = {i, current_word.length()};

            dict.add(tuple);
        }

        // 2. sort by length.
        // The sort is bad. bubble sort -> O(n^3)
        int n = dict.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = i; k < j; k++) {
                    if(dict.get(i)[1] <= dict.get(j)[1]) {
                        int[] tmp = dict.get(i);
                        dict.set(i, dict.get(j));
                        dict.set(j, tmp);
                    }
                }
            }
        }

        // 3. only add the longest lengths to the new array list (longest_words).
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {

                // skip any word that's less than or equal to 1.
                if(dict.get(j)[1] <= 1) continue;

                if(dict.get(i)[1] > dict.get(j)[1]) {
                    String current_word = words[dict.get(i)[0]];

                    // only unique words.
                    if(!longest_words.contains(current_word)) {
                        longest_words.add(current_word);
                    }
                }
            }
        }

        // 4. print
        System.out.println("Result: " + longest_words);







        // 8. Write a program thats displays the number of occurrences of an element in the array.


        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] numbers = {1,1,1,3,3,9};

        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(numbers[i])) {
                map.put(numbers[i], map.get(numbers[i]) + 1);
            } else {
                map.put(numbers[i], 1);
            }
        }


        for (int key: map.keySet()) {
            int value = map.get(key);
            if(value == 1) {
                int count = 0;

                for (int i = 0; i < numbers.length; i++) {
                    if(key == numbers[i]) {
                        count++;
                    }
                }

                if(count == value) {
                    map.put(key, 0);
                }
            }

        }

        String output = "";

        for(int key : map.keySet()) {
            output += key + " occurs " + map.get(key) + " times\n";
        }

        System.out.println(output);





        // 9. Write a program that places the odd elements of an array before the even elements.

        int[] numbers = {2,3,40,1,5,9,4,10,7};
        int n = numbers.length;

        int[] even = new int[n];
        int[] odd = new int[n];
        int[] all =  new int[n];

        int even_counter = 0;
        int odd_counter = 0;
        int all_counter = 0;

        for (int i = 0; i < n; i++) {
            if(numbers[i] % 2 == 1) {
                odd[odd_counter] = numbers[i];
                odd_counter++;
            } else {
                even[even_counter] = numbers[i];
                even_counter++;
            }
        }

        for (int i = 0; i < odd.length; i++) {
            if(odd[i] > 0) {
                all[all_counter] = odd[i];
                all_counter++;
            }
        }

        for (int i = 0; i < even.length; i++) {
            if(even[i] > 0) {
                all[all_counter] = even[i];
                all_counter++;
            }
        }

        System.out.println(Arrays.toString(all));









        // 10. Write a program that test the equality of two arrays.

        int[] nums1 = {2,3,6,6,4};
        int[] nums2 = {2,3,6,6,4};

        System.out.println(nums1.length == nums2.length);

    }
}
