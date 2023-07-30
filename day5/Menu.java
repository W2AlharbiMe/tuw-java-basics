public class Menu {
    public static void renderMenu(String[] menu) {
        System.out.println("Choose from the menu:");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
    }
}

