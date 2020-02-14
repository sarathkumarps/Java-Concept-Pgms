package Variable_Declare;

public class StringBufferMethods {
	
	
	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("hello");
		
		System.out.println(sb1.equals(sb2)); //false
		
		System.out.println(sb1.append(sb2));
		
		System.out.println(sb1.insert(2, " hai "));
		System.out.println(sb1.replace(1,3,"java"));
		
		
		System.out.println(sb1.delete(1,3));
		StringBuffer sb3=new StringBuffer("Java");
		System.out.println(sb3.reverse());
		sb3.ensureCapacity(5);
		System.out.println(sb3.capacity());
		sb3.append("is a programming language");
		System.out.println(sb3.capacity());
		
		
	}

}
