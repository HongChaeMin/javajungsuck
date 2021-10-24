package minHong.chapter6.quiz;

public class Ch6_20 {

	static int max(int[] arr) {
		if (arr == null || arr.length < 1) return -999999;
		
		int max = 0;
		for (int i : arr) {
			if (max < i) {max = i; }
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {}));
	}

}
