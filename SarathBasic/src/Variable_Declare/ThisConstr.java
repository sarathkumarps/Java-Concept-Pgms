package Variable_Declare;

public class ThisConstr {
	
	  
	ThisConstr()
	{
		System.out.println("hello This");}  
		ThisConstr(int x)
		{  
		this();  
		System.out.println(x);  
		}  
	}  
		class Test
		{  
		public static void main(String args[]){  
		ThisConstr a=new ThisConstr(10);  
		}  

}
