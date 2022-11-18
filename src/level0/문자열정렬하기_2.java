package level0;

import java.util.Arrays;

public class 문자열정렬하기_2 {

	public static void main(String[] args) {

		String my_string = "Boad";
		String result = solution(my_string);
		System.out.println(result);
	}

	private static String solution(String my_string) {
		my_string = my_string.toLowerCase();
		char[] charArray = my_string.toCharArray();
		Arrays.sort(charArray);
		String answer = "";
		for (int i = 0; i < charArray.length; i++) {
			answer +=charArray[i];

		}
		return answer;
	}
}
