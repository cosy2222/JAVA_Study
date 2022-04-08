package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {
		
		// 1. List ���� Ŭ������ �����ڸ� ����Ͽ� ��ü ����
		// List�� �������̽� �̹Ƿ� new Ű �ڿ� �ü�����.  Ÿ������ ������ ���� 
		// capacity : �޸��� ���� ũ�⸦ �Ҵ� , �⺻���� 10
		// size() : �濡 ����� ���� ���� 
		
		List<Integer> aList1 = new ArrayList<>();	// capacity = 0
		List<Integer> aList2 = new ArrayList<>(30);  // capacity = 30
		
		List<Integer> aList3 = new Vector();
		List<Integer> aList4 = new Vector(30);
		
		List<Integer> aList5 = new LinkedList<>();
//		List<Integer> aList6 = new LinkedList<>(30);  LinkedList�� ������� �Ҵ�Ұ�
		
		
		// 2. Arrays Ŭ������ ���� �޼ҵ带 �̿� �ϴ� ��� : ������ ũ�⸦ �ٲܼ� ���� .
				//  ���� , ���� , �Ϸ�  <== ������ ���� ���� �Ҷ� ���
		
		List<Integer> aList7 = Arrays.asList(1,2,3,4); // ������ ���� ����
		List<String> aList8 = Arrays.asList("��","ȭ","��","��","��","��","��"); // ������ ���� ����
		aList7.set(1, 7);   // set() : ������ ���� �����Ҷ� ���  , index 1�� 7�� �Ҵ��ϰڴ�
//		aList7.add(5);		// �����߻� ����� ����  ������ũ�� �ٲܼ�����
		
		aList8.set(0, "��");
		
		System.out.println(aList7);
		System.out.println(aList8);
		
		
		
		
		
		
	}

}