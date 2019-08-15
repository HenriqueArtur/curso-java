package entities;

/**
 * Accont
 */
public class Accont {
    private int number;
    private String holder;
    private double balance;

    private static final double tax = 5.00;

    public Accont( int number, String holder, double initialDeposit ) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Accont( int number, String holder ) {
        this.number = number;
        this.holder = holder;
    }

    public int getnumber() { return number; }

    public String getHolder() { return holder; }

    public void setHolder(String holder) { this.holder = holder; }

    public double getBalance() { return balance; }

    public void deposit( double amount ) { 
        balance += amount;
    }

    public void withdraw( double amount ) {
        balance -= amount + tax;
    }

    public String toString() {
        return "Accont "
            + number
            + ", Holder: "
            + holder
            + ", Balance: $ "
            + String.format( "%.2f", balance );
    }
}