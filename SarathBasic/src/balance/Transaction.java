package balance;

import java.util.Date;
import java.util.Scanner;

public class Transaction {

    private String transactionType;
    private double amount;
    private long accountNum;
    private Date date;
    private Bank b;
    private Balance balance = new Balance();

    Scanner sc = new Scanner(System.in);

    public Transaction() {
        b = new Bank();
    }

    public void transaction(long accountNum, String transactionType,
            double amount) {
        this.accountNum= accountNum;
        this.transactionType = transactionType;
        this.amount = amount;
        date = new Date();
        operation();
    }

    private void operation() {

        if (transactionType.equalsIgnoreCase("Opening")) {
            if (amount < 0) {
                System.out.println("Opening balance cannot be less than zero.");
                return;
            }

            balance = new Balance(b.getBalanceListSize() + 1, amount, date);
            b.newAccount(balance);
        }

        else if (transactionType.equalsIgnoreCase("withdraw")) {
            balance = b.searchAccount(accountNum);
            if (balance == null) {
                System.out.println("Account not found");
                return;
            }
            if (balance.getBalance() < amount) {
                System.out.println("Insufficient Balance.");
                return;
            }
            System.out.println("Balance before transaction:");
            System.out.println(balance.toString());
            balance.setBalance(balance.getBalance() - amount);
            System.out.println("Balance after transaction:\n"
                    + balance.toString());
        }

        else if (transactionType.equalsIgnoreCase("deposit")) {
            balance = b.searchAccount(accountNum);
            if (balance == null) {
                System.out.println("Account not found");
                return;
            }
            System.out.println("Balance before transaction:");
            System.out.println(balance.toString());
            balance.setBalance(balance.getBalance() + amount);
            System.out.println("Balance after transaction:\n"
                    + balance.toString());
        }

        else if (transactionType.equalsIgnoreCase("showInfo")) {
            balance = b.searchAccount(accountNum);
            if (balance == null) {
                System.out.println("Account not found");
                return;
            }
            System.out.println(balance.toString());
        }

        else {
            System.out.println("Invalid option");
            return;
        }

    }
}