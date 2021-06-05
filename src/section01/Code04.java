package section01;

import java.util.Scanner;

/*
 * Scanner - 입력받아서 "문자열자체"와 비교하기
 * */
public class Code04 {

	public static void main(String[] args) {
		String name = null;
		int age;
		String gender;

		Scanner kb = new Scanner(System.in);
		System.out.print("Please type your name and your age and your gender: ");

		name = kb.nextLine();
		age = kb.nextInt();
		gender = kb.next();

		if (gender.equals("male")) { // equals(변수, 문자열) true // (그 외 타입) false       
			System.out.println(name + ",you're " + age + "years old man.");
		} 
		else if (gender.equals("female")) {
			System.out.println(name + ",you're " + age + "years old woman.");
		} 
		else {
			System.out.println("Hmm... interesting.");
		}
	}

}
