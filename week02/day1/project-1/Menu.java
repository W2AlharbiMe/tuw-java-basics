import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static int initializeGameMenu(Scanner s) {
        String[] menu = {
                "Start Game\n",
                "Quit"
        };

        render(menu);

        return menu.length;
    }

//    public static int[] createInputLoop(String message, Scanner s) {
//        do {
//            int[] result = createMenuInput(message, s);
//            int[] response = {1, 0};
//
//            s.nextLine();
//
//            if(result[0] == 1) {
//                continue;
//            }
//            else {
//                return result[1];
//            }
//        } while(true);
//    }

    public static int[] createMenuInput(String message, Scanner s) {
        int[] response = {1, 0};

        try {
            System.out.println(message);
            response[1] = s.nextInt();
            response[0] = 0;

            return response;
        } catch(InputMismatchException e1) {
            System.out.println("You can only enter a number.");
            GameSystem.hold(s);
        } catch(Exception e2) {
            System.out.println(e2.getMessage());
            GameSystem.hold(s);
        }

        return response;
    }

    public static void render(String[] menu) {
//        System.out.println("Choose from the menu:");
        String output = "";
        int c = 1;

        for (String item: menu){
            output += c + ". " + item;
            c++;
        }

        System.out.println(output);
    }
}
