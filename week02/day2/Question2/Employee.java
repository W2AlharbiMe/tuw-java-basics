package Question2;

public class Employee {
    private String id;

    private String name;

    private int salary;

    Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    public int getAnnualSalary() {
        return salary * 12;
    }


    public int raisedSalary(int percent) {
        double new_salary = (((double) ((double) percent / 100)) * salary) + salary;

        salary = (int) new_salary;

        return salary;
    }


    public String toString() {
        String output = "";

        output += "ID: " + id + "\n";
        output += "Name: " + name + "\n";
        output += "Salary: " + salary + "\n";

        return output;
    }

}
