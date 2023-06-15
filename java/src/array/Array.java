package array;

public class Array {
	//배열 전체 출력
	public static void printArray(int arr[]) {
		System.out.print("[");
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + (i == arr.length-1?"":","));
		}
		System.out.println("]");
	}
	//배열을 start번지부터 end-1번지까지 출력
	public static void printArray(int arr[], int start, int end) {
		System.out.print("[");
		for(int i = start; i < end; i++) {
			if(i >= arr.length) {
				break;
			}
			System.out.print(arr[i] + (i == end-1?"":","));
		}
		System.out.println("]");
	}
	//num가 배열의 원소 중에서 0번지 부터 count개 안에 num가 있는지 확인 하는 메소드
	public static boolean contains1(int arr[], int num, int count) {
		for(int i = 0; i < count; i++) {
			if(num == arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static int [] createRandomArray(int min, int max, int arr[]) {
		//max가 min보다 작으면 두 수를 교환
		if(max < min) {
			int tmp =max;
			max = min;
			min = max;
		}
		if(arr == null) {
			arr = new int[max - min +1];
		}
		if(max - min + 1 < arr.length) {
			return null;
		}
		int count = 0;
		while(count < arr.length) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			if(!contains1(arr, random, count)) {
				arr[count] =random;
				count++;
			}
		}
		return arr;
	}
	/**주어진 배열에 중복된 값이 있는지 없는지 알려주는 메소드
	 * 매개변수 : 배열 => int arr[]
	 * 리턴타입 : 중복여부
	 * 메소드명 : arrayCheck
	 */
	public static boolean arrayCheck(int arr[]) {
		if(arr == null) {
			return false;
		}
		//arr 배열의 다른 번지들끼리 비교해서 같은 값이 있는지 확인하는 반복문
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i == j) {
					continue;
				}
				//다른 번지이고 값이 같은면 중복됐다고 리턴
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		//반복문이 끝날때까지 중복이 안되면 중복이 안됐다고 리턴
		return false;
	}
}
