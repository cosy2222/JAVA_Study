package chap17.Ex05;

import java.util.ArrayList;

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
}

class MemberArrayList{		// MemberArrayList를 객체화 하면 ArrayList객체가 만들어짐
	private ArrayList<Member> arraylist;
	
	
	public MemberArrayList() {	// 기본생성자
		arraylist = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {	// Member 객체를 받아서 맨마지막방에 값을 추가하는 메소드
		arraylist.add(member);
	}
	
	public void addMember2(int a, Member member) {	// 매개변수 2개를 받아서  특정index방번호에 값을 추가 
		arraylist.add(a,member);
	}
	
	public boolean removeMember(int Memberid) {
		// ArrayList에 저장된 memberid를 검색해서 해당객체를 삭제
				
		return false;
	}
	
	public void showAllMember() {
		// ArrayList에 저장된 모든 사용자 정보를 출력 
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
		
		m.addMember(Member1);		// 각 객체를 생성해서 ArrayList에 저장
		m.addMember(Member2);
		m.addMember(Member3);
		m.addMember(Member4);
		
		
		//특정 index방에 사용자 추가 
		m.addMember2(0, Member4);
		
		// 특정 id를 가진 사용자 제거
		m.removeMember(1001);
		
		// 모든 사용자 정보 출력
		m.showAllMember();
		
		
		
		
		

	}

}
