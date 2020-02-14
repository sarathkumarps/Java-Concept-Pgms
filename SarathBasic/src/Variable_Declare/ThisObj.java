package Variable_Declare;

public class ThisObj {
	
		  void m(ThisObj obj2)
		  	{  
			  System.out.println("method is invoked");  
		  	}  
		  void p()
		  	{  
			  m(this);  
		  	}  
		  public static void main(String args[]){  
		  ThisObj obj = new ThisObj();  
		  obj.p();  
		  }  
		}  


