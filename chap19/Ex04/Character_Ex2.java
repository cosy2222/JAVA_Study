package chap19.Ex04;

/*
 *  A ~ Z ������ �ƽ�Ű �ڵ尪 ���
 *  
 *  ��°��
 *  
 *  A : 65
 *  B : 66
 *  ...
 *  Z : 90
 *  
 *  
 *  
 *  a ~ z ������ �ƽ�Ű �ڵ尪 ���
 *  
 *  ��°��
 *  a : 97
 *  b : 98
 *  ...
 *  z : 122
 *  
 *  
 */

public class Character_Ex2 {

	public static void main(String[] args) {
		
		
		// �빮��
		int [] arr1 = new int [26];
		char a1 = 'A';
		
		for(int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = a1 + i;
			System.out.println((char)arr1[i] + " : " + arr1[i]);
		}
		
		System.out.println("============================");
		
		// �ҹ���
		int [] arr2 = new int [26];
		char a2 = 'a';
		
		for(int i = 0 ; i < arr2.length ; i++) {
			arr2[i] = a2 + i;
			System.out.println((char)arr2[i] + " : " + arr2[i]);
		}

	}

}
