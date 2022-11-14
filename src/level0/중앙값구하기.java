package level0;

import java.util.Arrays;

public class 중앙값구하기 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 7, 10, 11 };

		int result = solution(array);
		System.out.println(result);
	}

	private static int solution(int[] array) {
		Arrays.sort(array);
		int result = array[array.length / 2];
		return result;
	}
}
