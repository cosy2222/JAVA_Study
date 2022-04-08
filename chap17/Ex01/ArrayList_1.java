package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Java.lang ��Ű���� Ŭ�������� import �� �ʿ� ���� �ʴ� 

/*
 	
 	�÷��� : ������ �ڷ����� ����. ���� ũ�Ⱑ �������� ��ȭ.
 	�迭 	 : ������ �ڷ����� ���� .  ���� ũ�Ⱑ �����Ǿ� �ִ� .  �迭 ������ ���� ũ�⸦ ���� 
 		   ���� ũ��� ���� �Ұ� .
  
  
 	List<E> : �������̽�, ���ʸ� �������̽� : �پ��� ������ Ÿ���� ��� ����
 	 	: �ε����� ������ �ִ�.   ���� ũ��� �������� ��ȭ�Ѵ� 
 	 	
 	 	
 		- ArrayList<E> : �̱� ������ ȯ�濡�� ���. �˻��� ������ ���� �߰��ϰų� �����ҋ� ���� 
 		- Vactor<E>	   : ��Ƽ ������ ȯ�濡�� ���. ���޼ҵ尡 ����ȭ �Ǿ� �ִ�.
 		- LinkedList<E>	: �˻��� ������ ���� �߰��� ������ ������.
 
*/
public class ArrayList_1 {

	public static void main(String[] args) {
		
		//1. �迭
		String[] array = new String [] { "��" , "��" , "��", "��","��","��","��"};
		System.out.println(array.length);
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);
		
		// Arrays.toString (�迭����)
		System.out.println(Arrays.toString(array));
		
		// for���� ����ؼ� ���
		for(int i = 0 ; i < array.length ; i++) {
			if(i == array.length-1) {
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + " , ");
			}
		}
		
		// ���� for��
		for(String k : array) {
			System.out.print(k + " , ");
		}
		System.out.println();
		System.out.println("==========================");
		
		
		//2. List : �������̽�,  ��ü�����Ұ� , Ÿ���� ��������
		
		List<String> aList = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList<>();
		
		// List���� ���� ���� ��� : .size();  
		System.out.println(aList.size());
		
		// List�� ���� �Ҵ� �ϱ� : .add(��);
		aList.add("��");aList.add("��");aList.add("��");aList.add("��");
		aList.add("��");aList.add("��");aList.add("��");
		
		//List�� ����� �������� ���� ���ϱ�
		System.out.println(aList.size());
		
		// List�� ����� ���� ���� : .remove(������ ����)
		aList.remove("��");
		aList.remove("��");
		System.out.println(aList.size());	// List�� ���� �����ϸ� ����ũ�Ⱑ �پ��� 
		
		// List�� index�� ������ �ִ� .  for�� ���
		for(int i = 0 ; i < aList.size() ; i ++) {
			System.out.print(aList.get(i) + " "); // List�� .get()���� ���� �ҷ��´�
		}
		
		System.out.println();
		//���� for�� ���
		for(String k : aList) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// ��ü�� .toString �� ȣ���ؼ� ���
		System.out.println(aList);  // List�� toString �޼ҵ尡 ������ �Ǿ��ִ�
		System.out.println(aList.toString());
		
		
		
		
		
		

	}

}
