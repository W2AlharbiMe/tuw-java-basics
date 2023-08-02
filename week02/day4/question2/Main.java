package question2;

public class Main {
    public static void main(String[] args) {
        MovablePoint mv1 = new MovablePoint(100, 100, 20, 20);


        System.out.println(
                "Current X: " + mv1.getX() + " Y: " + mv1.getY() +
                "\nX Speed: " + mv1.getxSpeed() + " Y Speed: " + mv1.getySpeed()
        );

        System.out.println("Move X up by " + mv1.getX() + " and move Y by " + mv1.getySpeed());
        mv1.moveRight();
        mv1.moveUp();


        System.out.println("After Movement:");


        System.out.println(
                "Current X: " + mv1.getX() + " Y: " + mv1.getY() +
                        "\nX Speed: " + mv1.getxSpeed() + " Y Speed: " + mv1.getySpeed()
        );
    }
}
