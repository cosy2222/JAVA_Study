package chap17.Ex13;

import java.util.Scanner;


class Account{
	private String ano ;  // ���¹�ȣ
	private String owner ;  // �̸�
	private int balance;  // ����ݾ� 
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
	// �迭�� ����ؼ� Account ��ü ���
	private static Account[] array = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int aa = 0;
	private static int aa2 = 0;
	
	
	
	
	private static void createAccount() {
		// ��ĳ�ʷ� 1.�̸� , 2.���¹�ȣ , 3.�ʱ����� �ݾ�   �迭��ü�� ���� 
		Account account = new Account();
		if(aa < 100) {
			System.out.println("�̸��� �Է��ϼ���");
			String owner = scanner.next();
			account.setOwner(owner);
			
			System.out.println("���¹�ȣ�� �Է��ϼ���");
			String ano = scanner.next();
			account.setAno(ano);
			
			System.out.println("�ʱ�ݾ��� �Է��ϼ���");
			int balance = scanner.nextInt();
			account.setBalance(balance);
			
			array[aa] = account;
			aa++;
			
			System.out.println("���»��� �Ϸ�");
		}
		
		
	}
	
	private static void accountList() {
		// �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ , �̸� , �ݾ��� ���
		for (int i = 0 ; i<aa ; i++) {
			System.out.print("�̸� : " + array[i].getOwner() + " | ");
			System.out.print("���¹�ȣ : " + array[i].getAno() + " | ");
			System.out.println("�ܾ� : " + array[i].getBalance());
		}
		
	}
	
	private static void deposit() {
		// ���¹�ȣ�� �޾Ƽ� ��ü���� �ش���¹�ȣ�� ã�� , �ݾ��� ��ǲ�޾Ƽ� �Ա�
		
		System.out.println("���¸� �Է��� �ּ��� ");
		String ano = scanner.next();
		findAccount(ano);
		System.out.println("�����ܾ��� : " + array[aa2].getBalance() + "�� �Դϴ�");
		System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���>>");
		int won = scanner.nextInt() ;
		if(won >= 0) {
			System.out.println("�Ա��Ͻ� �ݾ��� : " + won + "�� �Դϴ�");
			int now = array[aa2].getBalance() + won;
			array[aa2].setBalance(now);
			System.out.println("�����ܾ��� : " + now + "�� �Դϴ�");
		}else {
			System.out.println("�ݾ��� �ٽ� �Է����ּ���");
		}
		
		
	}
	
	private static void withdraw() {
		// ���¹�ȣ�� �޾Ƽ� ��ü���� �ش���¹�ȣ�� ã�� , �ݾ��� ��ǲ�޾Ƽ� ���
		System.out.println("���¸� �Է��� �ּ���");
		String ano = scanner.next();
		findAccount(ano);
		System.out.println("�����ܾ��� : " + array[aa2].getBalance() + "�� �Դϴ�");
		System.out.println("����Ͻ� �ݾ��� �Է��ϼ���>>");
		int won = scanner.nextInt() ;
		if(won <= array[aa2].getBalance()) {
			System.out.println("����Ͻ� �ݾ��� : " + won + "�� �Դϴ�");
			int now = array[aa2].getBalance() - won;
			array[aa2].setBalance(now);
			System.out.println("�����ܾ��� : " + now + "�� �Դϴ�");
		}else {
			System.out.println("�ܾ��� �����մϴ�");
		}
	}
	
	
	// �迭���� Account ��ü ���� ano �� ������ ���¸� ã�Ƽ� ã�� ��ü�� �����ؼ� ������ 
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
