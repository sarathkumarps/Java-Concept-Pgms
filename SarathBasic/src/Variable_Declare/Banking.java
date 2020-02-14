package Variable_Declare;

import java.util.ArrayList;
import java.util.Scanner;

public class Banking {
	ArrayList <Integer> mobno=new ArrayList <Integer>() ;
	ArrayList <Integer> accno=new ArrayList<Integer>();
   ArrayList <Integer> balamt=new ArrayList<Integer>();
	public ArrayList<Integer> getMobno() {
		return mobno;
	}
	public void setMobno(ArrayList<Integer> mobno) {
		this.mobno = mobno;
	}
	public ArrayList<Integer> getBalamt() {
		return balamt;
	}
	public void setBalamt(ArrayList<Integer> balamt) {
		this.balamt = balamt;
	}
void Create_acct() {
	System.out.println("enter name:\t");
    Scanner n=new Scanner(System.in);
    String a=n.next();
    System.out.println("enter acct no:\t");
    int ac=n.nextInt();
    System.out.println("Mob.no:\t");
    int mn=n.nextInt();
   // System.out.println("Enter the balance:\t");
   // int balamt=n.nextInt();
    System.out.println("\nWelcome to our banking !!\n");
    System.out.println("\nName:\t"+a+"\nAcct no:\t"+ac+"\nMobile no:\t"+mn+"\nBalance:\t"+balamt);
}
void deposit() {
	Scanner n=new Scanner(System.in);
	System.out.println("Enter the acct no:\t");
	int ac=n.nextInt();
	System.out.println("Enter the amount to deposit:\t");
	int d=n.nextInt();
	if(accno==ac) {
	balamt=balamt+d;
	}
	else {
		System.out.println("INVALID ACCT NO");
	}
	System.out.println("Current balance is:\t"+balamt);
}
void withdrawal() {
	System.out.println("Enter the amount to withdraw:\t");
	Scanner n=new Scanner(System.in);
	int w=n.nextInt();
    if(balamt<w) {
    	System.out.println("Insufficient balance"+balamt);
    }
    else {
    	balamt=balamt-w;
    	System.out.println("Balance amt:\t"+balamt);
    }
}
void balenquiry() {
	System.out.println("Balance enquiry:"+balamt);
	System.out.println("Mob_no:\t"+mobno);
}
public static void main(String[] args) {
	int x;
//	ArrayList Banking
	Banking obj=new Banking();
	do 
	{
	System.out.println("Enter your choice:\n1.Create acct\n2.deposit\n3.Withdrawal\n4.balance enquiry\n");
	Scanner ob=new Scanner(System.in);
	int ch=ob.nextInt();
	switch(ch) {
		case 1:
			obj.Create_acct();
			x=0;
			break;
		case 2:
			//obj.setBalamt();
			obj.getBalamt();
			obj.deposit();
			x=0;
			break;
		case 3:
			//obj.setBalamt(balamt);
			obj.getBalamt();
			//System.out.println("\nBalance amount:"+balamt);
			obj.withdrawal();
			x=0;
			break;
		case 4:
			//obj.setBalamt(balamt);
			obj.getBalamt();
		//obj.setMobno(27837460);
			obj.getMobno();
			obj.balenquiry();
			x=0;
			break;
		default:
			System.out.println("Invalid Entry\t");
			x=1;
	}
	}
	while(x==0);
}
}
