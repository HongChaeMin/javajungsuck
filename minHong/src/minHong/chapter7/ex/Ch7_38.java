package minHong.chapter7.ex;

abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다"); }
	
}

interface Fightable {
	void move(int x, int y); // public abstract 생략
	void attack(Fightable f); // public abstract 생략
}

class Fighter extends Unit2 implements Fightable {
	// 오버라이딩 규칙 : 조상(public)보다 접근 제어자가 좁으면 안된다 / 붙어줘야됨!
	@Override
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
	
	@Override
	public void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "]로 이동");
	}
	
	Fightable getFightable() {
		// 인터페이스를 구현한 클래스의 인스턴스를 반환
		return new Fighter();
	}
	
}

public class Ch7_38 {

	public static void main(String[] args) {
		
		Fighter f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter());
		f.stop();
		
		Unit2 u = new Fighter();
		u.move(100, 200);
		u.stop();
		// u.attack(f); Unit2는 attack이 없음!!
		
		Fightable f2 = new Fighter();
		f2.move(100, 200);
		f2.attack(new Fighter());
		// f2.stop(); Fightable은 stop이 없음!!
		
		Fightable f3 = f.getFightable();
	}

}
