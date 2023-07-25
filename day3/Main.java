
class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        // 1.Write a program that prints the numbers from 1 to 100 such that:

        System.out.println("Enter the range (how many numbers you want to check) for fizzBuzz: ");
        int range = s.nextInt();
        
        for (int i = 0; i <= range; i++) {
            
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        
    }
}