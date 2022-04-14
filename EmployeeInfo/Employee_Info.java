package EmployeeInfo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.TreeSet;

class Employee{	// 사원의 정보를 담는 클래스
	
	int empNo;  //사원번호
    String empName; //사원이름
	String phone;	// 연락처
	int age ;		//나이
	String dept ;	//부서
	String compRank;//직급
	
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
	
	// treeset 생성
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
	
	// 1. 사원 신규등룍
	static void menu_1() {
		System.out.print("사번 : ");
		int no = sc.nextInt();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("부서 : ");
		String dept = sc.next();
		
		System.out.print("직급 : ");
		String compRank = sc.next();
		
		System.out.print("연락처 : ");
		String phone = sc.next();
		
		Employee e = new Employee(no, name, phone, age, dept, compRank);
		
		tree.add(e);
		
		System.out.println(name + "님의 정보가 정상적으로 입력 되었습니다");
	}
	
	// 2 사원정보 검색
	static void menu_2() {
		System.out.println("사번  이름  나이  부서  직급  연락처");
		Iterator<Employee> ir = tree.iterator();
		
		while(ir.hasNext()) {
			Employee e = ir.next();
			if(e != null) {
				System.out.println(e);
			}
		}
	}
	
	// 3. 사원정보 수정
	static void menu_3() {

		System.out.println("수정할 사번 : ");
		int aa = sc.nextInt();
		Employee e = find(aa);
		if (e == null) {
			System.out.println("잘못된 사번 입니다");
			return;
		}
		
		System.out.println("수정할 필드 선택 [1.연락처, 2.나이, 3.부서 , 4.직급]");
		int bb = sc.nextInt();
		if(bb == 1) {
			System.out.println("새로운 연락처를 입력하세요 > ");
			String new1 = sc.next();
			e.phone = new1;
		}else if(bb == 2) {
			System.out.println("나이를 입력하세요> ");
			int new2 = sc.nextInt();
			e.age = new2;
		}else if(bb == 3) {
			System.out.println("부서를 입력하세요");
			String new3 = sc.next();
			e.dept = new3;
		}else if(bb == 4) {
			System.out.println("직급을 입력하세요");
			String new4 = sc.next();
			e.compRank = new4;
		}
		
	}
	
	// 4. 사원정보 삭제
	static void menu_4() {
		System.out.println("삭제할 사번 : ");
		int a = sc.nextInt();
		Employee e = find(a);
		if (e == null) {
			System.out.println("잘못된 사번 입니다");
			return;
		}
		System.out.println(e.empName + " 사원이 삭제 되었습니다");
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
			System.out.println("========사원관리 프로그램============");
			System.out.println("# 1. 사원정보 신규등록");
			System.out.println("# 2. 사원정보 검색");
			System.out.println("# 3. 사원정보 수정");
			System.out.println("# 4. 사원정보 삭제");
			System.out.println("# 5. 프로그램 종료");
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
				System.out.println("프로그램 종료");
				break;
			}
		
		}
		
		

	}

}
