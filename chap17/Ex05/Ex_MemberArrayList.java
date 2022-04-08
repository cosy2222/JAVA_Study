package chap17.Ex05;

import java.util.ArrayList;

class Member{		// DTO , VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����  
	private int memberid;
	private String membername;
	
	public Member(int memberid , String membername) {	//�����ڸ� ���ؼ� �� �Ҵ� 
		this.memberid = memberid;
		this.membername = membername;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}
	
	@Override
		public String toString() {
			return "id : " + memberid + " name : " + membername + "\n";
		}
}

class MemberArrayList{		// MemberArrayList�� ��üȭ �ϸ� ArrayList��ü�� �������
	private ArrayList<Member> arraylist;
	
	
	public MemberArrayList() {	// �⺻������
		arraylist = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {	// Member ��ü�� �޾Ƽ� �Ǹ������濡 ���� �߰��ϴ� �޼ҵ�
		arraylist.add(member);
	}
	
	public void addMember2(int a, Member member) {	// �Ű����� 2���� �޾Ƽ�  Ư��index���ȣ�� ���� �߰� 
		arraylist.add(a,member);
	}
	
	public boolean removeMember(int Memberid) {
		// ArrayList�� ����� memberid�� �˻��ؼ� �ش簴ü�� ����
				
		return false;
	}
	
	public void showAllMember() {
		// ArrayList�� ����� ��� ����� ������ ��� 
		System.out.println(arraylist);
	}
	
	
	
	
	
	
	
	
	
	
	
}

public class Ex_MemberArrayList {

	public static void main(String[] args) {
		
		MemberArrayList m = new MemberArrayList();
		Member Member1 = new Member(1001 , "member1");
		Member Member2 = new Member(2002 , "member2");
		Member Member3 = new Member(3003 , "member3");
		Member Member4 = new Member(4004 , "member4");
		
		m.addMember(Member1);		// �� ��ü�� �����ؼ� ArrayList�� ����
		m.addMember(Member2);
		m.addMember(Member3);
		m.addMember(Member4);
		
		
		//Ư�� index�濡 ����� �߰� 
		m.addMember2(0, Member4);
		
		// Ư�� id�� ���� ����� ����
		m.removeMember(1001);
		
		// ��� ����� ���� ���
		m.showAllMember();
		
		
		
		
		

	}

}
