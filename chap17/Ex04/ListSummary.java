package chap17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {

	public static void main(String[] args) {
		
		//1. ArrayList
		List<String> arraylist = new ArrayList();
		arraylist.add("��");arraylist.add("��");
		arraylist.add("��");arraylist.add("��");
		System.out.println(arraylist);
		
		//2. Vector
		List<String> vector = new Vector();
		vector.add("��");vector.add("��");
		vector.add("��");vector.add("��");
		System.out.println(vector);
		
		//3. LinkedList
		List<String> linkedlist = new LinkedList();
		linkedlist.add("��");linkedlist.add("��");
		linkedlist.add("��");linkedlist.add("��");
		System.out.println(linkedlist);
	}

}
