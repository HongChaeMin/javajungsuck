package minHong.chapter6.ex;

class MyMath2 {
	long a, b;

	// 인스턴스 변수를 이용해서 작업해 매개변수 필요 X
	long add()		{ return a + b; }	// a, b = iv
	long subtract()	{ return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }
	
	// 인수턴스 변수와 간계가 없어
	static long add(long a, long b)		 { return a + b; }
	static long subtract(long a, long b) { return a - b; }
	static long multiply(long a, long b) { return a * b; }
	static double divide(long a, long b) { return a / b; }
	
	// 차이점 
	// - static이 붙냐, 안붙냐
	// - iv, lv 사용
}

public class Ch6_27 {

	public static void main(String[] args) {
		
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));

		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100;
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
	}

}
