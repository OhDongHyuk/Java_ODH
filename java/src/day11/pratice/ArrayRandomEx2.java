package day11.pratice;

public class ArrayRandomEx2 {

	public static void main(String[] args) {
		//1~9사이의 랜덤한 수를 중복되지 않게 3개 만들어서 배열에 저장한 후 출력하는 코드를 작성하세요.
		
		int [] arr = new int[3];
		int max = 9, min = 1;
		
		//방법 1 : 9번지까지 있는 배열을 이용
		//장점 : 작업이 단순
		//단점 : 저장공간이 필요
		boolean checkArr[] = new boolean[10];
		for(int i = 0; i < 3;) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			//checkArr 배열에 random번지에 있는 값이 false이면
			if(!checkArr[random]) {
				//random을 배열에 저장.
				arr[i] = random;
				//i를 증가.
				i++;
				//checkArr배열에 random번지에 있는 값을 true로 변경
				checkArr[random] = true;
			}
		}
		for(int i = 0; i < 3; i++) 	{
			System.out.println(arr[i]);
		}
		//방법2 : 저장된 값들을 비교
		int count = 0;//현재 저장된 랜덤수 개수
		int i = 0;//반복문에서 사용할 변수
		
		while(count < 3) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			//이미 저장된 랜덤수들과 하나하나 비교해서 같은게 있는지 확인하여
			//있으면 반복문 종료
			for(i = 0; i < count; i++) {
				if(random == arr[i]) {
					break;
				}
			}
			/* 위 반복문에서 break를 만나지 않으면 i는 count일 때 종료하기 때문에
			 * 반복문 종료 후 i는 count와 같다.
			 * 하지만 break를 만나서 중간에 빠져 나오면 i는 count보다 작다.*/
			if(i == count) {
				arr[count] = random;
				count++;
				//arr[count++] = random;
			}
			
		}
		System.out.println("============================");
		for(i = 0; i < 3; i++) 	{
			System.out.println(arr[i]);
			
		}
		System.out.println("=========================-===");
		printArr(arr);
		
		//방법 3 : 방법2를 메서드로 변영
		/*count = 0;
		while(count < 3) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			//중복되지 않으면 배열에 저장 후 count 증가
			if(!contains1(arr, random, count)) {
				arr[count] =random;
				count++;
			}
		}
		*/
		createRandomArray(min, max, arr);
		System.out.println("=========================-===");
		printArr(arr);
	}
	/**정수형 배열이 주어지면, 정수형 배열의 값을 콘솔에 출력하는 메소드
	 * 매개변수 : int arr[], int size//.length가 있으면 필요없음
	 * 리턴타입 : void
	 * 메소드명 : printArr
	 */
	public static void printArr(int arr[]) {
		int i;
		for(i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}

	/**정수 num가 배열의 0번지 부터 count개만큼 확인했을 때 중복된 값이 있는지
	 * 없는지 알려주는 메소드
	 * 매개변수 : 중복을 확인할 배열, 비교할 정수 num, 비교할 개수 count
	 *          => int arr[],    int num,    int count
	 * 리턴타입 : 있는지 없는지 => boolean
	 * 메소드명 : contains1
	 */
	public static boolean contains1(int arr[], int num, int count) {//static을 쓰는 이유 객체가 없어서 main에 부르기 귀찮아 씀
		for(int i = 0; i < count; i++) {
			//중복되면 메소드를 종료하면서 중복됐다고 알려줍니다
			if(num == arr[i]) {
				return true;
			}
		}
		//이 위치까지 왔다는건 return true를 못만났다는 것이고 그 말은 중복되지 않았다는 의미
		return false;
	}
	/**min에서 max사이의 랜덤한 수를 생성해서 배열에 저장하는 메소드
	 * 매개변수 : int arr[], int min, int max
	 * 리턴타입 : void
	 * 메소드명 : creatRandomArray
	 */
	public static void createRandomArray(int min, int max, int arr[]) {
		//배열이 생성되어 있지 않으면(배열이 null이면) 메소드 종료
		if(arr == null) {
			return;
		}
		//랜덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면 메소드를 종료
		//1~3 : 3개가 4개짜리 배열에 중복되지 않게 들어갈 수 없음
		if(max - min + 1 < arr.length) {
			return;
		}
		//배열이 생성
		int count = 0;
		while(count < 3) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			if(!contains1(arr, random, count)) {
				arr[count] =random;
				count++;
			}
		}
	}
}
