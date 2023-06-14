package day11.array;

public class ForEx1 {

	public static void main(String[] args) {
		int arr[] = new int[] {4,5,2,1,9};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 0; //실제 배열의 값도 0의로 바뀜
			int tmp = arr[i];
			System.out.println(tmp);
		}
		//향상된 for문
		arr = new int[] {4,5,2,1,9};
		System.out.println("==================");
		for(int tmp : arr) {
			tmp = 0; //실제 배열의 값은 안바뀌고 tmp의 값이 0으로 바뀜
			System.out.println(tmp);
		}
		System.out.println("==================");
		for(int tmp : arr) {//그래서 다시 tmp를 초기화하지 않고 출력하면 원래 tmp 값이 나옴
			System.out.println(tmp);
		}
	}

}
