package CompareToImplement;

import java.util.Comparator;

public class ComparaterTestr implements Comparator<Student>{

	public int compare(Student s1,Student s2){  
		return s1.name.compareTo(s2.name);  
		}

	
}
