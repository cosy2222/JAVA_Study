package chap17.Ex14;

import java.util.ArrayList;
import java.util.Scanner;

class Account{
	private String ano ;  // 계좌번호
	private String owner ;  // 이름
	private int balance;  // 통장금액 
	
	Account(String ano , String owner , int balance){
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
				
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balane) {
		this.balance = balane;
	}
	
	@Override
	public String toString() {
		return owner + " " + ano + " " + balance;
	}
	
	
}

public class BankAccountUsingArrayList {
	// 컬렉션ArrayList<E>를  사용해서 Account 객체 등록
	// 배열은 방의 크기가 고정 
	// 컬렉션은 방의 크기가 동적
	private static ArrayList<Account> alist = new ArrayList();
	private static Scanner scanner = new Scanner(System.in);

	
	
	
	
	private static void createAccount() {
		// 스캐너로 1.이름 , 2.계좌번호 , 3.초기통장 금액   객체를 배열에 저장
		System.out.println("-------------------");
		System.out.println("1. 계좌 생성");
		System.out.println("-------------------");
		System.out.println("계좌번호를 입력하세요>>");
		String ano = scanner.next();   
		System.out.println("이름을 입력 하세요>>");
		String owner = scanner.next();
		System.out.println("초기잔액을 입력하세요>>");
		int balance = scanner.nextInt();
		
		Account newA = new Account(ano , owner , balance);
		
		alist.add(newA);
		System.out.println("계좌생성 완료");
		
		
	}
	
	private static void accountList() {
		// 배열에 저장된 객체를 가져와서 계좌번호 , 이름 , 금액을 출력
		System.out.println("-------------------");
		System.out.println("2. 계좌 목록");
		System.out.println("-------------------");
		
		for(int i = 0 ; i < alist.size() ; i++) {
			Account a = alist.get(i);
			if (a != null) {
				System.out.print("이름 : " + a.getOwner() + " | ");
				System.out.print("계좌번호 : " + a.getAno() + " | ");
				System.out.println("잔액 : " + a.getBalance());
			}
		}
	}
	
	private static void deposit() {
		// 계좌번호를 받아서 객체에서 해당계좌번호를 찾고 , 금액을 인풋받아서 입금
		System.out.println("-------------------");
		System.out.println("3. 예금");
		System.out.println("-------------------");
		System.out.println("계좌번호 입력하세요 >>");
		String ano = scanner.next();
		System.out.println("입금할 금액을 입력하세요");
		int balance = scanner.nextInt();
		
		Account a = findAccount(ano);
		
		if(a == null) {
			System.out.println("존재하지 않는 계좌입니다");
			return;
		}
		a.setBalance(a.getBalance() + balance);
		System.out.println("입금하신금액은 : " + balance + "입니다");
		System.out.println("현재잔액은 : " + a.getBalance());
			
		
	}
	
	private static void withdraw() {
		// 계좌번호를 받아서 객체에서 해당계좌번호를 찾고 , 금액을 인풋받아서 출금
		System.out.println("-------------------");
		System.out.println("3. 출금");
		System.out.println("-------------------");
		System.out.println("계좌번호 입력하세요 >>");
		String ano = scanner.next();
		System.out.println("출금할 금액을 입력하세요");
		int balance = scanner.nextInt();
		
		Account a = findAccount(ano);
		
		if(a == null) {
			System.out.println("존재하지 않는 계좌입니다");
			return;
		}
		a.setBalance(a.getBalance() - balance);
		System.out.println("출금하신금액은 : " + balance + "입니다");
		System.out.println("현재잔액은 : " + a.getBalance());
	}
	
	
	// 배열에서 Account 객체 내의 ano 와 동일한 계좌를 찾아서 찾은 객체를 리턴해서 돌려줌 
	private static Account findAccount(String ano) {
		Account account = null ;
		for(int i = 0; i<alist.size() ; i++) {
			String Ano = alist.get(i).getAno();
			if(Ano.equals(ano)) {
				account = alist.get(i);
				break;
			}
		
		}
		
		return account;
	}
	

	public static void main(String[] args) {
		boolean run = true ;
		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택>>");
			int selectNO = scanner.nextInt();
			
			if(selectNO == 1) {
				createAccount(); // 메소드 호출
			}else if(selectNO == 2) {
				accountList();
			}else if(selectNO == 3) {
				deposit();
			}else if(selectNO == 4) {
				withdraw();
			}else if (selectNO == 5) {
				run = false;
			}
					
		}
		scanner.close();
		System.out.println("프로그램 종료");

	}

}
