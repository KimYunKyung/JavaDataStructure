package section01;

/*
 *소수판정
 * 
 * */
public class Code10 {

	public static void main(String[] args) {

		for (int n = 2; n <= 100000; n++) {

			// 2, 3, ..., n/2

			boolean isPrime = true; // 일단 소수라고 판정해놓고..

			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0)
					isPrime = false; // 소수가 아니다라는 증거를 찾는다면 for문을 끝까지 돌 필요가 없지.. 불필요한 낭비..
				break; // 효율성을 높이기 위해 이런 장치를 해준다
			}

			/*
			 * 개선방법1. isPrime이 false가 되면 즉시 나와라. ( = true가 아닐경우 빠져나와라 ) 
			 * for(int i=2; i<= n/2 && isPrime; i++) 
			 * { 
			 *    if( n % i == 0 ) 
			 *      isPrime = false; 
			 * }
			 */

			/*
			 * 개선방법2. 2, 3, ..., sqrt(n)=루트(n) 
			 * for(int i=2; i*i <= n && isPrime; i++) 
			 * { 
			 *     if(n % i == 0 ) 
			 *       isPrime = false; 
			 * }
			 */
			
			if (isPrime) // 증거가 없다면 소수다..
				System.out.println(n);
		}

	}

}
