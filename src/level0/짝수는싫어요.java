package level0;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		int n = 15;
		int[] result = solution(n);
	}
//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
	private static int[] solution(int n) {
		int k = 0;
		
		if (n % 2 == 0) { k = n / 2; } 
		else { k = n / 2 + 1; }
		
		int[] answer = new int[k];
		
		for (int i = 0; i < k; i++) {
			answer[i] = 2 * i + 1;
			System.out.println(answer[i]);
		}
		return answer;
	}
}
