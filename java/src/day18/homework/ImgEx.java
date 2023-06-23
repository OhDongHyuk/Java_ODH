package day18.homework;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ImgEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		String str = sc.next();
		String regex = "(jpg|bmp|png)";
		boolean result = Pattern.matches(regex, str);
		if(result == true) {
			System.out.println(str + " : " + "Image");
		}else if(result != true) {
			System.out.println(str + " : " + "not image");
		}
				
		sc.close();	
	}

}
