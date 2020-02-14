package Variable_Declare;

public class StringImmutable 
	{
	
	
	public static void main(String[] args) {
		
		
		String s=new String("Hello");
		System.out.println(s.hashCode());
		System.out.println(s);
		String s1="welcome";
		System.out.println("s1 id is:"+" "+s1.hashCode());
		
		String s2=s1;
		System.out.println("s2 id is:"+" "+s2.hashCode());
		
		System.out.println(s1.concat("name"));
		
		System.out.println(s1.hashCode());
		
		s1=s1.concat("name2");
		System.out.println(s1.hashCode());
		
		String str1="Hello world";
		String str2="Hello world";
		
		
		
		System.out.println("\n \n \n");
		System.out.println("Str1 id is"+str1.hashCode());
		System.out.println("Str2 id is"+str2.hashCode());
		
		
		
		String w="Hello";
		
		String w1=new String("Hello");
		String ww="Hello";
		System.out.println(w.hashCode()+"    "+w1.hashCode());
		
	}
	
	

	}
