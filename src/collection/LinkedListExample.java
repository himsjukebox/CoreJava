package collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Himanshu");
		list1.add("Renu");
		list1.add("Krishaan");
		list1.add("Aditi");
		list1.add("Baloo");

		System.out.println("The list is " + list1);
		System.out.println("Size of arraylist is "+ list1.size());
		
		list1.addFirst("Mummy");
		System.out.println("The list is " + list1);
		
		list1.addLast("Papa");
		System.out.println("The list is " + list1);
	}

}
