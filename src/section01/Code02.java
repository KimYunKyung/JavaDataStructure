package section01;

import java.util.Scanner;
/*
 * Scanner - �������Է¹޾Ƽ� ���ϱ�
 * */
public class Code02 { 

	public static void main(String[] args) {
		
		int number = 123; // �񱳱�
		
		Scanner kb = new Scanner(System.in);  // ���� �غ�

		System.out.println("Please enter an integer: ");  // �� �Է��϶���� �˷��� ���
		
		int input = kb.nextInt(); // Ű����� "�����ϳ�"�� �Է¹޾Ƽ� ������ ������ �Ҵ�
		
		/* if(���ǽ�)
		 * ���ǽľȿ� '=='�����ڴ� �⺻��Ÿ�Կ��� ��밡��
		 * �� String, �� ���� Ÿ���� ���� ���� ����!
		*/
		if(input == number) {  // �񱳱��� ���ٸ� == true -> if������ 
			
			System.out.println("Numbers match! :)" );
		
		} 
		else {  // �񱳱��� �����ʴٸ� != false -> else������
			
			System.out.println("Numbers do not match! :-(");
		
		}
		
		kb.close(); // �ȴݾ��ָ� ���� ���� ����.
	}

}