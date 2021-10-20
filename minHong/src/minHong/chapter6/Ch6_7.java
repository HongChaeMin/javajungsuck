package minHong.chapter6;

public class Ch6_7 {

	public static void main(String[] args) {
	
		// 두 객체 다 다른 저장 공간을 갖음 (다른 주소값)
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 cannel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 cannel값은 " + t2.channel + "입니다.");

		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경했습니다.");
		
		t2 = t1; // 참조 변수 t1의 값을 t2에 저장
		System.out.println("t1의 cannel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 cannel값은 " + t2.channel + "입니다.");
		
		// 객체가 통째로 저장되는게 아니라 주소 값이 바뀌는거였음
		// 그래서 원래 있던 t1의 객체는 사라지고 2개의 리모콘이 생겼다고 생각하면 됨
	}

}