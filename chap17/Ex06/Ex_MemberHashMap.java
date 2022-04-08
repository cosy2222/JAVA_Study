package chap17.Ex06;

// HashSet으로 변환
// Member클래스의 memberid 컴럼을 equals() , hashcode()

import java.util.HashSet;
import java.util.Iterator;


class Member{		// DTO , VO : 각 계층간에 데이터를 받아서 전달해주는 클래스  
	private int memberid;
	private String membername;
	
	public Member(int memberid , String membername) {	//생성자를 통해서 값 할당 
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
	
	
	public MemberHashSet() {	// 기본생성자
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
		
		// 방갯수 출력			4개출력
		m.showSize();
		
		// 특정 id를 가진 사용자 제거
		m.removeMember(1001);
		
		// 모든 사용자 정보 출력
		m.showAllMember();
		
		
		System.out.println(Member1.equals(Member3));
		
		
		
		
		
		
		

	}

}
