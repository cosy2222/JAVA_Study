package chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

// TreeSet�� ���� : 1. �ߺ�������� �ʴ´�  2. �������� ���ĵǾ� �Է�  3. ���ĵǾ� ��� (��������) 4. �˻������ ���
//				   5. Ư�������� ���� ���Ⱑ��  6. ������ �ݴ�� �ٲܼ� �ִ� descending(����)  ascending(����)

// TreeSet�� �Ϲݰ�ü�� ������ ��� , Ư�� �ʵ带 ũ��� �����ʵ尡 �����ؾ��Ѵ� 
//  	1. Comparable<E> �������̽��� compareTo() �޼ҵ� : TreeSet�� �Ϲ� ��ü�� �����ҋ� �Ϲݰ�ü�� Ư�� �ʵ带 �������ؾ� �Ѵ�.
//			������ Ŭ������ �����ؼ� ��� .  Comparable<E> �������̽��� ����� compareTo() �޼ҵ� ������  
//			������ Ŭ������ ����
//		2. Comparator<E> �������̽� compare() �޼ҵ带 ������ ��   <�͸��ΰ�ü ���>
//			������ ��ü�� �������� �ʰ� ����ҋ�	
//			TreeSet<E> ��ü�� �����ҋ� �����ڿ� Comparator<E> �������̽��� ������ �͸�ü�� ����

class MyClass{
	int data1 ;
	int data2 ;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return data1 + " " + data2;
	}
}

//Comparable<E> �������̽��� ������ Ŭ���� ����
class MyClass2 implements Comparable<MyClass2>{
	int data1 ;
	int data2 ;
	
	public MyClass2(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public int compareTo(MyClass2 o) {	// ��ü�� ũ��� ������ �����ϴ� �޼ҵ�  <TreeSet���� ���>
								// �������� ó�� ��� 
		
		if(this.data1 < o.data1) {			// this.data1 ���� ���� ������� : -1
			return -1;
		}else if (this.data1 == o.data1) {	// this.data1 ���� ���� ���� ��� : 0
			return 0;
		}else {								// this.data1 ���� ���� Ŭ ��� : 1 
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return data1 + " " + data2;
	}
}






public class TreeSetMethod_2 {

	public static void main(String[] args) {
		
		// wrapper Ŭ������ comparable<E> �������̽��� comparato() �޼ҵ带 ������ �ϰ� �ִ� 
			//  wrapper Ŭ������ ���� TreeSet�� ������ ���ĵǾ� ����. 
		
		//1. Integer wrapper Ŭ������ ũ��� 
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20);
		Integer intValue2 = new Integer(10);
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1);   // �������� ����
		
		//2. String wrapper Ŭ������ ũ�� ��
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 =new String("����");
		String str2 = "�ٶ�";
		
		treeSet2.add(str1);		// treeSet2.add()�� ����ؼ� ��ü�� ������ ��� ���� ũ�⸦ ���ϴ� �ʵ尡 ���ǵǾ� �־�� �Ѵ� 
		treeSet2.add(str2);		// str1 , str2 wrapper Ŭ������ ������ �Ǿ��ִ� 
		
		System.out.println(treeSet2);
		
		//3. MyClass�� TreeSet�� �����Ϸ��� compareTo()�� ������ �Ǿ��־�� �Ѵ� 
//		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
//		MyClass m1 = new MyClass(2,5);
//		MyClass m2 = new MyClass(3,3);
		
//		treeSet3.add(m1);	// TreeSet����  Comparable<E>�������̽��� compareTo() �޼ҵ带 �������� Ŭ������ ������ �ִ� 
//		treeSet3.add(m2);
		
//		System.out.println(treeSet3);		// ��Ÿ�� ���� 
		
		//4. ��� 1 MyComparableClass ��ü ũ�� ��   
		TreeSet<MyClass2> treeSet3 = new TreeSet();
		
		MyClass2 m1 = new MyClass2(4,5);
		MyClass2 m2 = new MyClass2(3,6);
		
		treeSet3.add(m1);
		treeSet3.add(m2);
		
		System.out.println(treeSet3);
		
				
		// 5. ���2 ���� ��ü�� �������� �ʰ� TreeSet�� �����Ұ�� 
		// TreeSet ������ ���ο� Comparator<E> �������̽��� �����ؼ� �͸�ü�� ���� 
		TreeSet<MyClass> treeSet4 = new TreeSet<MyClass>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if(o1.data1 < o2.data1) {
					return -1;
				}else if (o1.data1 == o2.data1) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		MyClass myc1 = new MyClass(2,5);
		MyClass myc2 = new MyClass(3,3);
		
		treeSet4.add(myc1);
		treeSet4.add(myc2);
		
		System.out.println(treeSet4);
		
		

	}

}
