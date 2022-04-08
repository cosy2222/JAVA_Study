package chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

// 이름과 나이를 입력시 이름을 오름 차순으로 출력하도록 구현하다 
// 1. Comparable <E> 의 compareTo() 메소드 재정의
			//기존의 객체 수정이 필요
//2. Comparator<E> 의 compare() 구현
		// 기존의 객체를 수정없이 구현 

class Abc{
	String name;		// <<== 컴럼이 정렬 컬럼. 오름차순정렬 
						//  홍길동 , 이순신 , 강감찬  ===> 강감찬 , 이순신 , 홍길동
	int age;			//  나이
	
	Abc(String a , int b){
		name = a;
		age = b;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
	
}


class Abc_T implements Comparable<Abc_T>{
	String name;
	int age;
	
	Abc_T(String a , int b){
		name = a;
		age = b;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
	
	
	@Override
	public int compareTo(Abc_T o) {
		if(this.name.hashCode() < o.name.hashCode()) {
			return -1;
		}else if(this.name.hashCode() == o.name.hashCode()) {
			return 0;
		}else {
			return 1;
		}
	}
	
}

public class TreeSetMethod3 {

	public static void main(String[] args) {
		
		// compare() 구현
		
		TreeSet<Abc> t = new TreeSet(new Comparator<Abc>() {
			@Override
			public int compare(Abc o1, Abc o2) {
				if(o1.name.hashCode() < o2.name.hashCode()) {
					return -1;
				}else if(o1.name.hashCode() == o2.name.hashCode()) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		Abc a1 = new Abc("이순신" , 40);
		Abc a2 = new Abc("강감찬" , 30);
		Abc a3 = new Abc("홍길동" , 20);
		
		t.add(a1);
		t.add(a2);
		t.add(a3);
		System.out.println(t);
		
		System.out.println("=====================================");
		// compartTo() 재정의
		TreeSet<Abc_T> at = new TreeSet();
		
		Abc_T  at1 = new Abc_T("홍길동" , 20);
		Abc_T  at2 = new Abc_T("강감찬" , 30);
		Abc_T  at3 = new Abc_T("이순신" , 40);
		
		at.add(at1);
		at.add(at2);
		at.add(at3);
		System.out.println(at);
		
		
		
		

	}

}
