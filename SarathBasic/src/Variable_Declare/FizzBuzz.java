package Variable_Declare;

public class FizzBuzz {
	
	public static void main(String[] args)  
	{
		String s=" ";
		for(int i=1;i<=50;i++)
		{
			if(i%3==0)
			{
				//s="Fizz";
				
				
				if(i%5==0) 
				{
					System.out.println("FizzBuzz");
					
				}
				else
				{
					System.out.println("Fizz");
				}
			
			}
			else if(i%5==0)
			{
				//s="Buzz";
				System.out.println("Buzz");
				
			}
			
			else
			{
			System.out.println(i);
			}
			
		}

	}
}

	
