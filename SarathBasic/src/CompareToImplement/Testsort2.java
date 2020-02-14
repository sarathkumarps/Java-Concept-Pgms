package CompareToImplement;

import java.util.ArrayList;
import java.util.Collections;

public class Testsort2{    
public static void main(String args[]){    
ArrayList<Student> al=new ArrayList<Student>();    
al.add(new Student(5,"Raju",23));    
al.add(new Student(16,"Madhu",28));    
al.add(new Student(7,"sankar",21));    
    
Collections.sort(al);    
for(Student st:al){    
System.out.println(st.rollno+" "+st.name+" "+st.age);    
}    
}    
}





