package chap17.Ex13_1;

import java.util.Scanner;

class Account{
	private String ano ;  // ���¹�ȣ
	private String owner ;  // �̸�
	private int balance;  // ����ݾ� 
	
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

public class BankAccountUsingArray_1 {
	// �迭�� ����ؼ� Account ��ü ���
	private static Account[] array = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	
	
	
	
	private static void createAccount() {
		// ��ĳ�ʷ� 1.�̸� , 2.���¹�ȣ , 3.�ʱ����� �ݾ�   ��ü�� �迭�� ����
		System.out.println("-------------------");
		System.out.println("1. ���� ����");
		System.out.println("-------------------");
		System.out.println("���¹�ȣ�� �Է��ϼ���>>");
		String ano = scanner.next();   
		System.out.println("�̸��� �Է� �ϼ���>>");
		String owner = scanner.next();
		System.out.println("�ʱ��ܾ��� �Է��ϼ���>>");
		int balance = scanner.nextInt();
		
		Account newA = new Account(ano , owner , balance);
		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i]== null) {
				array[i] = newA;
				System.out.println("���� ���� �Ϸ�");
				break;
			}
		}
		
		
	}
	
	private static void accountList() {
		// �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ , �̸� , �ݾ��� ���
		System.out.println("-------------------");
		System.out.println("2. ���� ���");
		System.out.println("-------------------");
		
		for(int i = 0 ; i < array.length ; i++) {
			Account a = array[i];
			if (a != null) {
				System.out.print("�̸� : " + a.getOwner() + " | ");
				System.out.print("���¹�ȣ : " + a.getAno() + " | ");
				System.out.println("�ܾ� : " + a.getBalance());
			}
		}
	}
	
	private static void deposit() {
		// ���¹�ȣ�� �޾Ƽ� ��ü���� �ش���¹�ȣ�� ã�� , �ݾ��� ��ǲ�޾Ƽ� �Ա�
		System.out.println("-------------------");
		System.out.println("3. ����");
		System.out.println("-------------------");
		System.out.println("���¹�ȣ �Է��ϼ��� >>");
		String ano = scanner.next();
		System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
		int balance = scanner.nextInt();
		
		Account a = findAccount(ano);
		
		if(a == null) {
			System.out.println("�������� �ʴ� �����Դϴ�");
			return;
		}
		a.setBalance(a.getBalance() + balance);
		System.out.println("�Ա��Ͻűݾ��� : " + balance + "�Դϴ�");
		System.out.println("�����ܾ��� : " + a.getBalance());
			
		
	}
	
	private static void withdraw() {
		// ���¹�ȣ�� �޾Ƽ� ��ü���� �ش���¹�ȣ�� ã�� , �ݾ��� ��ǲ�޾Ƽ� ���
		System.out.println("-------------------");
		System.out.println("3. ���");
		System.out.println("-------------------");
		System.out.println("���¹�ȣ �Է��ϼ��� >>");
		String ano = scanner.next();
		System.out.println("����� �ݾ��� �Է��ϼ���");
		int balance = scanner.nextInt();
		
		Account a = findAccount(ano);
		
		if(a == null) {
			System.out.println("�������� �ʴ� �����Դϴ�");
			return;
		}
		a.setBalance(a.getBalance() - balance);
		System.out.println("����Ͻűݾ��� : " + balance + "�Դϴ�");
		System.out.println("�����ܾ��� : " + a.getBalance());
	}
	
	
	// �迭���� Account ��ü ���� ano �� ������ ���¸� ã�Ƽ� ã�� ��ü�� �����ؼ� ������ 
	private static Account findAccount(String ano) {
		Account account = null ;
		for(int i = 0; i<array.length ; i++) {
			if(array[i] != null) {	
				String Ano = array[i].getAno();
				if(Ano.equals(ano)) {
					account = array[i];
					break;
				}
			}
		}
		
		return account;
	}
	

	public static void main(String[] args) {
		boolean run = true ;
		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4.��� | 5.����");
			System.out.println("--------------------------------------------------------");
			System.out.println("����>>");
			int selectNO = scanner.nextInt();
			
			if(selectNO == 1) {
				createAccount(); // �޼ҵ� ȣ��
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
		System.out.println("���α׷� ����");

	}

}
