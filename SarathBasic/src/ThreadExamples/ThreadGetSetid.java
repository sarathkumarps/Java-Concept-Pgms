package ThreadExamples;

public class ThreadGetSetid extends Thread{
	
	
	public void run()
	{
		System.out.println("Thread is Running");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		ThreadGetSetid t1=new ThreadGetSetid();
		ThreadGetSetid t2=new ThreadGetSetid();
		System.out.println("Name of Thread "+t1.getName());
		System.out.println("Name of Thread "+t2.getName());
		System.out.println("Id Of t1	"+t1.getId());
		System.out.println("Id Of t2	"+t2.getId());
		
		t1.start();
		t1.join();
		t2.start();
		
		
		t1.setName("Thread New 1 ");
		t2.setName("Thread New 2 ");
		System.out.println("Changed Thread Name    "+t1.getName());
		System.out.println("Changed Thread Name    "+t2.getName());
		
	}

}
