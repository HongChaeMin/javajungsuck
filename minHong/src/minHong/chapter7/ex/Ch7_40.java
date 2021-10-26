package minHong.chapter7.ex;

public class Ch7_40 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		// 오버라이딩한 메소드 사용
		c.method1();
		// 상속받은 메소드 사용
		c.method2();
		
		// static
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}

}

class Child3 extends Parent3 implements MyInterface1, MyInterface2 {
	public void method1() {
		System.out.println("method1() in Child3"); // 오버라이딩
	}
}

class Parent3 {
	public void method2() {
		System.out.println("method2() in Parent3");
	}
}

interface MyInterface1 {
	default void method1() {
		System.out.println("method1() in MyInterface1");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface1");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface1");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}