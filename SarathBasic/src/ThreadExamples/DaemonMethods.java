package ThreadExamples;

public class DaemonMethods extends Thread 
{
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Deamon Thread"+getName());
		}
		else 
		{
			System.out.println("Not a Deamon Thread"+getName());
		}
	}
	
	
	
	public static void main(String[] args) {
		
		DaemonMethods tr1=new DaemonMethods();
		DaemonMethods tr2=new DaemonMethods();
		tr1.setDaemon(true);
		tr2.start();
		tr1.start();
		
		
	}
	
	
	

}
