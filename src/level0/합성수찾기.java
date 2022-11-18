package level0;

public class 합성수찾기 {
	
	public static void main(String[] args) {
		int n = 15;
		int result =solution(n);
		System.out.println(result);
	}

	private static int solution(int n) {
		int result = 0;
		for(int i = 2; i <=n ; i++) {
			for(int j = 2; j<i ; j++) {
				if(i%j == 0) {
					result++;
					break;
				}
			}
		}
		return result;
	}
}
