package homework_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("---> Circle <---");

        Circle c1 = new Circle(11);
        System.out.println(c1.toString());
        System.out.println("Circle Area: " + c1.getArea());
        System.out.println("Circle Perimeter:" + c1.getPerimeter());

        System.out.println("\n---> Rectangle <---");

        Rectangle r1 = new Rectangle(10, 7);
        System.out.println(r1.toString());
        System.out.println("Rectangle Area: " + r1.getArea());
        System.out.println("Rectangle Perimeter:" + r1.getPerimeter());


        System.out.println("\n---> Square <---");

        Square s1 = new Square(6);
        System.out.println(s1.toString());
        System.out.println("Square Area: " + s1.getArea());
        System.out.println("Square Perimeter: " + s1.getArea());
    }
}