package Problems;

public class WordCount {
	
	
	public static void main(String[] args) {
		
		String s="Malayalam";
		
		int len=s.length();
		int j=0,i;
		char c='M';
		for(i=0;i<=len-1;i++)
		{
			
			if(s.charAt(i)==c)
			{
				j=j+1;
			}
			
		}
		System.out.println(j);	
		
		
		
	}

}
