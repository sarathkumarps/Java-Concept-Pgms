package Variable_Declare;

public class PolymorphismTest {
	
	
	int add(int x,int y)
	{
		int z=x+y;
		return z;
	}
	int add(int m,int n,int o)
	{
		int p=m+n+o;
		return p;
	}
	double add(double a,double b )
	{
		 
				double c=a+b;
				return c;
	}
	
	
	
	public static void main(String[] args) {
		
		PolymorphismTest obj=new PolymorphismTest();
		System.out.println(obj.add(1,2));
		System.out.println(obj.add(4,5,6));
		System.out.println(obj.add(12.3,56.2));
		
		
	}
	
	
	

}
