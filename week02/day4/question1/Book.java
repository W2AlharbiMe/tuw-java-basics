package question1;

public class Book extends Product {
    private String author;

    public Book() {
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        // discount 20% of original price
        double price = super.getPrice();

        return price - (price * 0.20);
    }
}

