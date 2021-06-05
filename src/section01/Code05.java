package section01;

/*
 * 배열
 * */
public class Code05 {
	public static void main(String[] args) {
		
		// declare the array
		
		/*
		 * 자바는 배열의 크기를 지정할 때 
		 * -> 상수, 변수(앞에 정의되어있고, 0보다 크곡) 모두 사용가능
		 * 
		 * int n = kb.nextInt();
		 * int [] array = new int [n];
		 * 
		 * array[n+1]  // OK
		 * array[n++]  // OK
		 * 이말은 즉슨 인덱스를 표현할 수만 있다면 에브리바디 오케이
		 * */
		
		// integer type
		int [] grades = new int [5];
		
		// double type
		double [] array = new double [100];
		
		// char type
		char [] word = new char [20];
		
		// assign some values to the array
		// 직접입력
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		// print out each value
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades[4]);
		
		System.out.println("--for문사용--");
		
		// use of the for
		for (int i = 0; i < 5; i++) {
			System.out.println("Grade "+ (i+1) + " : " + grades[i]);			
		}
		
		System.out.println("--while문사용--");
		// use of the while
		int i = 0;
		while (i<grades.length) {
			System.out.println("Grade "+ (i+1) + " : " + grades[i]);	
			i++;
		}
		
		System.out.println("--.length사용--");
		// 숫자 직접입력 대신 .length이용 -> 길이반환
		int j = 0;
		for (i = 0; i < grades.length; i++) {
			
			System.out.println("Grade "+ (i+1) + " : " + grades[j++]);						
		}
		
		
		
	}

}

