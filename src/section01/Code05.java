package section01;

/*
 * �迭
 * */
public class Code05 {
	public static void main(String[] args) {
		
		// declare the array
		
		/*
		 * �ڹٴ� �迭�� ũ�⸦ ������ �� 
		 * -> ���, ����(�տ� ���ǵǾ��ְ�, 0���� ũ��) ��� ��밡��
		 * 
		 * int n = kb.nextInt();
		 * int [] array = new int [n];
		 * 
		 * array[n+1]  // OK
		 * array[n++]  // OK
		 * �̸��� �ｼ �ε����� ǥ���� ���� �ִٸ� ���긮�ٵ� ������
		 * */
		
		// integer type
		int [] grades = new int [5];
		
		// double type
		double [] array = new double [100];
		
		// char type
		char [] word = new char [20];
		
		// assign some values to the array
		// �����Է�
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
		
		System.out.println("--for�����--");
		
		// use of the for
		for (int i = 0; i < 5; i++) {
			System.out.println("Grade "+ (i+1) + " : " + grades[i]);			
		}
		
		System.out.println("--while�����--");
		// use of the while
		int i = 0;
		while (i<grades.length) {
			System.out.println("Grade "+ (i+1) + " : " + grades[i]);	
			i++;
		}
		
		System.out.println("--.length���--");
		// ���� �����Է� ��� .length�̿� -> ���̹�ȯ
		int j = 0;
		for (i = 0; i < grades.length; i++) {
			
			System.out.println("Grade "+ (i+1) + " : " + grades[j++]);						
		}
		
		
		
	}

}

