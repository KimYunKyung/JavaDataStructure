package section01;

import java.util.Scanner;
/*
 * Scanner - ���ڿ��Է¹޾Ƽ� ���ϱ�
 * */
public class Code03 {

	public static void main(String[] args) {
		
		String str = "Hello"; // �񱳱�  
		
		String input = null;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please type a string: ");
		input = kb.next();
		
		
		/* if(���ǽ�)
		 * ���ǽľȿ� '=='�����ڴ� �⺻��Ÿ�Կ��� ��밡��
		 * �� String, �� ���� Ÿ���� ���� ���� ����!
		 * if(str == input) // ����
		*/
		if(str.equals(input)) { // return : true, false
			
			System.out.println("Strings match! :)");
			
		}
		else {
			
			System.out.println("Strings do not match! :-(");
			
		}
		
	}

}
