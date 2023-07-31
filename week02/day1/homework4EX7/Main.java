


import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] menu = {
                "Accept elements of an array",
                "Display elements of an array",
                "Search the element within array",
                "Sort the array",
                "To Stop"
        };

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        boolean terminate = false;


        while (!terminate) {
              // System.out.println("Choose from the menu:");

            for (int i = 0; i < menu.length; i++) {
                System.out.println((i+1) + ". " + menu[i]);
            }

            int choice = createInputLoop("Choose from the menu: ", s);

            // this is used to intercept the newline from nextInt. so I can use nextLine without issues.
           // s.nextLine();

            // optimization tick.
            if(choice == 5) break;

            switch (choice) {

                // add numbers
                case 1:
                    System.out.println("--------------------");

                    do {

                        System.out.println("Enter any number to go back enter (b) or enter (q) to close the program:");

                        try {
                            String input = s.nextLine();

                            // you can press enter and the program will start again from inner loop.
                            if(input.isEmpty() || input.isBlank()) continue;

                            if(input.equalsIgnoreCase("b")) {
                                break;
                            }

                            if(input.equalsIgnoreCase("q")) {
                                terminate = true;
                                break;
                            }

                            int n = Integer.parseInt(input);

                            numbers.add(n);

                        } catch(NumberFormatException e1) {
                            System.out.println("You entered an invalid number. to go back enter (b) or enter (q) to close the program.");
                            hold(s);
                        } catch(Exception e2) {
                            System.out.println(e2.getMessage());
                            hold(s);
                        }


                    } while(true);

                    System.out.println("--------------------");


                    // this will render the menu again, and ask for choice.
                    continue;


                    // show all entered numbers.
                case 2:
                    System.out.println("--------------------");


                    System.out.println("Numbers you have entered:");

                    for (int n : numbers) {
                        System.out.println(n);
                    }

                    System.out.println("--------------------");

                    System.out.println("Press [ENTER] to go back or enter (q) to close the program.");
                    String line = s.nextLine();

                    if(line.equalsIgnoreCase("q")) {
                        terminate = true;
                        break;
                    }

                    continue;

                case 3:
                    System.out.println("--------------------");


                    do {

                        System.out.println("Search for numbers. to go back enter (b) or enter (q) to close the program.");

                        try {
                            String input = s.nextLine();

                            // you can press enter and the program will start again from inner loop.
                            if(input.isEmpty() || input.isBlank()) continue;

                            if(input.equalsIgnoreCase("b")) {
                                break;
                            }

                            if(input.equalsIgnoreCase("q")) {
                                terminate = true;
                                break;
                            }

                            int n = Integer.parseInt(input);

                            String output = "The Number (" + n + ")";
                            output += numbers.contains(n) ? " Exists." : " Does not exists.";

                            System.out.println(output);

                        } catch(NumberFormatException e1) {
                            System.out.println("You entered an invalid number. to go back enter (b) or enter (q) to close the program.");
                            hold(s);
                        } catch(Exception e2) {
                            System.out.println();
                            hold(s);
                        }


                    } while(true);

                    System.out.println("--------------------");


                    continue;

                case 4:
                    System.out.println("--------------------");


                    Collections.sort(numbers);

                    for(int n : numbers) {
                        System.out.println(n);
                    }

                    System.out.println("--------------------");

                    System.out.println("Press [ENTER] to go back or enter (q) to close the program.");
                    line = s.nextLine();

                    if(line.equalsIgnoreCase("q")) {
                        terminate = true;
                        break;
                    }

                    continue;

                default:
                    System.out.println("Invalid choice you can only choose from the menu 1 to 5.");
                    hold(s);

                    continue;
            }

            break;
        }


    }

    public static int createInputLoop(String message, Scanner s) {

        do {
            int[] result = createInput(message, s);
            s.nextLine();

            if(result[0] == 1) {
                continue;
            }
            else {
                return result[1];
            }

        } while (true);
    }

    public static int[] createInput(String message, Scanner s) {
        int[] response = {1, 0};

        try {
            System.out.println(message);
            int n = s.nextInt();

            response[0] = 0;
            response[1] = n;

            return response;
        } catch(InputMismatchException e1) {
            System.out.println("You can only enter a number.");
            hold(s);
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
            hold(s);
        }

        return response;
    }

    public static void hold(Scanner s) {
        System.out.println("Press [ENTER] to continue.");
        s.nextLine();
    }

}

