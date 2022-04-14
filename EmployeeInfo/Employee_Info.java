package EmployeeInfo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.TreeSet;

class Employee{	// ����� ������ ��� Ŭ����
	
	int empNo;  //�����ȣ
    String empName; //����̸�
	String phone;	// ����ó
	int age ;		//����
	String dept ;	//�μ�
	String compRank;//����
	
	Employee(int a , String b , String c, int d , String e , String f){
		empNo=a;
		empName=b;
		phone=c;
		age=d;
		dept=e;
		compRank=f;
	}
	
	@Override
	public String toString() {
		return empNo + "  " +empName +" "+ age+"  " + dept+" " + compRank+" " + phone;
	}
	
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof Employee) {
				if(empNo == ((Employee)obj).empNo) {
					return true;
				}
			}
			
			return false;
		}
	
	@Override
		public int hashCode() {
			return Objects.hash(empNo);
		}
	
	
	
	
}

public class Employee_Info {
	
	// treeset ����
	static TreeSet<Employee> tree = new TreeSet<>(new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			
			if(o1.empNo < o2.empNo) {
				return -1;
			}else if (o1.empNo == o2.empNo) {
				return 0;
			}else  {
				return 1;
			}
		}
	});
	
	static Scanner sc = new Scanner(System.in);
	
	// 1. ��� �űԵ
	static void menu_1() {
		System.out.print("��� : ");
		int no = sc.nextInt();
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("�μ� : ");
		String dept = sc.next();
		
		System.out.print("���� : ");
		String compRank = sc.next();
		
		System.out.print("����ó : ");
		String phone = sc.next();
		
		Employee e = new Employee(no, name, phone, age, dept, compRank);
		
		tree.add(e);
		
		System.out.println(name + "���� ������ ���������� �Է� �Ǿ����ϴ�");
	}
	
	// 2 ������� �˻�
	static void menu_2() {
		System.out.println("���  �̸�  ����  �μ�  ����  ����ó");
		Iterator<Employee> ir = tree.iterator();
		
		while(ir.hasNext()) {
			Employee e = ir.next();
			if(e != null) {
				System.out.println(e);
			}
		}
	}
	
	// 3. ������� ����
	static void menu_3() {

		System.out.println("������ ��� : ");
		int aa = sc.nextInt();
		Employee e = find(aa);
		if (e == null) {
			System.out.println("�߸��� ��� �Դϴ�");
			return;
		}
		
		System.out.println("������ �ʵ� ���� [1.����ó, 2.����, 3.�μ� , 4.����]");
		int bb = sc.nextInt();
		if(bb == 1) {
			System.out.println("���ο� ����ó�� �Է��ϼ��� > ");
			String new1 = sc.next();
			e.phone = new1;
		}else if(bb == 2) {
			System.out.println("���̸� �Է��ϼ���> ");
			int new2 = sc.nextInt();
			e.age = new2;
		}else if(bb == 3) {
			System.out.println("�μ��� �Է��ϼ���");
			String new3 = sc.next();
			e.dept = new3;
		}else if(bb == 4) {
			System.out.println("������ �Է��ϼ���");
			String new4 = sc.next();
			e.compRank = new4;
		}
		
	}
	
	// 4. ������� ����
	static void menu_4() {
		System.out.println("������ ��� : ");
		int a = sc.nextInt();
		Employee e = find(a);
		if (e == null) {
			System.out.println("�߸��� ��� �Դϴ�");
			return;
		}
		System.out.println(e.empName + " ����� ���� �Ǿ����ϴ�");
		tree.remove(e);
	}
	
	static Employee find(int a) {
		Employee e = null ;
		Iterator<Employee> ir = tree.iterator();
		while(ir.hasNext()) {
			Employee ee = ir.next();
			if(ee.empNo == a) {
				e = ee;
				return e;
			}
		}
		
		return e;
	}
	
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("========������� ���α׷�============");
			System.out.println("# 1. ������� �űԵ��");
			System.out.println("# 2. ������� �˻�");
			System.out.println("# 3. ������� ����");
			System.out.println("# 4. ������� ����");
			System.out.println("# 5. ���α׷� ����");
			System.out.println("================================");
			
			int a =sc.nextInt();
			
			if(a==1) {
				menu_1();
			}else if(a==2){
				menu_2();
			}else if(a==3) {
				menu_3();
			}else if(a==4) {
				menu_4();
			}else if(a==5) {
				System.out.println("���α׷� ����");
				break;
			}
		
		}
		
		

	}

}
