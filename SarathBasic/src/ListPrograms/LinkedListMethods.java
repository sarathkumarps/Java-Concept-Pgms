package ListPrograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethods {
	
	
	
	public static void main(String[] args) 
		
	{
	      LinkedList <String> list1=new LinkedList <String>();
	      list1.add("hello");
	      list1.add("Hai");
	      System.out.println(list1);
		list1.addFirst("first");
		list1.addLast("last");
		System.out.println(list1);
		list1.pop();
		System.out.println(list1);
		list1.push("pushed");
		System.out.println(list1);
		System.out.println(list1.peek());
		list1.poll();
		System.out.println(list1);
		String a[]=list1.toArray(new String[0]);
		for(String x :a)
		{
			System.out.println(x);
		}
		ListIterator<String> iter=list1.listIterator();
		System.out.println("iterator \n");
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
//	System.out.println(("iter \n"+iter));
		
	}

	
	
	
	
}
