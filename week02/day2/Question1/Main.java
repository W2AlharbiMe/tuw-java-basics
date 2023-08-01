package Question1;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account("a1578", "Abdullah", 8000);

        Account a2 = new Account("s98123", "Saleh");

        System.out.println("\nBefore Transfer:\n");

        System.out.println(a1.toString());

        System.out.println("-----------------");

        System.out.println(a2.toString());


        try {
            a1.transferTo(a2, 1000);
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }

        System.out.println("After Transfer:\n");

        System.out.println(a1.toString());

        System.out.println("-----------------");

        System.out.println(a2.toString());


        System.out.println("-----------------");

        System.out.println("Debit: ");

        int a1_new_balance = a1.debit(500);

        System.out.println(a1.getName() + " Debit 500\nNew Balance:" + a1_new_balance + " SAR");

        System.out.println("-----------------");

        System.out.println("Credit: ");

        try {
            int a2_new_balance = a2.credit(300);
            System.out.println(a2.getName() + " Credit 300\nNew Balance:" + a2_new_balance + " SAR");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }

    }
}