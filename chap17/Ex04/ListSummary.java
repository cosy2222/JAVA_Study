package chap17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {

	public static void main(String[] args) {
		
		//1. ArrayList
		List<String> arraylist = new ArrayList();
		arraylist.add("다");arraylist.add("마");
		arraylist.add("나");arraylist.add("가");
		System.out.println(arraylist);
		
		//2. Vector
		List<String> vector = new Vector();
		vector.add("다");vector.add("마");
		vector.add("나");vector.add("가");
		System.out.println(vector);
		
		//3. LinkedList
		List<String> linkedlist = new LinkedList();
		linkedlist.add("다");linkedlist.add("마");
		linkedlist.add("나");linkedlist.add("가");
		System.out.println(linkedlist);
	}

}
