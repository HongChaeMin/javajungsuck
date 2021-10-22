package minHong.chapter6.quiz;

public class Ch6_1 {

	public static void main(String[] args) {
		// 6-2
		Student s = new Student("홍채민", 6, 28, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
		
		// 6-3
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}

}

class Student {
	// 6-1
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	// 6-2
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return this.name + ", " +
				this.ban + ", " +
				this.no + ", " +
				this.kor + ", " +
				this.eng + ", " +
				this.math + ", " +
				(this.kor + this.eng + this.math) + ", " +
				(int) (Math.round((this.kor + this.eng + this.math) / 3.0 * 10)) / 10.0;
	}
	
	// 6-3
	int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	float getAverage() {
		return (int) (Math.round((this.kor + this.eng + this.math) / 3.0 * 10)) / 10.0f;
	}
}