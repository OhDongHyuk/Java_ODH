package day5.practice;

public class PrintEvenNumberEx {

	public static void main(String[] args) {
		int i = 0;
		while((i += 2) <= 10) {
			System.out.println(i);
		}
		System.out.println("==============================");

        //10 이하의 짝수를 출력하는 예제
		
		/* 방법 1.
		 * 반복 횟수 : j는 1부터 5까지 1씩 증가
		 * 규칙성 : 2 * j를 출력
		 * */
		int j = 1;
		while(j <= 5) {
			System.out.println(2*j);
			++j;
		}
		System.out.println("==============================");
		/* 방법 2.
		 * 반복 횟수 : k는 2부터 10까지 2씩 증가
		 * 규칙성 : k를 출력
		 * */
		int k = 2;
		while(k <= 10) {
			System.out.println(k);
			k += 2;
		}
		System.out.println("==============================");

		/* 방법 3.
		 * 반복 횟수 : i는 1부터 10까지 1씩 증가
		 * 규칙성 : i가 짝수 이면 i를 출력
		 * */
		int e = 1;
		while(e <= 10) {
			if(e % 2 == 0) {
				System.out.println(e);
			}
			e++;
		}
	}

}
