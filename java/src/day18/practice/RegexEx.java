package day18.practice;

import java.util.regex.Pattern;

public class RegexEx {

	public static void main(String[] args) {
		String str = "https://www.naver.com";
		String regex = "^https?://[a-zA-Z\\.w]+$";
		boolean result = Pattern.matches(regex, str);
		System.out.println(str + " : " + result);
	}

}
