package level0;

import java.util.Arrays;

public class 문자열정렬하기_1 {
	public static void main(String[] args) {
		String my_string = "abcde0";
		int[] result = solution(my_string);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);

		}
	}

	private static int lengthArr(String[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {

			char check = arr[i].charAt(0);
			if (check >= 48 && check < 58) {
				result++;
			}
		}
		return result;
	}

	private static int[] solution(String my_string) {
		String[] arr = my_string.split("");
		int[] result = new int[lengthArr(arr)];
		int resultNum = 0;
		for (int i = 0; i < arr.length; i++) {

			char check = arr[i].charAt(0);
			if (check > 48 && check < 58) {
				result[resultNum] = Integer.parseInt(arr[i]);
				resultNum++;
			}
		}
		Arrays.sort(result);
		return result;
	}

}
