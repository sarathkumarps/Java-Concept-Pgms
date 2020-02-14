package Variable_Declare;

public class MainOverriding {
	
	
			public static void main(String[] args) 
			{
				System.out.println("parent main");
			}
			
}


class ride extends MainOverriding
{
	public static void main(String[] args) 
	{
		System.out.println("child main");
		main();
	}
}