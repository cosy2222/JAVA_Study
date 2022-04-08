package chap17.Ex12;

import java.util.Comparator;
import java.util.TreeMap;

//TreeMap <K,V> : Key 가 정렬되어서 처리 < 오름차순 정렬> 
	// Key : 일반 객체를 사용할 경우 , Comparable compareTo(), COmprator<E> compare() 재정의가 필요

class MyClass{
	int data1;
	int data2;
	public MyClass(int data1 , int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return data1 + " 값 출력 " ;
	}
}

//Comparable<E> 인터페이스의 compareTo() 재정의한 클ㄹ래스 
class MyComParableClass implements Comparable<MyComParableClass>{
	
	int data1;
	int data2;
	public MyComParableClass(int data1 , int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return data1 + " 값 출력 " ;
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

		// 1. MyClass 를 TreeMap의 key로 인풋 할 경우  : 실행시 오류
/*
		TreeMap <MyClass , String> treemap1 = new TreeMap();
		MyClass m1 = new MyClass(2,5);
		MyClass m2 = new MyClass(3,3);
		
		treemap1.put(m1, "첫번쨰");	// Comparable, Comparator를 구현하지 않았는데, treeMap의 key로 사용  실행시 오류
		treemap1.put(m2, "두번쨰");
		
		System.out.println(treemap1);
*/		
		
		// 2. Comparable를 구현한 클래스를 사용
		TreeMap <MyComParableClass , String> treemap2 = new TreeMap();
		
		MyComParableClass m3 = new MyComParableClass(2, 5);
		MyComParableClass m4 = new MyComParableClass(3, 3);
		MyComParableClass m5 = new MyComParableClass(10, 5);
		
		treemap2.put(m3, "첫번쨰");
		treemap2.put(m5, "세번쨰");
		treemap2.put(m4, "두번쨰");
		
		System.out.println(treemap2);
		System.out.println(treemap2.size());
		
		//3. Comparator 를 구현
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
		
		treemap3.put(m6, "첫번쨰");
		treemap3.put(m7, "두번쨰");
		
		System.out.println(treemap3);
		
	}

}
