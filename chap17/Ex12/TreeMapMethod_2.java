package chap17.Ex12;

import java.util.Comparator;
import java.util.TreeMap;

//TreeMap <K,V> : Key �� ���ĵǾ ó�� < �������� ����> 
	// Key : �Ϲ� ��ü�� ����� ��� , Comparable compareTo(), COmprator<E> compare() �����ǰ� �ʿ�

class MyClass{
	int data1;
	int data2;
	public MyClass(int data1 , int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return data1 + " �� ��� " ;
	}
}

//Comparable<E> �������̽��� compareTo() �������� Ŭ������ 
class MyComParableClass implements Comparable<MyComParableClass>{
	
	int data1;
	int data2;
	public MyComParableClass(int data1 , int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return data1 + " �� ��� " ;
	}

	@Override
	public int compareTo(MyComParableClass o) {
		if ( this.data1 < o.data1) {
			return -1;
		}else if (this.data1 == o.data1) {
			return 0;
		}else {
			return 1;
		}
	}
	
}

public class TreeMapMethod_2 {

	public static void main(String[] args) {

		// 1. MyClass �� TreeMap�� key�� ��ǲ �� ���  : ����� ����
/*
		TreeMap <MyClass , String> treemap1 = new TreeMap();
		MyClass m1 = new MyClass(2,5);
		MyClass m2 = new MyClass(3,3);
		
		treemap1.put(m1, "ù����");	// Comparable, Comparator�� �������� �ʾҴµ�, treeMap�� key�� ���  ����� ����
		treemap1.put(m2, "�ι���");
		
		System.out.println(treemap1);
*/		
		
		// 2. Comparable�� ������ Ŭ������ ���
		TreeMap <MyComParableClass , String> treemap2 = new TreeMap();
		
		MyComParableClass m3 = new MyComParableClass(2, 5);
		MyComParableClass m4 = new MyComParableClass(3, 3);
		MyComParableClass m5 = new MyComParableClass(10, 5);
		
		treemap2.put(m3, "ù����");
		treemap2.put(m5, "������");
		treemap2.put(m4, "�ι���");
		
		System.out.println(treemap2);
		System.out.println(treemap2.size());
		
		//3. Comparator �� ����
		TreeMap <MyClass , String> treemap3 = new TreeMap(new Comparator<MyClass>() {

			@Override
			public int compare(MyClass o1, MyClass o2) {
				if ( o1.data1 < o2.data1) {
					return -1;
				}else if (o1.data1 == o2.data1) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		MyClass m6 = new MyClass(2,5);
		MyClass m7 = new MyClass(3,3);
		
		treemap3.put(m6, "ù����");
		treemap3.put(m7, "�ι���");
		
		System.out.println(treemap3);
		
	}

}
