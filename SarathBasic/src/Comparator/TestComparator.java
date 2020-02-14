package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
	
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> al=new ArrayList<Student> ();
		
		al.add(new Student(1,"Ajay",14));
		al.add(new Student(6,"tony",52));
		al.add(new Student(5,"Sarath",21));
		
		System.out.println("Name Sorting");
		
		Collections.sort(al,new NameComparator());
		for(Student st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		System.out.println("");
		System.out.println("Age Sorting");
		Collections.sort(al,new AgeComparator());
		for(Student st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
