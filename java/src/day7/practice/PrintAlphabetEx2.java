package day7.practice;

public class PrintAlphabetEx2 {

	public static void main(String[] args) {
		char i, ch;
		for( ch = 'a' ; ch <= 'z' ; ch++ ) {
			for( i = 'a' ; i <= ch ; i++ ) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
