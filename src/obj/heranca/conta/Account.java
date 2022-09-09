package obj.heranca.conta;

public class Account {

    private int number;
    private int holder;
    private double balance;

    public Account(int number, int holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getHolder() {
        return holder;
    }

    public void setHolder(int holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double value) {
        this.holder += value;
    }
}
