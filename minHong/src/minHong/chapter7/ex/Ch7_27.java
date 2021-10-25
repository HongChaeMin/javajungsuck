package minHong.chapter7.ex;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}

}

class Tv extends Product {

	Tv() {
		super(100); // Tv의 값을 100
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) { // Tv, Computer 둘 다 호출 가능
		if (this.money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}

}

public class Ch7_27 {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		
		/*
		 * Product p = new Tv(); b.buy(p);
		 */
		
		// 위에꺼랑 똑같은 거임
		b.buy(new Tv()); // buy(Tv)
		b.buy(new Computer()); // // buy(Computer)
		// 참조변수 없이 직접 쓸 수 있다
		
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다");
		
	}

}
