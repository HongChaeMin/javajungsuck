package minHong.chapter6.quiz;

public class Ch6_4 {

	public static void main(String[] args) {
		// 6-4
		System.out.println(Exercise6_4.getDistance(1, 1, 2, 2));

		// 6-6
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
	}

}

// 6-4
class Exercise6_4 {
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1)); 
	}
}

// 6-6
class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}
}