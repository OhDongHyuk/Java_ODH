package day11.array;

public class ArrayCopyEx2 {

	public static void main(String[] args) {
		/*String names[] = new String[5];
	
		names[0] = "Hong";
		names[1] = "Lim";
		
		for(String name : names) {
			System.out.println(name);
		}
		*/
		
		Point pointArr[] = new Point[5];
		pointArr[0] = new Point(0,0);
		pointArr[1] = new Point(10,10);
		pointArr[2] = new Point(3,4);
		pointArr[3] = new Point(6,8);
		pointArr[4] = new Point(-5,-5);
		
		for(Point pt : pointArr) {
			pt.print();
		}
		//복사하기 위한 배열
		Point pointArr2[] = new Point[5];
		//pointArr에 있는 점들을 pointArr2에 복사
	    System.arraycopy(pointArr, 0, pointArr2, 0, pointArr.length);
	    //pointArr2에 있는 첫번째 점을 100,0으로 이동
	    pointArr2[0].move(100, 0);
	    
	    System.out.println("===================");
	    for(Point pt : pointArr) {
	    	pt.print();//얉은 복사
	    }
	    
	    for(int i = 0; i < pointArr.length; i++) {
	    	//pointArr2[i] = pointArr[i];//얉은 복사
	    	pointArr2[i] = new Point(pointArr[i]); //복사 생성자를 이용해서 객체를 새로 만들어야 함 //깊은 복사
	    }
	    
	    pointArr2[0].move(-100, -100);
	    
	    System.out.println("===================");
	    for(Point pt : pointArr) {
	    	pt.print();
	    }
	}
}

class Point{
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//복사 생성자
	public Point(Point pt) {
		x = pt.x;
		y = pt.y;
	}
	
	public void print() {
		System.out.println(x + " , " + y);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}