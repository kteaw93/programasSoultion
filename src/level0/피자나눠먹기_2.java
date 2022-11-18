package level0;

public class 피자나눠먹기_2 {
	public static void main(String[] args) {
		int n = 100;

		int result = solution(n);
		System.out.println(result);
	}

	private static int solution(int n) {
	
		int result = 1;
		while((result*6)%n !=0) {
			result++;
		}
		return result;
	}
}
