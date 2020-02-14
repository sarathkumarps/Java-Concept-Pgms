package Problems;

public class ReverseString 
	{
	
	
	
	public static void main(String[] args) {
		
	
	  String s="World";
	  String reve="";
	  int len=s.length();
	  for(int i=len-1;i>=0;i--)
	  {
		  reve=reve+s.charAt(i);
		  
	  }
	  System.out.println(reve);
	
	

	}
}
