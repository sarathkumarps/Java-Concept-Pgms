package ListPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class BankArrayListTest {
	
	
	
	private int mobno;
	int accno;
    private int balamt;
    
    
    
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
	
	
	void Create_acct() {
		System.out.println("enter name:\t");
	    Scanner n=new Scanner(System.in);
	    String a=n.next();
	    System.out.println("enter acct no:\t");
	    int ac=n.nextInt();
	    System.out.println("Mob.no:\t");
	    int mn=n.nextInt();
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
		
		
		
		
		
		
		
	}

}
