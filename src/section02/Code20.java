package section02;

/*
 * 데이터파일 읽는 예제
 * */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

	static String[] name = new String[1000];
	static String[] number = new String[1000];
	static int n = 0;

	public static void main(String[] args) {

//		String fileName = "input.txt";
//		Scanner inFile = new Scanner(fileName);

		try {
			Scanner inFile = new Scanner(new File("input.txt"));

			while (inFile.hasNext()) { // 더 읽을게 남아 있냐? // 없으면 false리턴
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}

			inFile.close();

		} catch (FileNotFoundException e) {
			System.out.println("No file");
			System.exit(1); // return // main함수에 있는 return은 프로그램 종료 의미
							// 0: 정상적 종료 , 1: 비정상적 종료
		}

		bubbleSort(); // 전역변수를 사용하기때문에, 굳이 매개변수로 넘겨줄 필요x

		for (int i = 0; i < n; i++) {
			System.out.println(name[i] + ":" + number[i]);
		}

	}

	static void bubbleSort() {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (name[j].compareTo(name[j + 1]) > 0 ) { // "문자열비교" str1.equals(str2) , str1 == str2 (x)
					// swap
					String tmp = name[j];
					name[j] = name[j + 1];
					name[j + 1] = tmp;

					tmp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = tmp;

				}
			}
		}

	}
}