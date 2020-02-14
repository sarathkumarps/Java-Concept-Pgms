package ThreadExamples;


public class ThreadJoinMethod implements Runnable

	{
	
		public void run()
		
		{
			for(int i=0;i<=5;i++)
			{
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(i);
			}
			
		}
		
		public static void main(String[] args) throws InterruptedException 
		{
			ThreadJoinMethod obj=new ThreadJoinMethod();
			Thread t1=new Thread(obj);
			
			t1.start();
			
			t1.join();
			Thread t2=new Thread(obj);
			t2.start();
			Thread t3=new Thread(obj);
			t3.start();
			Thread t4=new Thread(obj);
			t4.start();
			
			
			
			
			
		}
	

	}
