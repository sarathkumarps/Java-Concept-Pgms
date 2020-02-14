package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	
	public static void main(String[] args) {
		boolean temp=true;
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the 1st string:\t");
		String s1=ip.nextLine();
		System.out.println("Enter the 2nd String:\t");
		String s2=ip.nextLine();
		//System.out.println("Enter the length of both string");
		//int len=ip.nextInt();
		if(s1.equals(s2)==true)
		{
			System.out.println("both are same");
			
		}
		else
		{
			String s11=s1.toUpperCase();
			String s22=s2.toUpperCase();
			
			char sorteds1[]=s11.toCharArray();
			char sorteds2[]=s22.toCharArray();
			Arrays.sort(sorteds1);
			
			//System.out.println(sorteds1);
			Arrays.sort(sorteds2);
			//System.out.println(sorteds2);
			System.out.println(s1.equals(sorteds2));
			temp=Arrays.equals(sorteds1,sorteds2);
			//System.out.println(temp);
		}
			if(temp==true)
				{
					System.out.println("Anagram");
					
				}
			else
			{
				System.out.println("Not anagram");
			}
		
		
		
		
	} 

}
