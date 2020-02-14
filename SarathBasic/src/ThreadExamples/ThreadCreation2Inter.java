package ThreadExamples;

public class ThreadCreation2Inter implements Runnable

	{
	
	
	public void run()
	{
		System.out.println("Thread Running");
	}
	
	
	public static void main(String[] args) 
	
	
	{
		
		ThreadCreation2Inter obj=new ThreadCreation2Inter();
		Thread t1=new Thread(obj); 
		t1.start();
		System.out.println(t1.getId());
		
		
		
	}
	
	
	

	}	
