package question1;

public class Main {
    public static void main(String[] args) {
        Book bk1 = new Book("Clean Code", 200, "Robert Cecil Martin");

        System.out.println(
                "Book Name: " + bk1.getName() +
                "\nBook Price: " + bk1.getPrice() +
                "\nAuthor: " + bk1.getAuthor() +
                "\nPrice after 20% discount: " + bk1.getDiscount()
        );

        System.out.println("-----------------------------");

        Movie m1 = new Movie("Superman", 30, "Sidney J. Furie");

        System.out.println(
                "Move Name: " + m1.getName() +
                "\nBook Price: " + m1.getPrice() +
                "\nDirector: " + m1.getDirector() +
                "\nPrice after 10% discount: " + m1.getDiscount()
        );


    }
}
