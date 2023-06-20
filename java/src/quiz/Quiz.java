package quiz;

public class Quiz {

	public static void main(String[] args) {
		//1번(; 삭제)
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello");
		}
		System.out.println("===============");
		//2번 (<= , i += 2, i)
		for(int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("===============");
		//3번(멤버변수, 생성자, 메소드, 맴버변수, 메소드, 생성자, this)
		
		System.out.println("===============");
		//4번 (static , 배열, 0, length)
		
		System.out.println("===============");
		//5번 (1=>0, <= => <, System.out.println(arr[i]); 추가)
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		//6번 (num => this.num)
		//(public A(){} or new(숫자))
	}
}
