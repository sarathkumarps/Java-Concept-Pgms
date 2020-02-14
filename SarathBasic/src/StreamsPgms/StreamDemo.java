package StreamsPgms;

import java.util.*;
import java.util.ArrayList;

public class StreamDemo {
	public static void main(String[] args) {
		
		List <Product> list1=new ArrayList<Product>();
		list1.add(new Product(125,"Soap",2200f));
		list1.add(new Product(152,"Paste",4200f));
		list1.add(new Product(154,"Shampoo",5200f));
		list1.add(new Product(159,"Book",200f));
		list1.stream();
		 long count =list1.stream().filter(product->product.price<200).count();  
		 System.out.println(count);
		 
	}

}
