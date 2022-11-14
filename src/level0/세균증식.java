package level0;

public class 세균증식 {
	
	public static void main(String[] args) {
		int n = 7;
		int t = 15;
		int result = solution(n,t);
		System.out.println(result);
	}

	private static int solution(int n, int t) {
		int answer = n;
		for(int i = 1; i<=t;i++) {
			answer =2 *answer;
		}
		return answer;
	}
}
