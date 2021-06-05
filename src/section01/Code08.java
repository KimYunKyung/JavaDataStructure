package section01;

import java.util.Scanner;

/*
 * 사용자로부터 n개의 정수를 입력받은 후 합과 최대값을 구하여 출력하는 코드
 * 
 * */
public class Code08 {

	public static void main(String[] args) {

		// 사용자로 부터 n개의 정수를 입력받기
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();

		// n개의 정수 합 구하기, 최대값 구하기
		
//		int sum = 0; // Tip.. 합을 구할 때는 합을 먼저 0으로 초기화 하고 시작하기
//		int max = 0; // 0으로 초기화 하면 "음수일 경우" 예외상황을 커버하지 못함
		
//		for (int i = 0; i < data.length; i++) {
//			sum += data[i];
//			if (data[i] > max)
//				max = data[i];
//		}
		
		int sum = 0; 
		int max = data[0]; // 실제 데이터의 값의 아무거나 하나를 넣어준다
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
			if (data[i] > max)
				max = data[i];
		}

		System.out.println("The sum is " + sum + " ,Max is " + max);

	}

}
