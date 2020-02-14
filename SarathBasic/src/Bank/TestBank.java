package Bank; 
import java.util.ArrayList;
import java.util.Scanner;

public class TestBank{

  public static void main(String args[]){


    ArrayList<Customer> accounts = new ArrayList<Customer>();

    Customer customer1 = new Customer(1, "Savings", "US Dollars", 800);
    Customer customer2 = new Customer(2, "Checking", "Euro", 1900);
    Customer customer3 = new Customer(3, "Checking", "US Dollars", 8000);

    accounts.add(customer1);
    accounts.add(customer2);
    accounts.add(customer3);


    int customerID=4;
    String choice;
    int deposit;
    int withdraw;
    Scanner in = new Scanner(System.in);
    Customer operation = new Customer();
    boolean flag = true;

    String accountType;
    String currencyType;
    int balance;

    while(flag){
      System.out.println("Select a choice:");
      System.out.println("1. Existing customer");
      System.out.println("2. New customer");   
      System.out.println("3. Quit");


      String input = in.next();

        //existing user
        if(input.equals("1")){

          System.out.println("Enter CustomerID: ");
          customerID = in.nextInt();


          System.out.println("Would you like to: ");
          System.out.println("1. Deposit ");
          System.out.println("2. Withdraw ");
          System.out.println("3. Display account info ");
          System.out.println("4. Check balance ");

          choice = in.next();

          if(choice.equals("1")){
            System.out.println("How much would you like to deposit?");
            deposit = in.nextInt();
            operation.deposit(deposit);
          }

          else if (choice.equals("2")){
           System.out.println("How much would you like to withdraw?");
            withdraw = in.nextInt(); 
            operation.withdraw(withdraw);

          }

          else if (choice.equals("3")){
            operation.display(accounts.get(customerID));
          }

          else if (choice.equals("4"))
            operation.balance(accounts.get(customerID));

          else
            System.out.println("Invalid");
        }



        //new user
         else if(input.equals("2")){
          //add new user to arraylist

           int newID = customerID + 1;

           System.out.println("Enter account type: ");
           accountType = in.next(); 
           System.out.println("Enter currency type: "); 
           currencyType = in.next();
           System.out.println("Enter initial balance: ");
           balance = in.nextInt(); 

           System.out.println("Your customer ID will be: " + newID);


           accounts.add(new Customer(newID, accountType, currencyType, balance));


        }

        else if(input.equals("3")){

          System.out.println("Thanks for using this bank!");
          flag = false;
        }


        else{

          System.out.println("Invalid");

        }
      }

    }
}

class Customer{

	  String accountType, currencyType, info; 
	  int customerID, balance, amount;
	  Scanner input = new Scanner(System.in);


	  public Customer(int customerID, String accountType, String currencyType,  int balance){
	    this.accountType = accountType;
	    this.currencyType = currencyType; 
	    this.customerID = customerID;
	    this.balance = balance; 
	    this.amount = amount; 
	  }

	  public int deposit(int amount){

	    amount = input.nextInt();
	    if (amount >= 500) {
	      System.out.println("Invalid");

	    }
	    else{
	      balance = balance + amount;

	    }
	    return balance;
	  }

	  public int withdraw(int amount){

	    if (balance < amount) {
	      System.out.println("Invalid amount.");
	    }
	    else if (amount >= 500) {
	      System.out.println("Invalid");
	    }
	    else {
	      balance = balance - amount;

	    }
	    return balance;
	  }


	  public void display(ArrayList<Customer> accounts) {
	    System.out.println("CustomerID:" + accounts.customerID);
	    System.out.println("Account Type:" + accounts.accountType);
	    System.out.println("Currency Type: " + accounts.currencyType); 
	    System.out.println("Balance:" + accounts.balance);

	  }

	  public  void balance(ArrayList<Customer> accounts) {
	    System.out.println("Balance:" + accounts.balance);
	  }





	}
