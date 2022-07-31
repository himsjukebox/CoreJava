package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Himanshu");
		list1.add("Renu");
		list1.add("Krishaan");
		list1.add("Aditi");
		list1.add("Baloo");
		
		System.out.println("The list is " + list1);
		System.out.println("Size of arraylist is "+ list1.size());
		
		list1.remove(4);
		System.out.println("The list is " + list1);
		System.out.println("Size of arraylist is "+ list1.size());
		
		System.out.println("Name at position 4 is " + list1.get(3));
		
		list1.set(0, "Baloo");
		System.out.println("List after replacing is " + list1);
		
		list1.add(0, "Himanshu Maurya");
		System.out.println("List after replacing is " + list1);
		
		Collections.sort(list1);
		System.out.println("List after sorting is " + list1);
		
		Collections.reverse(list1);
		System.out.println("List after reversing is " + list1);
		
		for(String name : list1) {
			System.out.println(name);
		}
		System.out.println("******************************");
		for (int i=0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
			if(list1.get(i).equals("Baloo")) {
				System.out.println("Baloo is at position"+ (i+1));
				break;
			}
		}
		
	}
	
}
