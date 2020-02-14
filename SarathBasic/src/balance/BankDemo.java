package balance;

import java.util.*;

public class BankDemo {
    public static void main(String args[]) {
        String choice, ch, operation;
        Transaction transac = new Transaction();
        Scanner sc = new Scanner(System.in);
        double amount;
        long accountNo;

        do {
            System.out.println("1. New account");
            System.out.println("2. Transaction");
            System.out.println("3. View Account Information");
            System.out.println("q. Exit");
            System.out.println("choice:");
            choice = sc.next();
            switch (choice) {

            case "1":
                double openingBalance;

                System.out.println("Enter the opening balance :");
                openingBalance = sc.nextDouble();
                transac.transaction(0, "Opening", openingBalance);
                break;

            case "2":
                System.out.println("a. Deposit");
                System.out.println("b. Withdraw");
                ch = sc.next();
                if (ch.equalsIgnoreCase("a"))
                    operation = "Deposit";
                else if (ch.equalsIgnoreCase("b"))
                    operation = "Withdraw";
                else {
                    operation = "Invalid option";
                }
                System.out.println("Account Number:");
                accountNo = sc.nextLong();
                System.out.println("Amount:");
                amount = sc.nextDouble();
                transac.transaction(accountNo, operation, amount);
                break;

            case "3":
                System.out.println("Account Number:");
                accountNo = sc.nextLong();
                operation = "showInfo";
                transac.transaction(accountNo, operation, 0);
                break;

            case "q":
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Wrong choice!!");
            }
        } while (choice != "q");
        sc.close();
    }
}