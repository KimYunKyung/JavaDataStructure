package section02;
/*
 * ���������� �д� ����
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
			
			while(inFile.hasNext()) { // �� ������ ���� �ֳ�? // ������ false����
				name[count] = inFile.next();
				number[count] = inFile.next();
				count++;
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			System.exit(1); // return // main�Լ��� �ִ� return�� ���α׷� ���� �ǹ�
			                // 0: ������ ���� , 1: �������� ����
		}
		
		for(int i =0; i<count; i++) {
			System.out.println(name[i]+":"+number[i]);
		}
		

		

		
	}
}
