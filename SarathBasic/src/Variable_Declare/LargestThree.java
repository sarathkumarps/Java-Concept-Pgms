package Variable_Declare;

public class LargestThree {
    	public static void main(String[] arg)
    	{
    		int a=1000;
    		int b=160;
    		int c=180;
    		int large=0;
    		if(a>b)
    		{
    			large=a;
    		}
    		if(a<b)
    		{
    			large=b;
    		}
    		if(c>large)
    		{
    			large=c;	
    		}
    			
    		
    	System.out.println(large);
}
}