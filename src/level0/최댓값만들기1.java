package level0;

import java.util.Arrays;

public class 최댓값만들기1 {

	public static void main(String[] args) {
		int[] numbers = { 0, 31, 24, 10, 1, 9 };

		int result = solution(numbers);
	}
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
	private static int solution(int[] numbers) {
		Arrays.sort(numbers);

		return numbers[numbers.length-1] * numbers[numbers.length-2];
	}
}
