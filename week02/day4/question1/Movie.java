package question1;

public class Movie extends Product {
    private String director;

    public Movie() {
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        // discount 10% of original price
        double price = super.getPrice();

        return price - (price * 0.10);
    }
}
