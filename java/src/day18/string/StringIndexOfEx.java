package day18.string;

public class StringIndexOfEx {

	public static void main(String[] args) {
		//강사님 방법
		String str = "Hello world!";
		int count = 0;
		String search = "l";
		int index2 = -1;
		//반복 : 찾으면 반복	
		do {
			//Hello world의 l의 위치를 찾음=>lo world에서 l의 위치를 찾음 => o world에서 l의 위치를 찾음
			//d에서 l의 위치를 찾음
			index2 = str.indexOf(search, ++index2);//초기값이 -1이여서 0번지 시작
			//찾았으면 개수를 증가
			if(index2 != -1) {
				count++;
			}
		}while(index2 != -1);	
		//개수를 출력
		System.out.println(str + " : " + search + " : " + count);
		System.out.println("=================");
		
		
		//내 방법
		String str1 = "Hello world!";
		int count1 = 0;
		boolean index = str1.contains("l"); //l이 있는지 없는지 확인 후 있으면 count++
		if(index != false) {
			count1++;
		}
		for(int i = 0; i < str1.length(); i++) {//첫번째 l 뒤에 나머지 l이 있는지 확인 있으면 count++
			int index1 = str1.indexOf("l", i);
			if(index1 != -1 && str1.indexOf("l",i+1) > str1.indexOf("l",i)) {
				count1++;
			}
		}
		System.out.println(count1);
		

	}

}
