package ListPrograms;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Spliterator;

public class ArrayMethods {
	
	
	
	public static void main(String[] args) 
	
	{
		ArrayList l1=new ArrayList();//non generic
		
		l1.add("Hai");
		l1.add("hello");
		l1.add(11);
		System.out.println(l1);
		
		ArrayList <String> l2=new ArrayList<String>(); //Generic
		l2.add("Hai");
		l2.add("hai");
		l2.add(2, "Hi");
		
		
		System.out.println(l2.get(2));
		l2.addAll(l1);
		System.out.println(l2);
		l2.clear();
		System.out.println("Cleared List content  "+l2);
		System.out.println("L1 and L2 has Common Contents  "+  l1.equals(l2));
		System.out.println("Hash Code Of L1= "+l1.hashCode());
		boolean a=l1.isEmpty();
		System.out.println("Bool a= "+a);
		System.out.println("Content is empty "+l1.isEmpty());
		ArrayList <String> l3=new ArrayList<String>();
		l3.addAll(l1);
		l3.add("world");
		System.out.println(l3);
		l3.set(2,"hh");
		Collections.replaceAll(l3,"hh","HHH");
		System.out.println(l3);
//		Spliterator <String> l4 = l3.Spliterator(); 
//		  System.out.println(l4);
		
		
		
	}

}
