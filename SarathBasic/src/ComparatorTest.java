import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest{    
	  

public static void main(String args[]){    
ArrayList<ComparatorTest1> al=new ArrayList<ComparatorTest1>();    
al.add(new ComparatorTest1(101,"Vijay",23));    
al.add(new ComparatorTest1(106,"Ajay",27));    

Collections.sort((List<T>) al);    
for(ComparatorTest1 st:al){    
System.out.println(st.number+" "+st.name+" "+st.age);    
}




}  
class ComparatorTest1 implements Comparable<ComparatorTest>  {
	
	
	int number;
	String name;
	int age;
	
	
	
	
	
	
	ComparatorTest1(int number,String name,int age)
	{
		this.number=number;
		this.age=age;
		this.name=name;
	}
	
	public int compareTo(ComparatorTest1 a)
	{
		if(age==a.age)
			return 0;
		else if(age>a.age)
			return 1;
		else
			return -1;
		
		
		
	}

	@Override
	public int compareTo(ComparatorTest1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
			
	
}



}    

	
	  

