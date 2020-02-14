package Variable_Declare;

public class stringmethod {
	
	

	
      static void concat()
       {
    	   System.out.println("Concat");
    		String s1="hello";
    	    String s2="world";
    	   
    	   String s3=s1+s2;
    	   System.out.println(s3+"");
    	   System.out.println(s1.concat(s2));
       }
       
       
      static void compare()
       {
    	   System.out.println("\n comapare by equal method");
    	   
    	   String s4="hello";
    	   String s5="helloi";
    	   System.out.println("S4 and S5 are "+s4+"\t"+s5);
    	   System.out.println(s4.equals(s5));
    	   System.out.println("\n");
    	   
    	   System.out.println("\n comapare by == opeartor");
    	   System.out.println(s4==s5);
    	   
    	   String str1=new String("hello");
    	   String str2=new String("hello");
    	   
    	   System.out.println("\n equal to equalto");
    	   System.out.println(str1==str2);
    	   System.out.println(str1.hashCode());
    	   System.out.println(str2.hashCode());
    	   System.out.println("\n ");
    	   
    	   
    	   System.out.println("\n compare by compareto ascii");
    	   
    	   String s6="hello";
    	   System.out.println(s4.compareTo(s5));
    	   System.out.println(s4.compareTo(s6));	
    	   System.out.println(s5.compareTo(s4));
       }
       
       
       
    static void substring()
       {
    	   
    	   System.out.println("\n substring Operaters");
    	   String s7="Sachin Tendulkar";
    	   
    	   System.out.println("s7.substring(6)="+s7.substring(6));
    	   System.out.println("s7.substring(0,6)="+s7.substring(0,8));
    	   
    	   
       }
       
       
      static void trimstring()
       {
    	   System.out.println("\n Trim Method");
    	   String s8="  Sachin Tendulkar  \n";
    	   System.out.println("Trimmed value \t"+s8.trim());
    	   
    	   
       }
      
      static void ltouAndUtol()
      {
    	 String s9="Sachin Tendulkar ";
    	 System.out.println(s9.toUpperCase());
    	 System.out.println(s9.toLowerCase());
    	   
      }
      
      
      static void lenthstring()
      {
    	String s10="Hello world";
    	System.out.println(s10.length());
      }
      
      
      static void otherfunctions()
      {
    	  String s11="Hello World";
    	  System.out.println("char at 4"+CharAt(4));
    	  //System.out.println(s11.reverse());
    	  System.out.println("Boolean Contains World in Helloworld \t"+s11.contains("World"));
    	  System.out.println("Boolean Contains Earth in Helloworld \t"+s11.contains("Earth"));
    	   
    	  System.out.println("join "+ s11.join("-",s11, "welcome"));
    	  
    	  String s12="";
    	  
    	  System.out.println(s12.isEmpty());
    	  
    	  
    	  System.out.println(s11.replace('o', 'a'));
    	  System.out.println(s11.replace(' ','-'));
    	  
    	  
      }
       private static String CharAt(int i) {
		
		return null;
	}


	public static void main(String[] args) {
		
    	   
    	   concat();
    	   compare();
    	   substring();
    	   trimstring();
    	   ltouAndUtol();
    	   lenthstring();
    	   otherfunctions();
    	   
	}

}
