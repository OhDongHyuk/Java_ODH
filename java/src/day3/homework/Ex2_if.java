package day3.homework;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		/*성별(M:남성,W:여성)를 입력받아 M이면 남성을, W이면 여성을 출력하는 코드를 작성하세요. if문 이용
          (package : day3.homework, file : Ex2_if) 
          input gender : 
          M
          Are you a women? man
          input gender : 
          W
          Are you a women? woman
        */
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		String gender = sc.nextLine();
		String gender1 = "M";
		String gender2 = "W";
		if(gender.equals(gender1)) {
			System.out.println("Are you a women? man");
		}
        if(gender.equals(gender2)) {
        	System.out.println("Are you a women? woman");
        }
        sc.close();
	}

}
