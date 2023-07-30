import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // {0: {}}
        HashMap<Integer, double[]> state = new HashMap<Integer, double[]>();

        boolean terminate = false;

        String[] menu = {
                "Add Numbers",
                "Subtract Numbers",
                "Multiply Numbers",
                "Division Number",
                "Get Reminder",
                "find minimum number",
                "find maximum number",
                "calculate the average of numbers",
                "print the last result in calculator",
                "print the list of all results in calculator",
                "Stop the calculator."
        };

        String[] operations = {"+", "-", "x", "/", "%", "<", ">", "average"};

        while(!terminate) {

            double n1 = Calculator.createInput("Enter Number 1:", s);
            double n2 = Calculator.createInput("Enter Number 2:", s);

            boolean inner_terminate = false;

            while(!inner_terminate) {

                Menu.renderMenu(menu);

                int choice = s.nextInt();
                s.nextLine();


                if(choice == 11) {
                    inner_terminate = true;
                    terminate = true;
                    break;
                }

                if(choice > 11 || choice <= 0) {
                    System.out.println("Invalid choice. you can only choose from 1 to 11.");
                    continue;
                }

                switch (choice) {
                    case 9:
//                        double[] last_tuple = state.get(state.size() - 1);
//
//                        double _n1 = last_tuple[0];
//                        double _n2 = last_tuple[1];
//                        double _result = last_tuple[2];
//                        double _choice = last_tuple[3];
//                        int __choice = (int) _choice;
//
//                        System.out.println(_n1 + " " + operations[__choice - 1] + " " + _n2 + " = " + _result);

                        showDetails(state, state.size() - 1, operations);

                        inner_terminate = true;
                        System.out.println("Press [Enter] to try other numbers.");
                        s.nextLine();
                        continue;


                    case 10:
                        for (int key: state.keySet()) {
                            showDetails(state, key, operations);
                        }

                        inner_terminate = true;
                        System.out.println("Press [Enter] to try other numbers.");
                        s.nextLine();
                        continue;
                }

                double result = Calculator.handleCalculatorChoices(choice, n1, n2);

                double[] tuple = {n1, n2, result, choice};
                state.put(state.size(), tuple);

                if((choice - 1) <= (operations.length - 1)) {
                    System.out.println(n1 + " " + operations[choice - 1] + " " + n2 + " = " + result);
                }

                System.out.println("Press [Enter] to try other numbers.");
                s.nextLine();

                break;
            }

        }




//        int number1 = 999;
//        int number2 = 333;

//        int total = sum(number1, number2);
//        double avg = (total / 2);
//
//        System.out.println("Avg: " + avg);


        // method from main send -> String array, char,
        // print names starts with char

//        String[] names = {"Mohammed", "Abdullah", "Khalid", "Ali", "Saleh", "Ahmed"};
//        printNames(names, 'a');

        // method array, number
        // print the number

//        Scanner s = new Scanner(System.in);
//        int[] n = {5,2,2,1,3,6,7,8,9,10};
//
//        System.out.println("Enter index to view the value:");
//        printIndex(n, s.nextInt());
    }

    public static void showDetails(HashMap<Integer, double[]> state, int index, String[] operations) {
        double[] last_tuple = state.get(index);

        double _n1 = last_tuple[0];
        double _n2 = last_tuple[1];
        double _result = last_tuple[2];
        double _choice = last_tuple[3];
        int __choice = (int) _choice;

        System.out.println(_n1 + " " + operations[__choice - 1] + " " + _n2 + " = " + _result);
    }

//    public static void printIndex(int[] array, int index) {
//        if(index > array.length) {
//            System.out.println("no value at index: " + index);
//        } else {
//            System.out.println("Found number: " + array[index]);
//        }
//    }
//
//    public static void printNames(String[] names, char alphabet) {
//        int c = 0;
//        for(String n : names) {
//            if(n.toLowerCase().startsWith(String.valueOf(alphabet))) {
//                System.out.println(n);
//                c += 1;
//            }
//        }
//        System.out.println("There are (" + c + ") names that starts with " + alphabet);
//    }
//
//
//    public static void sum() {
//        int n1 = 1;
//        int n2 = 2;
//
//
//        System.out.println(n1 + n2);
//    }
//
//    public static int sum(int n1, int n2) {
//        return n1 + n2;
//    }
//
//
//    public static void subtract(int n1, int n2) {
//        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
//    }
}

