package level0;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 1234;
		int result = solution(n);
		System.out.println(result);
	}
	// 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

	private static int solution(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
}
