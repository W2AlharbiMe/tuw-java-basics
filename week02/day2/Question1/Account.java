package Question1;

public class Account {
    private String id;

    private String name;

    private int balance = 0;


    Account() {
    }

    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) throws Exception {

        if(amount > balance) {
            throw new Exception("insufficient balance.");
        }

        balance -= amount;
        return balance;
    }

    public int debit(int amount) {
        balance += amount;
        return balance;
    }

    public int transferTo(Account another, int amount) throws Exception {
        if(amount > balance) {
            throw new Exception("insufficient balance.");
        }

        another.debit(amount);

        return credit(amount);
    }

    public String toString() {
        String output = "";


        output += "ID: " + id + "\n";
        output += "Name: " + name + "\n";
        output += "Balance: " + balance + " SAR\n";

        return output;
    }
}
