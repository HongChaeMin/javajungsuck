package minHong.chapter6;

public class Ch6_6 {

	public static void main(String[] args) {
		Tv t;				// 참조 변수 t를 선언, 인스턴스 생성을 안했기때문에 값X
		t = new Tv();		// 메모리의 빈 공간에 인스턴스 생성 / t는 인스턴스 주소값을 가지고 있음
							// 이때 멤버 변수는 각 자료형에 해당하는 기본값으로 초기화
		t.channel = 7;		// t에 저장된 주소에 있는 인스턴스의 멤버변수 channel에 7저장
		t.channelDown();	// 인스턴스의 멤버변수 channel의 값을 1감소시킴
		System.out.println("현재 채널은 " + t.channel + "번 입니다.");
	}

}

class Tv {
	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}
