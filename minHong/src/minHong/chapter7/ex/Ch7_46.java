package minHong.chapter7.ex;

public class Ch7_46 {

	// 인스턴스 내부 클래스
	class InstanceInner {
		int iv = 100;
		// static int cv = 100;
		final static int CONST = 100; // 상수 ok
	}
	
	// static 내부 클래스
	static class StaticInner {
		int iv = 100;
		static int cv = 200;
	}
	
	// 지역 내부 클래스
	void myMethod() {
		class LocalInner {
			int iv = 300;
			// static int cv = 100;
			final static int CONST = 300; // 상수 ok
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		// System.out.println(LocalInner.CONST); // 에러! 지역 내부 클래스는 메서드 내에서만
	}

}
