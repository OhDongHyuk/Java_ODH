package day7.practice;

public class PrintAlphabetEx {

	public static void main(String[] args) {
		//a부터 z까지 출력하는 코드를 작성하라.
		
		//방법1
        int i;
        char ch;
        for( i = 0, ch = 'a'; i < 26  ; i++ ) {
        	System.out.print((char)(ch + i));//ch + i는 int형임으로 char로 형변환 해주어야 한다.
        	
        }
	    System.out.println();
	    
        //방법2
        for( ch = 'a'; ch <= 'z'; ch++ ) { //ch++은 char + 1, ch++은 타입은 변화가 없음
        	System.out.print(ch);
        }

	}

}
