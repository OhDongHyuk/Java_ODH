package day13.sort;

import java.util.Arrays;
import java.util.Comparator;

import array.Array;

public class ArraySortEx {

	public static void main(String[] args) {
		// 버블 정렬 예제
		int arr[] = {1, 4, 7, 9, 2, 8, 3, 6};
		
		//이중 반복문(한 줄, 옆에 와)
		/*j가 arr.length-1-i인 이유
		 * => n번지 까지이면 n-1번 비교하기 때문
		 * => -i는 정해진 뒤의 자리는 배제하기 위해
		 * => arr[j] > arr[j+1] 에서 부등호 방향이
		 *    오름차순 내림차순을 정함
		 * */
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			Array.printArray(arr);
		}
		Integer arr2[] = {1, 4, 7, 9, 2, 8, 3, 6};
		//Arrays.sort(arr2); //오름차순
		Arrays.sort(arr2, Comparator.reverseOrder()); //내림차순
		for(Integer tmp : arr2) {
			System.out.print(tmp + " ");
		}
	}

}

























