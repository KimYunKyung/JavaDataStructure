package section02;

import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int result = power(a,b);  
		
		System.out.println(result);
		kb.close();
	
	}
	
	static int power(int n, int m) {   // static메서드 : 객체를 생성하지 않고 바로 사용할 수 있게 하기 위해서 
		int prod = 1;
		for (int i=0; i<m; i++)
			prod *= n;
		
		return prod;
	}

}
