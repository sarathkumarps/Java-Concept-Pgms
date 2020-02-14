package Variable_Declare;

public class SuperTestClassA {
	
	String name="sarath";
	int mob=98;
	  
	
	
	 void disp2()
	{
		this.name="Annad";
		this.mob=67;
				
		System.out.println(name+mob);
	}
	
		public static void main(String[] args) {
			SuperTestClassA obj=new SuperTestClassA();
			obj.disp();
		}
}
