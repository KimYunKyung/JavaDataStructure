package section01;

/*
 *�Ҽ�����
 * 
 * */
public class Code10 {

	public static void main(String[] args) {

		for (int n = 2; n <= 100000; n++) {

			// 2, 3, ..., n/2

			boolean isPrime = true; // �ϴ� �Ҽ���� �����س���..

			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0)
					isPrime = false; // �Ҽ��� �ƴϴٶ�� ���Ÿ� ã�´ٸ� for���� ������ �� �ʿ䰡 ����.. ���ʿ��� ����..
				break; // ȿ������ ���̱� ���� �̷� ��ġ�� ���ش�
			}

			/*
			 * �������1. isPrime�� false�� �Ǹ� ��� ���Ͷ�. ( = true�� �ƴҰ�� �������Ͷ� ) 
			 * for(int i=2; i<= n/2 && isPrime; i++) 
			 * { 
			 *    if( n % i == 0 ) 
			 *      isPrime = false; 
			 * }
			 */

			/*
			 * �������2. 2, 3, ..., sqrt(n)=��Ʈ(n) 
			 * for(int i=2; i*i <= n && isPrime; i++) 
			 * { 
			 *     if(n % i == 0 ) 
			 *       isPrime = false; 
			 * }
			 */
			
			if (isPrime) // ���Ű� ���ٸ� �Ҽ���..
				System.out.println(n);
		}

	}

}
