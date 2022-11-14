package level0;

public class 재곱근판별하기 {

	public static void main(String[] args) {
		int n = 1434;
		int result = solution(n);
		System.out.println(result);
	}

	private static int solution(int n) {
		if ((int) (Math.sqrt(n)) * (int) (Math.sqrt(n)) == n) {
			return 1;
		} else {
			return 2;
		}
	}
}
