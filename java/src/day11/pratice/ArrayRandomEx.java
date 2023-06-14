package day11.pratice;

public class ArrayRandomEx {

	public static void main(String[] args) {
		//1~9사이의 랜덤한 수를 3개 만들어서 배열에 저장한 후 출력하는 코드를 작성하세요.
		
		int [] randomNumber = new int[3];
		int max = 9, min = 1;
		
		for(int i = 0; i < 3; i++) {
			randomNumber[i] = (int)(Math.random() * (max - min + 1) + min);
			System.out.println(randomNumber[i]);
		}
	}
}
