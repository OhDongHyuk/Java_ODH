package day6.practice;

public class PrimeNumberExAFor {

	public static void main(String[] args) {
		int i, j, count;
		//i가 소수이면 i를 출력하는 코드
		
		for( i = 2 ; i <= 100 ; i++ ) {
			count = 0;
			for( j = 1, count = 0 ; j <= i ; j++ )
				if(i % j == 0) {
					count++;
				}
			if(count == 2) {
				System.out.println(i);
			}
		}
	}
}
