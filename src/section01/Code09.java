package section01;

import java.util.Scanner;

/*
 * n개의 정수를 입력받아 순서대로 배열에 저장한다.
 * 그런 다음 모든 정수들을 한 칸씩 오른쪽으로 shift하라.
 * 마지막 정수는 배열의 첫 칸으로 이동하라.
 * 
 * */
public class Code09 {

	public static void main(String[] args) {
		
		// 정수의 개수 n을 입력받고 n개의 정수를 입력받기
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for (int i = 0; i < n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		int tmp = data[n-1]; // 마지막자리
		for(int i = n-2; i>=0; i--) {
			data[i+1] = data[i]; 
			/*
			 * 7=6   data[6]자리의 값을 data[7]자리에 할당해주기
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
