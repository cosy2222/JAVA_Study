package chap17.Ex16;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

// Account ��ü�� TreeSet�� ����  ano , owner , balance
// TreeSet �� �Ϲݰ�ü�� ������ ��÷��� ���������� ����  Comparable<E> , Comparator<E>
// Account ��ü�� �������� �ʰ�.  balance�� ����ū�ͺ��� ��µǵ��� ���� . 

public class BankAccountUsingTreeSet  {
	
	private static TreeSet<Account> tset = new TreeSet(new Comparator<Account>() {

		@Override
		public int compare(Account o1, Account o2) {
			if(o1.getBalance() < o2.getBalance()) {
				return 1;
			}else if(o1.getBalance() == o2.getBalance()) {
				return 0;
			}else {
				return -1;
			}
		}
		
	});
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
		
		
		tset.add(newA);
		
		System.out.println("���»��� �Ϸ�");
		
	}
	
	private static void accountList()  {
		// �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ , �̸� , �ݾ��� ���
		System.out.println("-------------------");
		System.out.println("2. ���� ���");
		System.out.println("-------------------");
		
		
		Iterator<Account> itr = tset.iterator();
		while(itr.hasNext()) {
			Account a = itr.next();
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
		Iterator<Account> ir = tset.iterator();
		while(ir.hasNext()) {
			Account a1 = ir.next();
			String dbano = a1.getAno();
			if(dbano.equals(ano)) {
				account = a1;
				return account;
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
