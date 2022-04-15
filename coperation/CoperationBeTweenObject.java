package coperation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


// 객체간의 협업
/*				학생의 용돈 : 100,000원
		학생		: 				버스탈떄 (-1000)  , 지하철 탈떄 (-1500)
		버스   	: 1000원			승객수 증가 , 수입 증가
		지하철 	: 1500원			승객수 증가 , 수입 증가

*/

class Student {
	String StudentName ;   // 학생이름
	int money ;     // 가지고 있는 돈  ,  초기값 100,000
	
	Student(String a , int b){
		StudentName = a;
		money = b;
	}
	
	// 학생이 버스를 탔을떄 
	public void takeBus(Bus bus) {		
		money -= 1000;
		bus.take(1000);
		System.out.println(StudentName+"님 " + bus.busName+"번 버스를 탑승했습니다");
		System.out.println(StudentName + "님의 남은돈은 " + money + "입니다");
		System.out.println("버스 " + bus.busName+"번의 승객은 "+ bus.passengerCount + "명이고 수입은 " +bus.money+ "입니다");
	}
	
	// 버스 내릴떄
	public void takeOut(Bus bus) {		
		bus.takeout();
		System.out.println(StudentName+"님 " + bus.busName+"번 버스를 하차했습니다");
		System.out.println(StudentName + "님의 남은돈은 " + money + "입니다");
		System.out.println("버스 " + bus.busName+"번의 승객은 "+ bus.passengerCount + "명이고 수입은 " +bus.money+ "입니다");
	}
	
	// 지하철 탈떄
	public void takeSubway(Subway subway) {		
		money -= 1500;
		subway.take(1500);
		System.out.println(StudentName + "님 " + subway.lineNumber +" 호선 지하철에 탑승했습니다");
		System.out.println(StudentName + "님의 남은돈은 " + money + "입니다");
		System.out.println("지하철 " + subway.lineNumber + "호선의 승객은 " + subway.passengerCount + "명이고 수입은" + subway.money + "입니다");
	}
	
	// 지하철 내릴때
	public void takeOut(Subway subway) {		
		subway.takeout();
		System.out.println(StudentName + "님 " + subway.lineNumber +" 호선 지하철에서 하차했습니다");
		System.out.println(StudentName + "님의 남은돈은 " + money + "입니다");
		System.out.println("지하철 " + subway.lineNumber + "호선의 승객은 " + subway.passengerCount + "명이고 수입은" + subway.money + "입니다");
	}
	
	
	@Override
	public String toString() {
		return StudentName + "   잔액 "  + money + "원";
	}
	
	
	
}




class Bus{
	
	int busName ;    // 100번버스 , 200번버스    <== 인풋값을 받아서 버스이름 지정  , 생성자
	int passengerCount;
	int money;    // 버스수입
	
	Bus (int name){
		busName = name;
	}
	
	public void take (int money) {	// 버스의 수입을 처리 , 승객수를 처리 
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
	int money ;   // 지하철 수입
	
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
			System.out.println("1. 학생정보 입력  | 2. 학생정보 출력 및 선개");
			System.out.println("3. 버스를탐 | 4. 버스를 내림 | 5. 지하철을 탐 . | 6 지하철을 내림 . | 7. 종료");
			System.out.println("==================================================================================");
			System.out.println("선택>>");
			int num = sc.nextInt();
			
			// 학생정보 입력
			if(num == 1) {
				
				System.out.print("학생이름>>");
				String name = sc.next();
				System.out.println("돈 입력>>");
				int money = sc.nextInt();
				
				Student student = new Student(name , money);
				studentlist.add(student);
				
				System.out.println("학생정보가 입력되었습니다");
				
			// 학생정보 출력	
			}else if(num == 2){
				
				System.out.println("=======학생정보 출력==========");
				for(Student s : studentlist) {
					System.out.println(s);
				}
				
			
			// 버스 탐 
			}else if(num == 3){
				System.out.println("학생선택(이름입력)>>");
				String name = sc.next();
				
				Student student = null;
				for(int i = 0 ; i < studentlist.size() ; i ++) {
					if(name.equals(studentlist.get(i).StudentName)) {
						student = studentlist.get(i);
					}
				}
				
				System.out.println("버스선택(버스번호 입력)>>");
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
			
			
				
			// 버스 내림 	
			}else if(num == 4){
				System.out.println("학생선택(이름입력)>>");
				String name = sc.next();
				
				Student student = null;
				for(int i = 0 ; i < studentlist.size() ; i ++) {
					if(name.equals(studentlist.get(i).StudentName)) {
						student = studentlist.get(i);
					}
				}
				
				System.out.println("버스선택(버스번호 입력)>>");
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
				
				
			// 지하철 탑승	
			}else if(num == 5){
				System.out.println("학생선택(이름입력)>>");
				String name = sc.next();
				
				Student student = null;
				for(int i = 0 ; i < studentlist.size() ; i ++) {
					if(name.equals(studentlist.get(i).StudentName)) {
						student = studentlist.get(i);
					}
				}
				
				System.out.println("지하철 호선 선택>>");
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
				
			// 지하철 내림	
			}else if(num == 6){
				
				System.out.println("학생선택(이름입력)>>");
				String name = sc.next();
				
				Student student = null;
				for(int i = 0 ; i < studentlist.size() ; i ++) {
					if(name.equals(studentlist.get(i).StudentName)) {
						student = studentlist.get(i);
					}
				}
				
				System.out.println("지하철 호선 선택>>");
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
				
			
				
			// 종료	
			}else if(num == 7){
				System.out.println(" 종료 ");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
