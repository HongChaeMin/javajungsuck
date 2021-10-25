package minHong.chapter7.ex;

public class Ch7_24 {

	public static void main(String[] args) {
		
		Car c = new Car();
		// FireEngine f = (FireEngine) c; // 형변환 실행 애러 java.lang.ClassCastException
		// f.water(); // 컴파일 에러 : c는 water를 모름 그런데 받았기 때문에 오류가 나는 거임
		
		// 형변환이 가능한지 ? true : false 
		if (c instanceof FireEngine) { // 실행 X
			FireEngine f = (FireEngine)  c;
			f.water();
		}
		
		
		Car car = null;
		FireEngine fe = new FireEngine(); // 실제 인스턴스가 무엇진지가 중요
		FireEngine fe2 = null;

		fe.water();
		car = fe;	// car = (Car)fe 형변환 생략
		// car.water();  -> Car타입의 참조변수로는 호출 불가
		fe2 = (FireEngine) car; // 자손타입 <- 조상타입, 형변환 생략 불가, 안전XXXXXXXXXXX
		fe2.water(); // 얘는 fe로 형변환을 했기 때문에 오류가 안남
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrrrrrr");
	}
	
	void stop() {
		System.out.println("stop!!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water''''''''");
	}
}