package minHong.chapter7.quiz;

class Outer {
	// 7-6
	class Inner {
		int iv = 100;
	}
	// 7-7
	static class Inner2 {
		int iv = 200;
	}
}

public class Quiz06 {

	public static void main(String[] args) {
		// 7-6
		Outer outer = new Outer();
		Outer.Inner inner  = outer.new Inner();
		System.out.println(inner.iv);
		
		// 7-7
		Outer.Inner2 inner2 = new Outer.Inner2();
		System.out.println(inner2.iv);
	}

}
