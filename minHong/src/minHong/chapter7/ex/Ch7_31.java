package minHong.chapter7.ex;

public class Ch7_31 {

	public static void main(String[] args) {

		Unit[] group = {new Marine(), new Tank(), new Dropship() };
		
		for(Unit u : group) {
			u.move(100, 200);
		}
		
	}

}

abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	void stop() {/* 현재 위치에 정지 */}
}
// 상속을 통해 완성해야 객채 생성가능
class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Marine [x = " + x + ", y = " + y + "]");
	}

	void stimPack() {/* 스팀팩을 사용한다 */}

}

class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Tank [x = " + x + ", y = " + y + "]");		
	}
	
	void changeMode() {/* 공격모드를 변환한다 */}
	
}

class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Dropship [x = " + x + ", y = " + y + "]");		
	}
	
	void load() 	{/* 선택된 대상을 태운다 */}
	void unload() 	{/* 선택된 대생을 내린다 */}
}