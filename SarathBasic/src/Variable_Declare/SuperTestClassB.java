package Variable_Declare;

public class SuperTestClassB extends SuperTestClassA  {
	int salary;
	int bonus ;
	  
	
	
	 void disp()
	{
		this.salary=5000;
		this.bonus=500;
				
		System.out.println(super.name+" "+super.mob+" "+salary+" "+bonus);
	}
	
		public static void main(String[] args) {
			SuperTestClassB obj=new SuperTestClassB();
			obj.disp();
			
		}
	
	
	
	
}
