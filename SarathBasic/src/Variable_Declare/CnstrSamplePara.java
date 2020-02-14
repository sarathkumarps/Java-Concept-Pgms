package Variable_Declare;

public class CnstrSamplePara {
	static int sum=0;
	
	public CnstrSamplePara(int x,int y)
	{
		sum=x+y;
	}
	
	
	
	public static void main(String[] args) {
		int a=10;                                     
		int b=20;
		CnstrSamplePara ob=new CnstrSamplePara(a,b);
		
		
		System.out.println(sum);
		
	}

}
