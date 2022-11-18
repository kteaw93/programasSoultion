package level0;

public class 팩토리얼 {
	public static void main(String[] args) {
		int n = 3628800;
		int result = solution(n);
		System.out.println(result);
	}

	private static int solution(int n) {
		int result = 1;
		int temp = 1;
		while(result != n) {
			temp++;
			result = result * temp;
			System.out.println(temp);
		}
		return temp;
	}
}
