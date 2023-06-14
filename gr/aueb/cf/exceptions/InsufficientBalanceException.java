package gr.aueb.cf.exceptions;

public class InsufficientBalanceException extends Exception {
    private static final long serialVersionUID = 1L;    // The exception unique itself with this id.

    public InsufficientBalanceException(double balance, double amount) {
        // This super() comes from Exception class
        super("Insufficient balance " + balance + " for amount " + amount);
    }
}
