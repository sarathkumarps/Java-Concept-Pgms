package ThreadExamples;

public class ThreadPriority extends Thread {
	
	
	
	public void run()
	{
		System.out.println("Id of current Thread  "+Thread.currentThread().getId());
		
		try {
			sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Proirity Methods   \n");
		Thread t1=new ThreadPriority();
		System.out.println(t1.getId());
		Thread t2=new ThreadPriority();
		System.out.println(t1.getPriority());
		Thread t3=new ThreadPriority();
		Thread t4=new ThreadPriority();
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MIN_PRIORITY);
		t4.setPriority(3);
		
		
		
		
		t1.start();
//		try {
//			sleep(500);
//		} catch (InterruptedException e) {
//		
//			e.printStackTrace();
//		}
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("*************");
		
	}

}
