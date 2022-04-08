package chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

// �̸��� ���̸� �Է½� �̸��� ���� �������� ����ϵ��� �����ϴ� 
// 1. Comparable <E> �� compareTo() �޼ҵ� ������
			//������ ��ü ������ �ʿ�
//2. Comparator<E> �� compare() ����
		// ������ ��ü�� �������� ���� 

class Abc{
	String name;		// <<== �ķ��� ���� �÷�. ������������ 
						//  ȫ�浿 , �̼��� , ������  ===> ������ , �̼��� , ȫ�浿
	int age;			//  ����
	
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
		
		// compare() ����
		
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
		
		Abc a1 = new Abc("�̼���" , 40);
		Abc a2 = new Abc("������" , 30);
		Abc a3 = new Abc("ȫ�浿" , 20);
		
		t.add(a1);
		t.add(a2);
		t.add(a3);
		System.out.println(t);
		
		System.out.println("=====================================");
		// compartTo() ������
		TreeSet<Abc_T> at = new TreeSet();
		
		Abc_T  at1 = new Abc_T("ȫ�浿" , 20);
		Abc_T  at2 = new Abc_T("������" , 30);
		Abc_T  at3 = new Abc_T("�̼���" , 40);
		
		at.add(at1);
		at.add(at2);
		at.add(at3);
		System.out.println(at);
		
		
		
		

	}

}
