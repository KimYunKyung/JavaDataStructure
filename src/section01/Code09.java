package section01;

import java.util.Scanner;

/*
 * n���� ������ �Է¹޾� ������� �迭�� �����Ѵ�.
 * �׷� ���� ��� �������� �� ĭ�� ���������� shift�϶�.
 * ������ ������ �迭�� ù ĭ���� �̵��϶�.
 * 
 * */
public class Code09 {

	public static void main(String[] args) {
		
		// ������ ���� n�� �Է¹ް� n���� ������ �Է¹ޱ�
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for (int i = 0; i < n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		int tmp = data[n-1]; // �������ڸ�
		for(int i = n-2; i>=0; i--) {
			data[i+1] = data[i]; 
			/*
			 * 7=6   data[6]�ڸ��� ���� data[7]�ڸ��� �Ҵ����ֱ�
			 * 6=5
			 * 5=4
			 * 4=3
			 * 3=2
			 * 2=1
			 * */
		}
		data[0] = tmp;
		
		for (int i = 0; i < n; i++) {
			System.out.print(data[i]+" ");
		}
	}

}
