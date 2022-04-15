package department;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


/*
	��ȭ���� �� ���� ���α׷� (��Ӱ� ������)
	
	�� ��� : 1. �Ϲݰ� (Silver) , ���ʽ� ����Ʈ (1%����) , ������(����)
			  2. Gold �� : ���ʽ� ����Ʈ (2% ����) , ���η�(5%)
			  3. VIP �� : ���ʽ�����Ʈ (5%����), ���η�(10%), ��翡����Ʈ�� ���� 

*/

// �Ϲݰ� Ŭ����
class Customer{
	int id;		   // �� ID
	String name;   // �� �̸�
	String grade;  // �� ��� ( silver , gold , vip )
	double bounsPoint; 	   // ���ʽ� ����Ʈ ��
	double bounsRatio;     // ���ʽ� ����Ʈ ������ 
	
	
	public double calcPrice(double price) {	
		
		
		double bouns = (double)price*0.01;
		bounsPoint += bouns;
		
		System.out.println(name + "���� " + price + "�� ���� �ϼ̽��ϴ�");
		System.out.println(name + "������ ����� " + grade + "�̰� ���� ����Ʈ�� " + bounsPoint +"���Դϴ�" );
		return price;					 
	}
	
	Customer (int a , String b ){
		id = a;
		name = b;
		grade = "SILVER";
		bounsRatio = 1;
	}
	
	@Override
	public String toString() {
		return id + "    " + name + "   " + grade + "        " + bounsRatio + "%" + "       " ;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			if(id == ((Customer)obj).id) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
}






// ���� Ŭ����
class GoldCustomer extends Customer{
	double saleRatio; 

	GoldCustomer(int a, String b) {
		super(a, b);
		super.grade = "Gold";
		super.bounsRatio = 2;
		saleRatio = 5;
	}
	
	@Override
	public String toString() {
		return super.toString() + saleRatio+ "%";
	}
	
	@Override
	public double calcPrice(double price) {
		
		double bouns = (double)price*0.02;
		super.bounsPoint += bouns;
		
		double sale = (double)price*0.05;
		
		price = price -sale;
		
		System.out.println(name + "���� " + price + "�� ���� �ϼ̽��ϴ�");
		System.out.println(name + "������ ����� " + grade + "�̰� ���� ����Ʈ�� " + bounsPoint +"���̰� ������ "+ sale+"�� �Ǿ����ϴ�" );
		return price;
	}

}






// VIP �� Ŭ����
class VipCustomer extends Customer{
	
	private int agentid ;    
	double saleRatio; 	
	
	public int getAgentid() {
		return agentid;
	}

	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}

	VipCustomer(int a, String b) {
		super(a, b);
		super.grade = "VIP";
		super.bounsRatio = 5;
		saleRatio = 10;
	}
	
	@Override
	public String toString() {
		return super.toString() + saleRatio+ "%" + "           " + agentid;
	}
	
	@Override
	public double calcPrice(double price) {
		
		double bouns = (double)price*0.05;
		super.bounsPoint += bouns;
		
		double sale = (double)price*0.1;
		
		price = price -sale;
		
		System.out.println(name + "���� " + price + "�� ���� �ϼ̽��ϴ�");
		System.out.println(name + "������ ����� " + grade + "�̰� ���� ����Ʈ�� " + bounsPoint +"���̰� ������ "+ sale+"�� �Ǿ����ϴ�" );
		return price;
	}
	
	
	
	
}
















public class Customer_Management {

	public static void main(String[] args) {
		
		Set <Customer> customerset = new HashSet();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("=============================================================================================");
			System.out.println("1.�Ϲݰ� ���  |  2. VIP�����  | 3.Gold �� ��� | 4. ������� | 5. ��ǰ���� | 6. ����");
			System.out.println("=============================================================================================");
			System.out.print("���� >>");
			int  num = sc.nextInt();
			
			// �Ϲݰ� ���
			if(num ==1 ) {

				System.out.println("==�Ϲݰ� ��� �Դϴ�==");
				System.out.print("�� ���̵� :");
				int id = sc.nextInt();
				System.out.print("�� �̸� : ");
				String name = sc.next();
				Customer cus = new Customer(id, name);
				customerset.add(cus);
			
				
			// VIP �� ���
			}else if (num ==2) {
				
				System.out.println("==VIP�� ��� �Դϴ�==");
				System.out.print("�� ���̵� :");
				int id = sc.nextInt();
				System.out.print("�� �̸� : ");
				String name = sc.next();
				System.out.print("��翡����Ʈ(ID) ��� : ");
				int agent = sc.nextInt();
				VipCustomer vcus = new VipCustomer(id, name);
				vcus.setAgentid(agent); 
				customerset.add(vcus);
			
				
			// GOld �� ���
			}else if (num == 3) {
				
				System.out.println("==GOLD�� ��� �Դϴ�==");
				System.out.print("�� ���̵� :");
				int id = sc.nextInt();
				System.out.print("�� �̸� : ");
				String name = sc.next();
				GoldCustomer gcus = new GoldCustomer(id, name);
				customerset.add(gcus);
				
				
			// �� ���� ���	
			}else if (num ==4) {
				System.out.println("==�� ���� ��� �Դϴ�==");
				System.out.println("��ID	���̸�	�����	���ʽ�������  ���η�	������ƮID<VIP��>");
				for(Customer c : customerset) {
					System.out.println(c);
				}
			
				
			// ��ǰ����	
			}else if (num == 5) {
				System.out.println("==��ǰ����==");
				System.out.print("�� ���̵� :");
				int id = sc.nextInt();
				
				// ���� id ã�� 
				Iterator<Customer> ir = customerset.iterator();
				Customer c1 = null;
				while(ir.hasNext()) {
					Customer c2 = ir.next();
					if(id == c2.id) {
						c1 = c2;
					}
				}
				System.out.print("��ǰ������ �Է� ���ּ��� : ");
				int price = sc.nextInt();
				
				c1.calcPrice(price);
				
				
			// ����	
			}else if (num ==6) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
