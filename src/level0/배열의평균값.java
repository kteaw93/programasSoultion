package level0;

public class 배열의평균값 {

	public static void main(String[] args) {
		int[] numbers = { 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 };

		double result = solution(numbers);
		System.out.println(result);
	}

//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
	private static double solution(int[] numbers) {
		double answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}
		return (double) answer / numbers.length;
	}
}
