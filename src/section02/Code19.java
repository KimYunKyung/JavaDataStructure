package section02;
/*
 * 데이터파일 읽는 예제
 * */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
	public static void main(String[] args) {
		
//		String fileName = "input.txt";
//		Scanner inFile = new Scanner(fileName);
		
		String[] name = new String[1000];
		String[] number = new String[1000];
		int count = 0;
		
		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			
			while(inFile.hasNext()) { // 더 읽을게 남아 있냐? // 없으면 false리턴
				name[count] = inFile.next();
				number[count] = inFile.next();
				count++;
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			System.exit(1); // return // main함수에 있는 return은 프로그램 종료 의미
			                // 0: 정상적 종료 , 1: 비정상적 종료
		}
		
		for(int i =0; i<count; i++) {
			System.out.println(name[i]+":"+number[i]);
		}
		

		

		
	}
}
