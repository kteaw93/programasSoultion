package level0;

import java.util.Arrays;

public class A로B만들기 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		int result = solution(before, after);
		// System.out.println(result);
	}

	private static int solution(String before, String after) {
		String arr1[] = before.split("");
		String arr2[] = after.split("");
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int cnt = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i].equals(arr2[i])) {
				cnt++;

			}
		}
		if (cnt == before.length()) {
			return 1;
		} else {
			return 0;
		}
	}
}
