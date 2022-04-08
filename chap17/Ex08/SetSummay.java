package chap17.Ex08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Set : �ߺ����� �ʴ� ���� ���� ( equals() , hashCode() ������) , WrapperŬ������ ������ �Ǿ��ִ� 
	// 1. HashSet 		: ����� �������� ��µȴ�
	// 2. LinkedHashSet : �ԷµǴ� ��� ���
	// 3. TreeSet 		: �Է°��� ������ ���������� ���� ,  �������� ���ĵǾ� ���

public class SetSummay {

	public static void main(String[] args) {
		
		// 1. HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		System.out.println(hashSet);
		
		// 2. LinkedHashSet
		Set<String> linkedhashSet = new LinkedHashSet();
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		System.out.println(linkedhashSet);
		
		// 3. TreeSet 
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		System.out.println(treeSet);
		
		
		
	}

}
