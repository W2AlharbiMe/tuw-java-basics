import java.util.*;
import java.util.spi.AbstractResourceBundleProvider;

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
            double n1, n2;

            n1 = Calculator.createInputLoop("Enter Number 1 or Enter 0 to quit:", s);

            if(n1 == 0) {
                break;
            }

            n2 = Calculator.createInputLoop("Enter Number 2 or Enter 0 to quit:", s);

            if(n2 == 0) {
                break;
            }

            boolean inner_terminate = false;

            while (!inner_terminate) {
                Menu.renderMenu(menu);

                int choice = (int) Calculator.createInputLoop("Choose from the menu:", s);

                if (choice == 11) {
                    inner_terminate = true;
                    terminate = true;
                    break;
                }

                if (choice > 11 || choice <= 0) {
                    System.out.println("Invalid choice. you can only choose from 1 to 11.");
                    continue;
                }

                switch (choice) {
                    case 9:
                        double[] last_tuple = state.get(state.size() - 1);

                        double _n1 = last_tuple[0];
                        double _n2 = last_tuple[1];
                        double _result = last_tuple[2];
                        double _choice = last_tuple[3];
                        int __choice = (int) _choice;

                        System.out.println(_n1 + " " + operations[__choice - 1] + " " + _n2 + " = " + _result);

                        showDetails(state, state.size() - 1, operations);

                        inner_terminate = true;

                        hold(s);

                        continue;

                    case 10:
                        for (int key : state.keySet()) {
                            showDetails(state, key, operations);
                        }
                        inner_terminate = true;

                        hold(s);

                        continue;
                }

                double[] result = Calculator.handleCalculatorChoices(choice, n1, n2);

                if(result[0] == 1) {
                    hold(s);
                    continue;
                }


                double[] tuple = {n1, n2, result[1], choice};
                state.put(state.size(), tuple);

                if ((choice - 1) <= (operations.length - 1)) {
                    System.out.println(n1 + " " + operations[choice - 1] + " " + n2 + " = " + result[1]);
                }

                hold(s);

                break;
            }

        }
    }

    public static void hold(Scanner s) {
        System.out.println("Press [Enter] to try other numbers.");
        s.nextLine();
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

}

