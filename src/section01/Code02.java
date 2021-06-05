package section01;

import java.util.Scanner;
/*
 * Scanner - 정수형입력받아서 비교하기
 * */
public class Code02 { 

	public static void main(String[] args) {
		
		int number = 123; // 비교군
		
		Scanner kb = new Scanner(System.in);  // 받을 준비

		System.out.println("Please enter an integer: ");  // 뭘 입력하라는지 알려줄 출력
		
		int input = kb.nextInt(); // 키보드로 "정수하나"를 입력받아서 저장할 변수에 할당
		
		/* if(조건식)
		 * 조건식안에 '=='연산자는 기본형타입에만 사용가능
		 * 즉 String, 그 밖의 타입은 비교할 수가 없다!
		*/
		if(input == number) {  // 비교군과 같다면 == true -> if문으로 
			
			System.out.println("Numbers match! :)" );
		
		} 
		else {  // 비교군과 같지않다면 != false -> else문으로
			
			System.out.println("Numbers do not match! :-(");
		
		}
		
		kb.close(); // 안닫아주면 좋지 않은 습관.
	}

}