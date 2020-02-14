package Variable_Declare;

public class StringBuilderMethods {
	
	
	public static void main(String[] args) {
		
	
	StringBuilder s1=new StringBuilder("Hello");
	StringBuilder s2=new StringBuilder("Java");
	System.out.println(s1.append(s2));
	
	System.out.println(s1.insert(2, " hai "));
	System.out.println(s1.replace(1,3,"java"));
	
	
	System.out.println(s1.delete(1,3));
	StringBuffer s3=new StringBuffer("Java");
	System.out.println(s3.reverse());
	s3.ensureCapacity(5);
	System.out.println(s3.capacity());
	s3.append("is a programming language");
	System.out.println(s3.capacity());
	
	}
}

