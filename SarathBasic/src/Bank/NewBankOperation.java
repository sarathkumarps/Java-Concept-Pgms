package Bank;


import java.util.ArrayList;
import java.util.Scanner;

public class NewBankOperation {
	private String name;
	private int mobno;
	private int accno;
    private int balamt;
    
    NewBankOperation(int accno)
    {
    	this.accno=accno;
    	balamt=0;
    }
    
	public String getName()
	{
		return name;
	}
    public void setName(String name)
    {
    	this.name=name;
    }
    public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public int getBalamt() {
		return balamt;
	}
	public void setBalamt(int balamt) {
		this.balamt = balamt;
	}

	public int getAccno()
	{
		return accno;
	}
	
	
	
	
	public class Operation extends NewBankOperation
	{
	
		Operation(int accno)
	{
		super(accno);
	}
	
	
	
	public void main(String[] args) 
	{
	
		Operation ob1=new Operation (1234);
		Operation ob2=new Operation (1235);
		
		
		
		Scanner ip=new Scanner(System.in);
		ArrayList<Operation> ar=new ArrayList<Operation>();
		ar.add(ob1);
		ar.add(ob2);
		int obcode;
		
	
		ar.add(new Operation(123));  // check
		
		System.out.println("Enter Object ID");
		obcode=ip.nextInt();
		
		while(obcode>2)
		{
			
		System.out.println("invalid Object code");
		System.out.println("enter object Code");
		obcode=ip.nextInt();
		
		}
		
		System.out.println("Enter Choice 1.Create   ,2.Deposit   ,3.Withdraw   4, Balnce    5.logout   6.exit");
		int choice = ip.nextInt();
		
		while(choice!=6)
		{
			switch(choice)
			{
			
			case 1:
				if(ar.get(obcode).getName()==null)
				{
			System.out.println("Enter Your name");
			String name=ip.next();
			System.out.println("Enter Your Mobile Number");
			int mobno=ip.nextInt();
			System.out.println("Account Created Succesfully");
//		System.out.println("Name");
				}
				else
				{
					System.out.println("Already exist");
				}
			break;
			
		
			case 2:
				if(ar.get(obcode).getName()==null)
				{
				System.out.println("Enter Your Account number");
				int tempacno=ip.nextInt();
				if(tempacno==ar.get(obcode).getAccno())
				{
					System.out.println("Enter amount");
					int balamt=ip.nextInt();
					ar.get(obcode).setBalamt(balamt);
					System.out.println("Amount Deposited");
					
 				}
				else
				{
					System.out.println("Invalid Ac Number");
				}
				}
				else
				{
					System.out.println("Create account");
				}
		}
		
	}
	}
	
	
	

			}
