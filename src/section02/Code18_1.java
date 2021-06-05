package section02;

import java.util.Scanner;

public class Code18_1 {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++)
			data[i] = kb.nextInt();
		kb.close();


		bubbleSort(data, n); // "참조형"이기때문에 굳이 리턴값을 사용할 필요가 없다
		
		System.out.println("Sorted data:");
		for (int i = 0; i < n; i++)
			System.out.print(data[i] + " ");
	}

	static void bubbleSort(int[] data, int n) { // 배열=참조형매개변수 -> 값 변경이 가능

		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j + 1]) {
					// swap data[j] and data[j+1]
					swap(data[j], data[j+1]);

				}
			}
		}
		
	}// end bubbleSort

	static void swap(int a, int b) { // 기본형 매개변수 이기때문에
		int tmp = a;
		a = b;
		b = tmp;	
	}

}
