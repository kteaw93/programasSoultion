package level0;

public class 직각삼각형출력하기 {
	public static void main(String[] args) {
		int n = 3;
		String[] result = solution(n);
	}

	private static String[] solution(int n) {

		for(int i = 0 ;i <n; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return null;
	}
}
