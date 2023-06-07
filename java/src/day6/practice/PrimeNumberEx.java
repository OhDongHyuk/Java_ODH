package day6.practice;

public class PrimeNumberEx {

	public static void main(String[] args) {
		int i, j;
		int count;
		for( i = 2 ; i <= 100 ; i++ ) {
			for( j = 1, count = 0 ; j <= i ; j++ ) {
				if( i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i);
			}
			//count = 0; //초기화 시켜야함 for문에 같이 넣어 초기화 가능
		}

	}

}
