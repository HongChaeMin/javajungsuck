package minHong.chapter6;

public class Ch6_12 {

	public static void main(String[] args) {
		
		// 클래스 변수는 객체생성 없이 '클래스이름.클래스변수'로 직접 사용이 가능하다
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
		// iv값 변경
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		// iv값 변경
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")입니다.");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")입니다.");
		
		System.out.println("Card의 width와 heigth를 각각 50, 80으로 변경합니다.");
		// cv값 변경
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")입니다.");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")입니다.");
		
	}

}

class Card {
	// 개별 속성 : iv
	String kind; //무늬
	int number; // 숫자
	
	// 공통 속성 : cv
	static int width = 100; // 폭
	static int height = 250; // 높이
}
