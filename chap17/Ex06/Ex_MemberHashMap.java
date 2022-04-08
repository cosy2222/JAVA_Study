package chap17.Ex06;

// HashSet���� ��ȯ
// MemberŬ������ memberid �ķ��� equals() , hashcode()

import java.util.HashSet;
import java.util.Iterator;


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
	
	@Override
	public int hashCode() {
		return memberid;
	}
	
	@Override
		public boolean equals(Object obj) {
			if ( obj instanceof Member) {
				Member member = (Member)obj;
				return true;
			}
			return false;
		}
	
}



class MemberHashSet{		
	private HashSet<Member> hashset;
	
	
	public MemberHashSet() {	// �⺻������
		hashset = new HashSet<Member>();
	}
	
	public void addMember(Member member) {	
		hashset.add(member);
	}
	
	public boolean removeMember(int Memberid) {
		Iterator<Member> iterator = hashset.iterator();
		while(iterator.hasNext()){
			Member m = iterator.next();
			int id = m.getMemberid();
			if(Memberid == id) {
				hashset.remove(m);
				return true;
			}
		}
		return false;
	}
	
	public void showAllMember() {
		Iterator<Member> iterator = hashset.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}
	
	public void showSize() {
		System.out.println(hashset.size());
	}
	
	
	
	
	
	
	
	
	
	
}

public class Ex_MemberHashMap {

	public static void main(String[] args) {
		
		MemberHashSet m = new MemberHashSet();
		Member Member1 = new Member(1001 , "member1");
		Member Member2 = new Member(2002 , "member2");
		Member Member3 = new Member(3003 , "member3");
		Member Member4 = new Member(4004 , "member4");
		Member Member5 = new Member(1001 , "member1");
		
		m.addMember(Member1);		
		m.addMember(Member2);
		m.addMember(Member3);
		m.addMember(Member4);
		
		// �氹�� ���			4�����
		m.showSize();
		
		// Ư�� id�� ���� ����� ����
		m.removeMember(1001);
		
		// ��� ����� ���� ���
		m.showAllMember();
		
		
		System.out.println(Member1.equals(Member3));
		
		
		
		
		
		
		

	}

}
