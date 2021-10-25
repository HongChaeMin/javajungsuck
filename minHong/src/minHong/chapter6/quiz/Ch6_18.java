package minHong.chapter6.quiz;

public class Ch6_18 {

	static boolean isNumber(String str) {
		for(int i = 0; i < str.length(); i++) {
			if (!('0' <= str.charAt(i) && str.charAt(i) <= '9')) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "은 숫자입니까 ? " + isNumber(str));

		str = "123o";
		System.out.println(str + "은 숫자입니까 ? " + isNumber(str));
		
	}

}
