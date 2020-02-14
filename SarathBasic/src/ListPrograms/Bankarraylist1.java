package ListPrograms; 
import java.util.ArrayList;
import java.util.Scanner;

public class Bankarraylist1{

  public static void main(String args[]){


    ArrayList<Bankarraylist1> accounts = new ArrayList<Bankarraylist1>();

    Bankarraylist1 Bankarraylist11 = new Bankarraylist1(1, "Savings", "US Dollars", 800);
    Bankarraylist1 Bankarraylist12 = new Bankarraylist1(2, "Checking", "Euro", 1900);
    Bankarraylist1 Bankarraylist13 = new Bankarraylist1(3, "Checking", "US Dollars", 8000);

    accounts.add(Bankarraylist11);
    accounts.add(Bankarraylist12);
    accounts.add(Bankarraylist13);


    int Bankarraylist1ID=4;
    String choice;
    int deposit;
    int withdraw;
    Scanner in = new Scanner(System.in);
    Bankarraylist1 operation = new Bankarraylist1();
    boolean flag = true;

    String accountType;
    String currencyType;
    int balance;

    while(flag){
      System.out.println("Select a choice:");
      System.out.println("1. Existing Bankarraylist1");
      System.out.println("2. New Bankarraylist1");   
      System.out.println("3. Quit");


      String input = in.next();

        //existing user
        if(input.equals("1")){

          System.out.println("Enter Bankarraylist1ID: ");
          Bankarraylist1ID = in.nextInt();


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
            operation.display(accounts.get(Bankarraylist1ID));
          }

          else if (choice.equals("4"))
            operation.balance(accounts.get(Bankarraylist1ID));

          else
            System.out.println("Invalid");
        }



        //new user
         else if(input.equals("2")){
          //add new user to arraylist

           int newID = Bankarraylist1ID + 1;

           System.out.println("Enter account type: ");
           accountType = in.next(); 
           System.out.println("Enter currency type: "); 
           currencyType = in.next();
           System.out.println("Enter initial balance: ");
           balance = in.nextInt(); 

           System.out.println("Your Bankarraylist1 ID will be: " + newID);


           accounts.add(new Bankarraylist1());


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

















