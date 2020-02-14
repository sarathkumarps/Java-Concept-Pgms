package Variable_Declare;

class A {
	void disp()
	{
		System.out.println("Parent");
	}

}
class B extends A
{
	void disp2()
	{
		System.out.println("Child");
		
	}
}
public class TestInher
{
	
	public static void main(String[] args) {
		

		B obj=new B();
	obj.disp();
	obj.disp2();
	}
}