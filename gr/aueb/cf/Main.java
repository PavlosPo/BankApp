package gr.aueb.cf;

import gr.aueb.cf.exceptions.InsufficientBalanceException;
import gr.aueb.cf.exceptions.NegativeAmountException;
import gr.aueb.cf.exceptions.SsnNotValidException;
import gr.aueb.cf.model.Account;
import gr.aueb.cf.model.OverdraftAccount;
import gr.aueb.cf.model.OverdraftJointAccount;
import gr.aueb.cf.model.User;

public class Main {

    public static void main(String[] args) {
        User pavl = new User("Pav.", "Poulos", "12345");
        Account account = new Account(pavl, "GR12345", 100L);
        Account overPavlos = new OverdraftAccount(pavl, "GR12345", 50);
        User anna = new User("Anna", "G.", "56789");

        try {
            System.out.println("Account : \n" + account.toString());
            System.out.println("Overdraft: \n" + overPavlos.toString());
            Account overJointAccount = new OverdraftJointAccount(pavl, "GR12345", 150, anna);
            overJointAccount.deposit(100);
            overJointAccount.withdraw(50, "16789");
            System.out.println("Overdraft joint account: \n" + overJointAccount.toString());
        } catch (NegativeAmountException | InsufficientBalanceException | SsnNotValidException e) {
            System.out.println(e.getMessage());
        }


    }
}
