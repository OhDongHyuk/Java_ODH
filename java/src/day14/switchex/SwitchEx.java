package day14.switchex;

public class SwitchEx {

	public static void main(String[] args) {
		/* switch문에서 case에 변수를 선언하면 다른 case에서 선언할수
		 * 없다는걸 보여주는 예제
		 * case문에 break가 선택이지 필수가 아님
		 * => break가 없는 경우 다음 case의 실행문으로 이동
		 */
		int menu = 1;
		
		switch(menu) {
			
		case 1:
			String title = "제목1";
			System.out.println(title);
			break;//문법적으로 break가 필수가 아님, 그래서 다른 case에서 사용한 변수명은 다른 case에서 사용 불가
		case 2:
			String title2 = "제목2";//title이 case 1에 있어서 선언이 안됩니다. => 그래서 title에서 title2로 바꿈
			System.out.println(title2);//만약 case 1을 거치지 않고 오는 경우 title이란 변수가 실행이 안되기 때문에 에러 발생
			                          //=> 여기도 마찬가지로 title을 title2로 변경   
			break;
		case 3:
			break;
		}
	}

}
