package ThreadExamples;

public class CreationThread extends Thread {
	
	
	
	public void run()
	
	{
		System.out.println("Thread Running");
		
	}
		
	
	public static void main(String[] args) {
		
	
	
		CreationThread t1=new CreationThread();
	t1.start();
	
	}

 }
