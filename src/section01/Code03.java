package section01;

import java.util.Scanner;
/*
 * Scanner - 문자열입력받아서 비교하기
 * */
public class Code03 {

	public static void main(String[] args) {
		
		String str = "Hello"; // 비교군  
		
		String input = null;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please type a string: ");
		input = kb.next();
		
		
		/* if(조건식)
		 * 조건식안에 '=='연산자는 기본형타입에만 사용가능
		 * 즉 String, 그 밖의 타입은 비교할 수가 없다!
		 * if(str == input) // 에러
		*/
		if(str.equals(input)) { // return : true, false
			
			System.out.println("Strings match! :)");
			
		}
		else {
			
			System.out.println("Strings do not match! :-(");
			
		}
		
	}

}
