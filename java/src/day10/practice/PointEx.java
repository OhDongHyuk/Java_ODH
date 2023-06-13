package day10.practice;

public class PointEx {

	public static void main(String[] args) {
		MousePoint1 mp = new MousePoint1();
		mp.print();

	}

}

class MousePoint1{
	private double Ya, Xa;

	public MousePoint1(double Ya, double Xa) {
		this.Ya = Ya;
		this.Xa = Xa;
	}
	public MousePoint1() {
		this(0,0);
	}
	public void print() {
		System.out.println("" + Ya + "," + Xa);
	}
}