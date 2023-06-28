package day21.practice;

public class MethodEx {

	public static void main(String[] args) {
		System.out.println(sum(1));
		System.out.println(sum(1, 2));
		System.out.println(sum(1, 2, 3, 4, 5));
		
	}

	/* 여러개의 정수의 합을 알려주는 메소드*/
	public static int sum(int ... nums) {//sum(int ... nums, double num) 에러발생, sum(double num, int ... nums) 사용가능
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
}
