package minHong.chapter7.quiz;

class Product {
	int price;
	int bonusPoint;
	
	// 1.
	Product() {}
	
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}	
}

class Tv extends Product {
	/* 부모생성자를 호출 안해서 에러나는 것 반드시 호출 해주어야함
	 * 아니면 디폴트 생성자 만들어줘야함
	 * Tv() {
	 * 
	 * }
	 */
	
	// 2.
	Tv() {
		super(200);
	}
	
	public String toString() {
		return "Tv";
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		Tv t = new Tv();
	}
	
}
