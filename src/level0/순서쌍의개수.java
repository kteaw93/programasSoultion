package level0;

public class 순서쌍의개수 {

	public static void main(String[] args) {

		int n = 100;
		int result = solution(n);
		System.out.println(result);
	}

	private static int solution(int n) {
		int answer = 0;
		for (int i = 0; i <= n; i++) {

			if (n % i == 0) {
				answer++;
			}

		}
		return answer;
	}

}
