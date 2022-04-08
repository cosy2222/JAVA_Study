package chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

// TreeSet의 잇점 : 1. 중복저장되지 않는다  2. 오름차순 정렬되어 입력  3. 정렬되어 출력 (오름차순) 4. 검색기능을 사용
//				   5. 특정범위의 값을 추출가능  6. 정렬을 반대로 바꿀수 있다 descending(내림)  ascending(오름)

// TreeSet에 일반객체를 저장할 경우 , 특정 필드를 크기비교 기준필드가 존재해야한다 
//  	1. Comparable<E> 인터페이스의 compareTo() 메소드 : TreeSet에 일반 객체를 저장할떄 일반객체의 특정 필드를 재정의해야 한다.
//			기존의 클래스를 수정해서 사용 .  Comparable<E> 인터페이스를 상속후 compareTo() 메소드 재정의  
//			기존의 클래스를 수정
//		2. Comparator<E> 인터페이스 compare() 메소드를 재정의 함   <익명내부객체 사용>
//			기존의 객체를 수정하지 않고 사용할떄	
//			TreeSet<E> 객체를 생성할떄 생성자에 Comparator<E> 인터페이스를 구현한 익명객체를 생성

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

//Comparable<E> 인터페이스를 구현한 클래스 구선
class MyClass2 implements Comparable<MyClass2>{
	int data1 ;
	int data2 ;
	
	public MyClass2(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public int compareTo(MyClass2 o) {	// 객체의 크기비교 기준을 설정하는 메소드  <TreeSet에서 사용>
								// 오름차순 처리 방식 
		
		if(this.data1 < o.data1) {			// this.data1 기준 값이 작을경우 : -1
			return -1;
		}else if (this.data1 == o.data1) {	// this.data1 기준 값이 같을 경우 : 0
			return 0;
		}else {								// this.data1 기준 값이 클 경우 : 1 
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
		
		// wrapper 클래스는 comparable<E> 인터페이스의 comparato() 메소드를 재정의 하고 있다 
			//  wrapper 클래스의 값을 TreeSet에 넣으면 정렬되어 저장. 
		
		//1. Integer wrapper 클래스의 크기비교 
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20);
		Integer intValue2 = new Integer(10);
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1);   // 오름차순 정렬
		
		//2. String wrapper 클래스의 크기 비교
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 =new String("가나");
		String str2 = "다라";
		
		treeSet2.add(str1);		// treeSet2.add()를 사용해서 객체를 저장할 경우 값의 크기를 비교하는 필드가 정의되어 있어야 한다 
		treeSet2.add(str2);		// str1 , str2 wrapper 클래스라 재정의 되어있다 
		
		System.out.println(treeSet2);
		
		//3. MyClass를 TreeSet에 저장하려면 compareTo()가 재정의 되어있어야 한다 
//		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
//		MyClass m1 = new MyClass(2,5);
//		MyClass m2 = new MyClass(3,3);
		
//		treeSet3.add(m1);	// TreeSet에는  Comparable<E>인터페이스의 compareTo() 메소드를 재정의한 클래스만 넣을수 있다 
//		treeSet3.add(m2);
		
//		System.out.println(treeSet3);		// 런타임 오류 
		
		//4. 방법 1 MyComparableClass 객체 크기 비교   
		TreeSet<MyClass2> treeSet3 = new TreeSet();
		
		MyClass2 m1 = new MyClass2(4,5);
		MyClass2 m2 = new MyClass2(3,6);
		
		treeSet3.add(m1);
		treeSet3.add(m2);
		
		System.out.println(treeSet3);
		
				
		// 5. 방법2 기존 객체를 수정하지 않고 TreeSet에 저장할경우 
		// TreeSet 생성자 내부에 Comparator<E> 인터페이스를 정의해서 익명객체로 구현 
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
