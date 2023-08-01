package Question2;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("a8891", "Abdullah", 8000);
        Employee e2 = new Employee("a9911", "Ahmed", 6000);

        System.out.println("Employee 1:\n" + e1.toString());
        System.out.println("Employee 2:\n" + e1.toString());


        System.out.println("Employee "+ e2.getName() +" raised salary by 5% new salary: " + e2.raisedSalary(5));

        System.out.println("Employee "+ e2.getName() + " Annual Salary: " + e2.getAnnualSalary());
    }
}
