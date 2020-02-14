package ThreadExamples;

 class TestSynchronization
{  
	synchronized void printTable(int n)
	 {
	   for(int i=1;i<=5;i++)
	   {  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
}  
  

class MyThread1 extends Thread
{  
	TestSynchronization t=new TestSynchronization() ;  
		MyThread1(TestSynchronization t)
		{  
			this.t=t;  
		}  
	public void run(){  
	t.printTable(5);  
	}  
	  
}  
class MyThread2 extends Thread
{  
	TestSynchronization t =new TestSynchronization();  
	MyThread2(TestSynchronization t)
		{  
		this.t=t;  
		}
	public void run()
		{  
		t.printTable(100);  
		
		
		}  
}  
  
 
public class SynchronisePgm 
 {
	 
	
	public static void main(String args[]){  
	TestSynchronization obj = new TestSynchronization();
	MyThread1 t1=new MyThread1(obj);  
	MyThread2 t2=new MyThread2(obj);  
	t1.start();  
	t2.start();  
	}  
}