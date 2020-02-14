package CompareToImplement;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(2,"anish",35));
		al.add(new Student(5,"Dal",56));
		
		al.add(new Student(1,"baak",6));
		System.out.println("Sorting Name");
		Collections.sort(al,new ComparaterTestr());
		for(Student st :al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age); 
		}
	}

}
