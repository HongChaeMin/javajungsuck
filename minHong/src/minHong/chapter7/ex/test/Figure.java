package minHong.chapter7.ex.test;

public class Figure {

	private String color;
	private String shape;
	private int weigth;
	private int heigth;
	
	Figure(String color, String shape, int weigth, int heigth) {
		if (color.length() < 0 || shape.length() < 0 || weigth < 0 || heigth < 0) return;
		this.color = color;
		this.shape = shape;
		this.weigth = weigth;
		this.heigth = heigth;
	}
	
	public String toString() {
		return "color : " + this.color + ", shape : " + this.shape + ", weigth : " + this.weigth + ", hegith : " + this.heigth;
	}
	
	
	
}
