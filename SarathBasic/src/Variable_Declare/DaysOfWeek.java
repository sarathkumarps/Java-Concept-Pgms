package Variable_Declare;

import java.util.Scanner;

public class DaysOfWeek {
	public static void main(String[] args) {
		int choose;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter number B/W 7	:");
		choose=ip.nextInt();
		switch (choose)
		{
		case 1: System.out.println("SUNDAY");
		break;
		case 2: System.out.println("MONDAY");
		break;
		case 3: System.out.println("TUESDAY");
		break;
		case 4: System.out.println("WEDNSEDAY");
		break;
		case 5: System.out.println("THURSDAY");
		break;
		case 6: System.out.println("FRIDAY");
		break;
		case 7: System.out.println("SATURDAY");
		break;
		default:System.out.println("Invalid Keyword");
		break;
		}
	}

}
