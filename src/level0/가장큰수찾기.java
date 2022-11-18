package level0;

import java.util.Arrays;

public class 가장큰수찾기 {

	public static void main(String[] args) {
		int[] array = { 9, 10, 11, 8 };

		int[] result = solution(array);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	private static int[] solution(int[] array) {
		int[] answer = { maxNum(array), cntNaxNum(array, maxNum(array)) };
		return answer;
	}

	private static int maxNum(int[] array) {
		int maxNum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (maxNum < array[i]) {
				maxNum = array[i];
			}
		}
		return maxNum;
	}

	private static int cntNaxNum(int[] array, int maxNum) {
		int maxNumber = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == maxNum) {
				maxNumber = i;
			}
		}
		return maxNumber;
	}
}
