package day11.array;

public class ArrayCopyEx {

	public static void main(String[] args) {
		//배열인 arr1과 arr2는 참조변수(값이 있는 주소 저장)
		int arr1[] = new int[] {1,2,3,4,5};
		int arr2[] = arr1; //값을 알려주는 것이 아니라 주소를 알려줌(arr1과 arr2가 공유)
		
		arr2[0] = 10;//주소가 공유됐기 때문에 한쪽이 수정되면 같이 수정됨
		
		for(int tmp : arr1) {
			System.out.println(tmp);//arr2가 변해서 arr1도 같이 변함
		}

		arr2[0] = 1;//초기값으로 되돌림
		
		arr2 = new int[arr1.length];//복사하기 위한 배열을 생성
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		arr2[0] = 10;//반복문을 통해 복사된 arr2에 0번지를 수정해도 arr1은 안변함
		
		System.out.println("=============");
		for(int tmp : arr1) {
			System.out.println(tmp);//but, 이것도 얉은 복사
		}
		//다른 방법
		int arr3[] = new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);	
		
		arr3[0] = 10;
		
		System.out.println("=============");
		for(int tmp : arr3) {
			System.out.println(tmp);
		}
		
		//3,4,5만 복사하고 싶다
		int arr4[] = new int[arr1.length];
		System.arraycopy(arr1, 2, arr4, 2, 3);	
		
		System.out.println("=============");
		for(int tmp : arr4) {
			System.out.println(tmp);
		}
	}

}
