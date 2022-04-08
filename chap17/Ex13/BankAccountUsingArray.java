package chap17.Ex13;

import java.util.Scanner;


class Account{
	private String ano ;  // 계좌번호
	private String owner ;  // 이름
	private int balance;  // 통장금액 
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

public class BankAccountUsingArray {
	// 배열을 사용해서 Account 객체 등록
	private static Account[] array = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int aa = 0;
	private static int aa2 = 0;
	
	
	
	
	private static void createAccount() {
		// 스캐너로 1.이름 , 2.계좌번호 , 3.초기통장 금액   배열객체에 저장 
		Account account = new Account();
		if(aa < 100) {
			System.out.println("이름을 입력하세요");
			String owner = scanner.next();
			account.setOwner(owner);
			
			System.out.println("계좌번호를 입력하세요");
			String ano = scanner.next();
			account.setAno(ano);
			
			System.out.println("초기금액을 입력하세요");
			int balance = scanner.nextInt();
			account.setBalance(balance);
			
			array[aa] = account;
			aa++;
			
			System.out.println("계좌생성 완료");
		}
		
		
	}
	
	private static void accountList() {
		// 배열에 저장된 객체를 가져와서 계좌번호 , 이름 , 금액을 출력
		for (int i = 0 ; i<aa ; i++) {
			System.out.print("이름 : " + array[i].getOwner() + " | ");
			System.out.print("계좌번호 : " + array[i].getAno() + " | ");
			System.out.println("잔액 : " + array[i].getBalance());
		}
		
	}
	
	private static void deposit() {
		// 계좌번호를 받아서 객체에서 해당계좌번호를 찾고 , 금액을 인풋받아서 입금
		
		System.out.println("계좌를 입력해 주세요 ");
		String ano = scanner.next();
		findAccount(ano);
		System.out.println("현재잔액은 : " + array[aa2].getBalance() + "원 입니다");
		System.out.println("입금하실 금액을 입력하세요>>");
		int won = scanner.nextInt() ;
		if(won >= 0) {
			System.out.println("입금하신 금액은 : " + won + "원 입니다");
			int now = array[aa2].getBalance() + won;
			array[aa2].setBalance(now);
			System.out.println("현재잔액은 : " + now + "원 입니다");
		}else {
			System.out.println("금액을 다시 입력해주세요");
		}
		
		
	}
	
	private static void withdraw() {
		// 계좌번호를 받아서 객체에서 해당계좌번호를 찾고 , 금액을 인풋받아서 출금
		System.out.println("계좌를 입력해 주세요");
		String ano = scanner.next();
		findAccount(ano);
		System.out.println("현재잔액은 : " + array[aa2].getBalance() + "원 입니다");
		System.out.println("출금하실 금액을 입력하세요>>");
		int won = scanner.nextInt() ;
		if(won <= array[aa2].getBalance()) {
			System.out.println("출금하신 금액은 : " + won + "원 입니다");
			int now = array[aa2].getBalance() - won;
			array[aa2].setBalance(now);
			System.out.println("현재잔액은 : " + now + "원 입니다");
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}
	
	
	// 배열에서 Account 객체 내의 ano 와 동일한 계좌를 찾아서 찾은 객체를 리턴해서 돌려줌 
	private static Account findAccount(String ano) {
		Account account = null ;
		for (int i = 0 ; i < aa ; i++) {
			if(array[i].getAno().equals(ano)) {
				aa2 = i;
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
