package coperation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


// ��ü���� ����
/*				�л��� �뵷 : 100,000��
		�л�		: 				����Ż�� (-1000)  , ����ö Ż�� (-1500)
		����   	: 1000��			�°��� ���� , ���� ����
		����ö 	: 1500��			�°��� ���� , ���� ����

*/

class Student {
	String StudentName ;   // �л��̸�
	int money ;     // ������ �ִ� ��  ,  �ʱⰪ 100,000
	
	Student(String a , int b){
		StudentName = a;
		money = b;
	}
	
	// �л��� ������ ������ 
	public void takeBus(Bus bus) {		
		money -= 1000;
		bus.take(1000);
		System.out.println(StudentName+"�� " + bus.busName+"�� ������ ž���߽��ϴ�");
		System.out.println(StudentName + "���� �������� " + money + "�Դϴ�");
		System.out.println("���� " + bus.busName+"���� �°��� "+ bus.passengerCount + "���̰� ������ " +bus.money+ "�Դϴ�");
	}
	
	// ���� ������
	public void takeOut(Bus bus) {		
		bus.takeout();
		System.out.println(StudentName+"�� " + bus.busName+"�� ������ �����߽��ϴ�");
		System.out.println(StudentName + "���� �������� " + money + "�Դϴ�");
		System.out.println("���� " + bus.busName+"���� �°��� "+ bus.passengerCount + "���̰� ������ " +bus.money+ "�Դϴ�");
	}
	
	// ����ö Ż��
	public void takeSubway(Subway subway) {		
		money -= 1500;
		subway.take(1500);
		System.out.println(StudentName + "�� " + subway.lineNumber +" ȣ�� ����ö�� ž���߽��ϴ�");
		System.out.println(StudentName + "���� �������� " + money + "�Դϴ�");
		System.out.println("����ö " + subway.lineNumber + "ȣ���� �°��� " + subway.passengerCount + "���̰� ������" + subway.money + "�Դϴ�");
	}
	
	// ����ö ������
	public void takeOut(Subway subway) {		
		subway.takeout();
		System.out.println(StudentName + "�� " + subway.lineNumber +" ȣ�� ����ö���� �����߽��ϴ�");
		System.out.println(StudentName + "���� �������� " + money + "�Դϴ�");
		System.out.println("����ö " + subway.lineNumber + "ȣ���� �°��� " + subway.passengerCount + "���̰� ������" + subway.money + "�Դϴ�");
	}
	
	
	@Override
	public String toString() {
		return StudentName + "   �ܾ� "  + money + "��";
	}
	
	
	
}




class Bus{
	
	int busName ;    // 100������ , 200������    <== ��ǲ���� �޾Ƽ� �����̸� ����  , ������
	int passengerCount;
	int money;    // ��������
	
	Bus (int name){
		busName = name;
	}
	
	public void take (int money) {	// ������ ������ ó�� , �°����� ó�� 
		passengerCount ++;
		this.money +=  money;
	}
	
	public void takeout() {
		passengerCount--;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Bus) {
			if(busName == ((Bus)obj).busName) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(busName);
	}
	
}




class Subway{
	
	String lineNumber ;        
	int passengerCount;
	int money ;   // ����ö ����
	
	Subway (String a){
		lineNumber =a;
	}
	
	public void take (int money) {	 
		passengerCount ++;
		this.money +=  money;
	}
	
	public void takeout() {
		passengerCount--;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Subway) {
			if(lineNumber.equals(((Subway)obj).lineNumber)) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(lineNumber);
	}
	
}




public class CoperationBeTweenObject {
	
	static void find() {
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		ArrayList<Student> studentlist = new ArrayList<>();
		Set<Bus> busset = new HashSet<>();
		Set<Subway> subset = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==================================================================================");
			System.out.println("1. �л����� �Է�  | 2. �л����� ��� �� ����");
			System.out.println("3. ������Ž | 4. ������ ���� | 5. ����ö�� Ž . | 6 ����ö�� ���� . | 7. ����");
			System.out.println("==================================================================================");
			System.out.println("����>>");
			int num = sc.nextInt();
			
			// �л����� �Է�
			if(num == 1) {
				
				System.out.print("�л��̸�>>");
				String name = sc.next();
				System.out.println("�� �Է�>>");
				int money = sc.nextInt();
				
				Student student = new Student(name , money);
				studentlist.add(student);
				
				System.out.println("�л������� �ԷµǾ����ϴ�");
				
			// �л����� ���	
			}else if(num == 2){
				
				System.out.println("=======�л����� ���==========");
				for(Student s : studentlist) {
					System.out.println(s);
				}
				
			
			// ���� Ž 
			}else if(num == 3){
				System.out.println("�л�����(�̸��Է�)>>");
				String name = sc.next();
				
				Student student = null;
				for(int i = 0 ; i < studentlist.size() ; i ++) {
					if(name.equals(studentlist.get(i).StudentName)) {
						student = studentlist.get(i);
					}
				}
				
				System.out.println("��������(������ȣ �Է�)>>");
				int busName = sc.nextInt();
				Bus bus = new Bus(busName);
				busset.add(bus);
				
				Bus b = null;
				Iterator<Bus> ir = busset.iterator();
				while(ir.hasNext()) {
					Bus bb = ir.next();
					if(busName == bb.busName) {
						b = bb;
					}
				}
				
				student.takeBus(b);
			
			
				
			// ���� ���� 	
			}else if(num == 4){
				System.out.println("�л�����(�̸��Է�)>>");
				String name = sc.next();
				
				Student student = null;
				for(int i = 0 ; i < studentlist.size() ; i ++) {
					if(name.equals(studentlist.get(i).StudentName)) {
						student = studentlist.get(i);
					}
				}
				
				System.out.println("��������(������ȣ �Է�)>>");
				int busName = sc.nextInt();
				
				Bus b = null;
				Iterator<Bus> ir = busset.iterator();
				while(ir.hasNext()) {
					Bus bb = ir.next();
					if(busName == bb.busName) {
						b = bb;
					}
				}
				
				student.takeOut(b);
				
				
			// ����ö ž��	
			}else if(num == 5){
				System.out.println("�л�����(�̸��Է�)>>");
				String name = sc.next();
				
				Student student = null;
				for(int i = 0 ; i < studentlist.size() ; i ++) {
					if(name.equals(studentlist.get(i).StudentName)) {
						student = studentlist.get(i);
					}
				}
				
				System.out.println("����ö ȣ�� ����>>");
				String subName = sc.next();
				Subway subway = new Subway(subName);
				subset.add(subway);
				
				Subway s = null;
				Iterator<Subway> ir = subset.iterator();
				while(ir.hasNext()) {
					Subway ss = ir.next();
					if(subName.equals(ss.lineNumber)) {
						s = ss;
					}
				}
				
				student.takeSubway(s);
				
			// ����ö ����	
			}else if(num == 6){
				
				System.out.println("�л�����(�̸��Է�)>>");
				String name = sc.next();
				
				Student student = null;
				for(int i = 0 ; i < studentlist.size() ; i ++) {
					if(name.equals(studentlist.get(i).StudentName)) {
						student = studentlist.get(i);
					}
				}
				
				System.out.println("����ö ȣ�� ����>>");
				String subName = sc.next();
				
				Subway s = null;
				Iterator<Subway> ir = subset.iterator();
				while(ir.hasNext()) {
					Subway ss = ir.next();
					if(subName.equals(ss.lineNumber)) {
						s = ss;
					}
				}
				
				student.takeOut(s);
				
			
				
			// ����	
			}else if(num == 7){
				System.out.println(" ���� ");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
