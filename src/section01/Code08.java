package section01;

import java.util.Scanner;

/*
 * ����ڷκ��� n���� ������ �Է¹��� �� �հ� �ִ밪�� ���Ͽ� ����ϴ� �ڵ�
 * 
 * */
public class Code08 {

	public static void main(String[] args) {

		// ����ڷ� ���� n���� ������ �Է¹ޱ�
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();

		// n���� ���� �� ���ϱ�, �ִ밪 ���ϱ�
		
//		int sum = 0; // Tip.. ���� ���� ���� ���� ���� 0���� �ʱ�ȭ �ϰ� �����ϱ�
//		int max = 0; // 0���� �ʱ�ȭ �ϸ� "������ ���" ���ܻ�Ȳ�� Ŀ������ ����
		
//		for (int i = 0; i < data.length; i++) {
//			sum += data[i];
//			if (data[i] > max)
//				max = data[i];
//		}
		
		int sum = 0; 
		int max = data[0]; // ���� �������� ���� �ƹ��ų� �ϳ��� �־��ش�
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
			if (data[i] > max)
				max = data[i];
		}

		System.out.println("The sum is " + sum + " ,Max is " + max);

	}

}
